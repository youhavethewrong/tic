package info.youhavethewrong.tic;

public class Tic {

	private static final BigDecimal MM_TO_INCHES = 0.039370
	private static final int FEET_TO_MILE = 5280
	private static final int SECONDS_TO_MINUTE = 60

	public double getGearedRotation(rotation, gearRatio) {
		rotation/gearRatio
	}

	public double getWheelRotationFromEngineRotation(engineRotation, transRatio, axleRatio) {
		engineRotation/transRatio/axleRatio
	}

	public double getLengthOfOneWheelRotation(sectionWidth, wheelSize) {
		(sectionWidth*MM_TO_INCHES*2+wheelSize)*Math.PI/12
	}

	public double getVehicleSpeed(engineRotation, gearRatio, finalRatio, sectionWidth, wheelSize) {
		getWheelRotationFromEngineRotation(engineRotation, gearRatio, finalRatio) * getLengthOfOneWheelRotation(sectionWidth, wheelSize) * SECONDS_TO_MINUTE / FEET_TO_MILE
	}
}
