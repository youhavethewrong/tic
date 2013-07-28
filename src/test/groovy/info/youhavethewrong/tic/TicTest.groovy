package info.youhavethewrong.tic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TicTest {

	private static final BigDecimal CALCULATION_DELTA = 0.001

	private Tic tic;

	@Before
	public void setUp() {
		tic = new Tic();
	}

	@Test
	public void shouldCalcTransRotationFromEngineRotation() {
		double gearRatio = 3.166;
		double engineRotation = 3000;

		assertEquals(947.5679090334808,
				tic.getGearedRotation(engineRotation, gearRatio), CALCULATION_DELTA);
	}

	@Test
	public void shouldCalcWheelRotationGivenEngineRotation() {
		double gearRatio =  0.738
		double finalRatio = 4.444
		double engineRotation = 3000

		assertEquals(914.7256189033537,
				tic.getWheelRotationFromEngineRotation(engineRotation, 0.738, 4.444), CALCULATION_DELTA);
	}

	@Test
	public void shouldCalcLengthOfOneWheelRotation() {
		double sectionWidth = 205*0.55
		double wheelSize = 16
		assertEquals(6.513028152707033, tic.getLengthOfOneWheelRotation(sectionWidth, wheelSize), CALCULATION_DELTA)
	}

	@Test
	public void shouldCalcVehicleSpeed() {
		double sectionWidth = 205*0.55
		double wheelSize = 16
		double gearRatio =  0.738
		double finalRatio = 4.444
		double engineRotation = 3000

		assertEquals(67.7003830445444, tic.getVehicleSpeed(engineRotation, gearRatio, finalRatio, sectionWidth, wheelSize), CALCULATION_DELTA)
	}
}
