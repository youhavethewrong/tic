package info.youhavethewrong.tic;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TransmissionTest {

	private static final double CALCULATION_DELTA = 0.001;

	private Transmission trans;
	private Tic tic;

	@Before
	public void setUp() {
		List<Double> transRatios = new LinkedList<Double>();
		// Subaru TY754VB1BA 3.083 2.062 1.545 1.151 0.825 4.444 F,G (RA)
		transRatios.add(3.083);
		transRatios.add(2.062);
		transRatios.add(1.545);
		transRatios.add(1.151);
		transRatios.add(0.825);

		double finalRatio = 4.444;

		trans = new Transmission(transRatios, finalRatio);
		tic = new Tic();
	}

	@Test
	public void shouldGetAxleSpeedAt3000RpmForEachGear() {
		double engineRotation = 3000;

		assertEquals(218.964, tic.getWheelRotationFromEngineRotation(
				engineRotation, trans.getTransRatios().get(0),
				trans.getAxleRatio()), CALCULATION_DELTA);
		assertEquals(327.384, tic.getWheelRotationFromEngineRotation(
				engineRotation, trans.getTransRatios().get(1),
				trans.getAxleRatio()), CALCULATION_DELTA);
		assertEquals(436.936, tic.getWheelRotationFromEngineRotation(
				engineRotation, trans.getTransRatios().get(2),
				trans.getAxleRatio()), CALCULATION_DELTA);
		assertEquals(586.505, tic.getWheelRotationFromEngineRotation(
				engineRotation, trans.getTransRatios().get(3),
				trans.getAxleRatio()), CALCULATION_DELTA);
		assertEquals(818.264, tic.getWheelRotationFromEngineRotation(
				engineRotation, trans.getTransRatios().get(4),
				trans.getAxleRatio()), CALCULATION_DELTA);
	}
}