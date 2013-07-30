package info.youhavethewrong.tic;

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

	public TicResource() {
		smt = new SubaruManualTransmissions();
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
}
