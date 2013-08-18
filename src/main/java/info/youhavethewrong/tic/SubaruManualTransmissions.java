package info.youhavethewrong.tic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class SubaruManualTransmissions {
	private Map<String, Transmission> transmissions = new HashMap<String, Transmission>();
	private Map<String, Wheel> wheels = new HashMap<String, Wheel>();

	public SubaruManualTransmissions() {
		populateTransmissions();
		populateWheels();
	}
	
	private void populateTransmissions() {
		//JDM 5MT from http://www.subarujdm.com/JDM_Subaru_Impreza_WRX_STi_Manual_transmission_ratio_chart.html
		transmissions.put("TY752VB1AA",new Transmission(new LinkedList<Double>(Arrays.asList(3.545,2.111,1.448,1.088,0.825)),4.111, 1.0, "Subaru JDM 5MT"));
		transmissions.put("TY752VB1BA",new Transmission(new LinkedList<Double>(Arrays.asList(3.545,2.111,1.448,1.088,0.825)),4.111, 1.0, "Subaru JDM 5MT"));
		transmissions.put("TY752VB1CA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.333,1.750,1.354,0.871)),4.111, 1.0, "Subaru JDM 5MT"));
		transmissions.put("TY752VB2AA",new Transmission(new LinkedList<Double>(Arrays.asList(3.545,2.111,1.448,1.088,0.825)),4.111, 1.0, "Subaru JDM 5MT"));
		transmissions.put("TY752VB2CA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.333,1.750,1.354,0.871)),4.111, 1.0, "Subaru JDM 5MT"));
		transmissions.put("TY752VB2DA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.062,1.448,1.088,0.825)),4.111, 1.0, "Subaru JDM 5MT"));
		transmissions.put("TY752VB3AA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.062,1.448,1.008,0.825)),4.111, 1.0, "Subaru JDM 5MT"));
		transmissions.put("TY752VB3BA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.333,1.750,1.354,0.972)),4.111, 1.0, "Subaru JDM 5MT"));
		transmissions.put("TY752VB3CA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.062,1.448,1.008,0.825)),4.111, 1.0, "Subaru JDM 5MT"));
		transmissions.put("TY752VB3DA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.333,1.750,1.354,0.972)),4.111, 1.0, "Subaru JDM 5MT"));
		transmissions.put("TY752VB3EA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.333,1.750,1.354,0.972)),3.900, 1.0, "Subaru JDM 5MT"));
		transmissions.put("TY752VB3FA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.062,1.448,1.088,0.825)),4.111, 1.0, "Subaru JDM 5MT"));
		transmissions.put("TY752VB4AA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.062,1.448,1.088,0.825)),4.111, 1.0, "Subaru JDM 5MT"));
		transmissions.put("TY752VB4BA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.333,1.750,1.354,0.972)),3.900, 1.0, "Subaru JDM 5MT"));
		transmissions.put("TY752VB4CA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.333,1.750,1.354,0.972)),3.900, 1.0, "Subaru JDM 5MT"));
		transmissions.put("TY752VB5BA",new Transmission(new LinkedList<Double>(Arrays.asList(3.083,2.062,1.545,1.151,0.825)),4.444, 1.0, "Subaru JDM 5MT"));
		transmissions.put("TY752VB5CA",new Transmission(new LinkedList<Double>(Arrays.asList(3.083,2.062,1.545,1.151,0.825)),4.444, 1.0, "Subaru JDM 5MT"));
		transmissions.put("TY752VBAAA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.062,1.448,1.088,0.825)),4.111, 1.0, "Subaru JDM 5MT"));
		transmissions.put("TY752VBCAA",new Transmission(new LinkedList<Double>(Arrays.asList(3.166,1.882,1.296,0.972,0.738)),4.444, 1.0, "Subaru JDM 5MT"));
		transmissions.put("TY752VBCBA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.062,1.448,1.088,0.825)),4.111, 1.0, "Subaru JDM 5MT"));
		transmissions.put("TY754VB1BA",new Transmission(new LinkedList<Double>(Arrays.asList(3.083,2.062,1.545,1.151,0.825)),4.444, 1.0, "Subaru JDM 5MT"));
		transmissions.put("TY754VB1CA",new Transmission(new LinkedList<Double>(Arrays.asList(3.083,2.062,1.545,1.151,0.825)),4.444, 1.0, "Subaru JDM 5MT"));
		transmissions.put("TY754VB1EA",new Transmission(new LinkedList<Double>(Arrays.asList(3.083,2.062,1.545,1.151,0.825)),4.444, 1.0, "Subaru JDM 5MT"));
		transmissions.put("TY754VBAAA",new Transmission(new LinkedList<Double>(Arrays.asList(3.166,1.882,1.296,0.972,0.738)),4.444, 1.0, "Subaru JDM 5MT"));
		transmissions.put("TY754VBACA",new Transmission(new LinkedList<Double>(Arrays.asList(3.166,1.882,1.296,0.972,0.738)),4.444, 1.0, "Subaru JDM 5MT"));
		transmissions.put("S201",new Transmission(new LinkedList<Double>(Arrays.asList(3.083,2.062,1.545,1.151,0.825)),4.444, 1.0, "Subaru Impreza S201 STi 5MT"));

		//JDM 6MT from http://www.subarujdm.com/JDM_Subaru_Impreza_WRX_STi_Manual_transmission_ratio_chart.html
		transmissions.put("TY856WB1AA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900, 1.0, "Subaru JDM 6MT"));
		transmissions.put("TY856WB1CA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900, 1.0, "Subaru JDM 6MT"));
		transmissions.put("TY856WB1BA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900, 1.0, "Subaru JDM 6MT"));
		transmissions.put("TY856WB2GA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900, 1.0, "Subaru JDM 6MT"));
		transmissions.put("TY856WB2DA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900, 1.0, "Subaru JDM 6MT"));
		transmissions.put("TY856WB3AA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900, 1.0, "Subaru JDM 6MT"));
		transmissions.put("TY856WB3KA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900, 1.0, "Subaru JDM 6MT"));
		transmissions.put("TY856WB3JA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900, 1.0, "Subaru JDM 6MT"));
		transmissions.put("TY856WB4AA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900, 1.0, "Subaru JDM 6MT"));
		transmissions.put("TY856WB4KA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900, 1.0, "Subaru JDM 6MT"));
		transmissions.put("TY856WB4JA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900, 1.0, "Subaru JDM 6MT"));
		transmissions.put("TY856WB6CA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900, 1.0, "Subaru JDM 6MT"));
		transmissions.put("TY856WB6KA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900, 1.0, "Subaru JDM 6MT"));
		transmissions.put("TY856WB6JA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900, 1.0, "Subaru JDM 6MT"));
		transmissions.put("TY856WH3MA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,0.971,0.756)),3.900, 1.0, "Subaru JDM 6MT"));
		transmissions.put("TY856WH4MA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,0.971,0.756)),3.900, 1.0, "Subaru JDM 6MT"));
		transmissions.put("TY856WW6MA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,0.971,0.756)),3.900, 1.0, "Subaru JDM 6MT"));
		transmissions.put("S202",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900, 1.0, "Subaru Impreza S202 STi 6MT"));
		transmissions.put("2003SPECCL",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900, 1.0, "Subaru Impreza WRX STi spec C Limited 2003 6MT"));
		transmissions.put("2005SPECCV",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900, 1.0, "Subaru Impreza WRX STI spec C V-Limited 2005 6MT"));
	}
	
	private void populateWheels() {
		wheels.put("205w50r16", new Wheel(205d, 0.50, 16d));
		wheels.put("205w55r16", new Wheel(205d, 0.55, 16d));
		wheels.put("225w45r17", new Wheel(225d, 0.45, 17d));
		wheels.put("235w45r17", new Wheel(235d, 0.45, 17d));
	}
	
	public Map<String, Wheel> getWheels() {
		return wheels;
	}
	
	public Wheel lookupWheelByCode(String wheelCode) {
		return wheels.get(wheelCode);
	}

	public Map<String, Transmission> getTransmissions() {
		return transmissions;
	}

	public void setTransmissions(Map<String, Transmission> transmissions) {
		this.transmissions = transmissions;
	}

	public Transmission lookupTransmissionByCode(String transmissionCode) {
		return transmissions.get(transmissionCode);
	}
}
