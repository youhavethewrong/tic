package info.youhavethewrong.tic;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;

public class SubaruManualTransmissions {
	private Map<String, Transmission> transmissions = new HashMap<String, Transmission>();

	public SubaruManualTransmissions() {
		//JDM 5MT from http://www.subarujdm.com/JDM_Subaru_Impreza_WRX_STi_Manual_transmission_ratio_chart.html
		transmissions.put("TY752VB1AA",new Transmission(new LinkedList<Double>(Arrays.asList(3.545,2.111,1.448,1.088,0.825)),4.111));
		transmissions.put("TY752VB1BA",new Transmission(new LinkedList<Double>(Arrays.asList(3.545,2.111,1.448,1.088,0.825)),4.111));
		transmissions.put("TY752VB1CA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.333,1.750,1.354,0.871)),4.111));
		transmissions.put("TY752VB2AA",new Transmission(new LinkedList<Double>(Arrays.asList(3.545,2.111,1.448,1.088,0.825)),4.111));
		transmissions.put("TY752VB2CA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.333,1.750,1.354,0.871)),4.111));
		transmissions.put("TY752VB2DA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.062,1.448,1.088,0.825)),4.111));
		transmissions.put("TY752VB3AA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.062,1.448,1.008,0.825)),4.111));
		transmissions.put("TY752VB3BA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.333,1.750,1.354,0.972)),4.111));
		transmissions.put("TY752VB3CA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.062,1.448,1.008,0.825)),4.111));
		transmissions.put("TY752VB3DA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.333,1.750,1.354,0.972)),4.111));
		transmissions.put("TY752VB3EA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.333,1.750,1.354,0.972)),3.900));
		transmissions.put("TY752VB3FA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.062,1.448,1.088,0.825)),4.111));
		transmissions.put("TY752VB4AA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.062,1.448,1.088,0.825)),4.111));
		transmissions.put("TY752VB4BA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.333,1.750,1.354,0.972)),3.900));
		transmissions.put("TY752VB4CA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.333,1.750,1.354,0.972)),3.900));
		transmissions.put("TY752VB5BA",new Transmission(new LinkedList<Double>(Arrays.asList(3.083,2.062,1.545,1.151,0.825)),4.444));
		transmissions.put("TY752VB5CA",new Transmission(new LinkedList<Double>(Arrays.asList(3.083,2.062,1.545,1.151,0.825)),4.444));
		transmissions.put("TY752VBAAA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.062,1.448,1.088,0.825)),4.111));
		transmissions.put("TY752VBCAA",new Transmission(new LinkedList<Double>(Arrays.asList(3.166,1.882,1.296,0.972,0.738)),4.444));
		transmissions.put("TY752VBCBA",new Transmission(new LinkedList<Double>(Arrays.asList(3.454,2.062,1.448,1.088,0.825)),4.111));
		transmissions.put("TY754VB1BA",new Transmission(new LinkedList<Double>(Arrays.asList(3.083,2.062,1.545,1.151,0.825)),4.444));
		transmissions.put("TY754VB1CA",new Transmission(new LinkedList<Double>(Arrays.asList(3.083,2.062,1.545,1.151,0.825)),4.444));
		transmissions.put("TY754VB1EA",new Transmission(new LinkedList<Double>(Arrays.asList(3.083,2.062,1.545,1.151,0.825)),4.444));
		transmissions.put("TY754VBAAA",new Transmission(new LinkedList<Double>(Arrays.asList(3.166,1.882,1.296,0.972,0.738)),4.444));
		transmissions.put("TY754VBACA",new Transmission(new LinkedList<Double>(Arrays.asList(3.166,1.882,1.296,0.972,0.738)),4.444));

		//JDM 6MT from http://www.subarujdm.com/JDM_Subaru_Impreza_WRX_STi_Manual_transmission_ratio_chart.html
		transmissions.put("TY856WB1AA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900));
		transmissions.put("TY856WB1CA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900));
		transmissions.put("TY856WB1BA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900));
		transmissions.put("TY856WB2GA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900));
		transmissions.put("TY856WB2DA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900));
		transmissions.put("TY856WB3AA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900));
		transmissions.put("TY856WB3KA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900));
		transmissions.put("TY856WB3JA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900));
		transmissions.put("TY856WB4AA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900));
		transmissions.put("TY856WB4KA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900));
		transmissions.put("TY856WB4JA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900));
		transmissions.put("TY856WB6CA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900));
		transmissions.put("TY856WB6KA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900));
		transmissions.put("TY856WB6JA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,1.062,0.842)),3.900));
		transmissions.put("TY856WH3MA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,0.971,0.756)),3.900));
		transmissions.put("TY856WH4MA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,0.971,0.756)),3.900));
		transmissions.put("TY856WW6MA",new Transmission(new LinkedList<Double>(Arrays.asList(3.636,2.375,1.761,1.346,0.971,0.756)),3.900));
	}
}
