package info.youhavethewrong.tic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Tic {

	private static final Log log = LogFactory.getLog(Tic.class);

	private static final double MM_TO_INCHES = 0.039370
	private static final double FEET_TO_MILE = 5280d
	private static final double MINUTES_TO_HOUR = 60d

	public double getGearedRotation(rotation, gearRatio) {
		rotation/gearRatio
	}

	public double getWheelRotationFromEngineRotation(double engineRotation, double transRatio, double centerRatio, double axleRatio) {
		engineRotation/transRatio/centerRatio/axleRatio
	}

	public double getLengthOfOneWheelRotation(double sectionWidth, double wheelSize) {
		(sectionWidth*MM_TO_INCHES*2+wheelSize)*Math.PI/12d
	}

	public double getVehicleSpeed(double engineRotation, double transRatio, double centerRatio, double axleRatio, double sectionWidth, double wheelSize) {
		double wheelRpm = getWheelRotationFromEngineRotation(engineRotation, transRatio, centerRatio, axleRatio)
		double wheelRotationLength = getLengthOfOneWheelRotation(sectionWidth, wheelSize)

	    (wheelRpm * wheelRotationLength * MINUTES_TO_HOUR) / FEET_TO_MILE
	}
}
