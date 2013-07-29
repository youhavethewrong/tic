package info.youhavethewrong.tic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SubaruManualTransmissionsTest {

	private def smt

	@Before
	public void setUp() throws Exception {
		smt = new SubaruManualTransmissions();
	}

	@Test
	public void dumpTests() {
		def tic = new Tic()
		for (String key : smt.transmissions ) {
			println "Dumping RPMS for trans ${key}"
			for (double ratio : smt.transmissions.get(key)) {
				println tic.getWheelRotationFromEngineRotation(3000, ratio, smt.transmissions.get(key).axleRatio)
			}
		}
	}
}
