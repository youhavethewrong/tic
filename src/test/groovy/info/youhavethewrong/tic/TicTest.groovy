package info.youhavethewrong.tic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TicTest {

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
				tic.getTransRotation(engineRotation, gearRatio));
	}
}
