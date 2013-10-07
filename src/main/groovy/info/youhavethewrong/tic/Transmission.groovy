package info.youhavethewrong.tic;

import java.util.List;

public class Transmission {

	private double axleRatio
	private double centerRatio
	private String notes
	private List<Double> transRatios

	/**
	 * A constructor that fills out the most common things required to model a
	 * Subaru transmission, center diff, and front and rear diffs.
	 * @param transRatios
	 * @param axleRatio
	 */
	public Transmission(List<Double> transRatios, double axleRatio) {
		this.transRatios = transRatios
		this.axleRatio = axleRatio
		this.centerRatio = 1.0
		this.notes = "Subaru ${transRatios.size}MT"
	}

	public Transmission(List<Double> transRatios, double axleRatio, double centerRatio, String notes) {
		this.transRatios = transRatios
		this.axleRatio = axleRatio
		this.centerRatio = centerRatio
		this.notes = notes
	}

	public List<Double> getTransRatios() {
		transRatios
	}

	public void setTransRatios(List<Double> transRatios) {
		this.transRatios = transRatios
	}

	public double getAxleRatio() {
		axleRatio
	}

	public void setAxleRatio(double axleRatio) {
		this.axleRatio = axleRatio
	}

	public double getCenterRatio() {
		centerRatio
	}

	public void setCenterRatio(double centerRatio) {
		this.centerRatio = centerRatio
	}

	public String getNotes() {
		notes
	}

	public void setNotes(String notes) {
		this.notes = notes
	}
}
