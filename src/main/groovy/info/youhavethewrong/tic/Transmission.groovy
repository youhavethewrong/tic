package info.youhavethewrong.tic;

import java.util.List;

public class Transmission {

	private List<Double> transRatios;
	private double axleRatio;

	public Transmission(List<Double> transRatios, double axleRatio) {
		this.transRatios = transRatios;
		this.axleRatio = axleRatio;
	}

	public List<Double> getTransRatios() {
		return transRatios;
	}

	public void setTransRatios(List<Double> transRatios) {
		this.transRatios = transRatios;
	}

	public double getAxleRatio() {
		return axleRatio;
	}

	public void setAxleRatio(double axleRatio) {
		this.axleRatio = axleRatio;
	}
}
