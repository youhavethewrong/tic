package info.youhavethewrong.tic;

import static org.junit.Assert.*;

import org.junit.*;

public class SubaruManualTransmissionsTest {

	private def smt

	@Before
	public void setUp() throws Exception {
		smt = new SubaruManualTransmissions();
	}

	@Ignore
	public void dumpTests() {
		def tic = new Tic()
		for (String key : smt.transmissions.keySet() ) {
			println "Dumping RPMS for trans ${key}"
			for (double ratio : smt.transmissions.get(key).transRatios) {
				println "\t"+tic.getWheelRotationFromEngineRotation(3000, ratio, smt.transmissions.get(key).axleRatio)
			}
		}
	}
}
