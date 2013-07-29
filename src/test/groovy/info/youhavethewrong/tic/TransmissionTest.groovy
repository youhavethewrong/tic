package info.youhavethewrong.tic;

import static org.junit.Assert.*

import org.junit.*

public class TransmissionTest {

	private static final BigDecimal CALCULATION_DELTA = 0.001

	def trans
	def tic

	@Before
	public void setUp() {
		List<Double> transRatios = new LinkedList<Double>();
		//Subaru TY754VB1BA 	3.083 	2.062 	1.545 	1.151 	0.825 	4.444 	F,G (RA)
		transRatios.add(3.083)
		transRatios.add(2.062)
		transRatios.add(1.545)
		transRatios.add(1.151)
		transRatios.add(0.825)

		double finalRatio = 4.444

		trans = new Transmission(transRatios, finalRatio)
		tic = new Tic()
	}

	@Test
	public void shouldGetAxleSpeedAt3000RpmForEachGear() {
		def engineRotation = 3000

		assertEquals(218.964, tic.getWheelRotationFromEngineRotation(engineRotation, trans.transRatios.get(0), trans.axleRatio), CALCULATION_DELTA)
		assertEquals(327.384, tic.getWheelRotationFromEngineRotation(engineRotation, trans.transRatios.get(1), trans.axleRatio), CALCULATION_DELTA)
		assertEquals(436.936, tic.getWheelRotationFromEngineRotation(engineRotation, trans.transRatios.get(2), trans.axleRatio), CALCULATION_DELTA)
		assertEquals(586.505, tic.getWheelRotationFromEngineRotation(engineRotation, trans.transRatios.get(3), trans.axleRatio), CALCULATION_DELTA)
		assertEquals(818.264, tic.getWheelRotationFromEngineRotation(engineRotation, trans.transRatios.get(4), trans.axleRatio), CALCULATION_DELTA)
	}
}