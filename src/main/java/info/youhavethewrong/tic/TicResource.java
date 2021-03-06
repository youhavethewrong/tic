package info.youhavethewrong.tic;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

import org.apache.commons.collections.ListUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Path("/")
public class TicResource {

	private final Log log = LogFactory.getLog(TicResource.class);
	@SuppressWarnings("unchecked")
	private final Transmission blankTransmission = new Transmission(
			ListUtils.EMPTY_LIST, 0.00);

	private SubaruManualTransmissions smt;
	private Tic calc;

	public TicResource() {
		smt = new SubaruManualTransmissions();
		calc = new Tic();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{transmissionCode}")
	public Transmission getTransmissionByCode(
			@PathParam("transmissionCode") String transmissionCode) {
		Transmission byCode = blankTransmission;

		try {
			byCode = smt.lookupTransmissionByCode(transmissionCode);
			if (byCode == null) {
				throw new Exception("Couldn't find " + transmissionCode
						+ " in transmissions.");
			}
		} catch (Exception e) {
			log.error(e);
			throw new WebApplicationException(Status.BAD_REQUEST);
		}

		return byCode;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("trans/all")
	public List<String> getTransmissionList() {

		LinkedList<String> trans = new LinkedList<String>(smt
				.getTransmissions().keySet());
		Collections.sort(trans);

		return trans;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("wheels/all")
	public List<String> getWheelList() {

		LinkedList<String> wheels = new LinkedList<String>(smt.getWheels().keySet());
		Collections.sort(wheels);

		return wheels;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{transmissionCode}/{rpm}")
	public List<Double> getTransRotationsFromEngineSpeed(
			@PathParam("transmissionCode") String transmissionCode,
			@PathParam("rpm") String rpm) {

		List<Double> rotations = new LinkedList<Double>();
		Transmission transmission = smt
				.lookupTransmissionByCode(transmissionCode);

		for (Double ratio : transmission.getTransRatios()) {
			rotations.add(calc.getGearedRotation(Double.valueOf(rpm), ratio));
		}

		return rotations;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{transmissionCode}/{rpm}/{tireSize}")
	public List<Double> getWheelRotationsFromEngineSpeed(
			@PathParam("transmissionCode") String transmissionCode,
			@PathParam("rpm") String rpm, @PathParam("tireSize") String tireSize) {

		List<Double> speeds = new LinkedList<Double>();

		Wheel wheel = smt.lookupWheelByCode(tireSize);

		Transmission transmission = smt.lookupTransmissionByCode(transmissionCode);

		for (Double ratio : transmission.getTransRatios()) {
			speeds.add(calc.getVehicleSpeed(Double.parseDouble(rpm), ratio,
					transmission.getCenterRatio(), transmission.getAxleRatio(),
					wheel.getAspectRatio()*wheel.getNominalSectionWidth(), wheel.getWheelDiameter()));
		}

		return speeds;
        }

        @GET
        @Produces(MediaType.APPLICATION_JSON)
        @Path("{transmissionCode}/{centerRatio}/{axleRatio}/{rpm}/{tireSize}")
        public List<Double> getVehicleSpeedFromCustomFigures(
			@PathParam("transmissionCode") String transmissionCode,
			@PathParam("centerRatio") String centerRatio,
			@PathParam("axleRatio") String axleRatio,
			@PathParam("rpm") String rpm, @PathParam("tireSize") String tireSize) {
                List<Double> speeds = new LinkedList<Double>();

		Wheel wheel = smt.lookupWheelByCode(tireSize);

		Transmission transmission = smt.lookupTransmissionByCode(transmissionCode);

		for (Double ratio : transmission.getTransRatios()) {
			speeds.add(calc.getVehicleSpeed(Double.parseDouble(rpm), ratio,
					Double.parseDouble(centerRatio), Double.parseDouble(axleRatio),	
					wheel.getAspectRatio()*wheel.getNominalSectionWidth(),
					wheel.getWheelDiameter()));
		}

		return speeds;
	}
}
