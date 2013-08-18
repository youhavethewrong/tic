package info.youhavethewrong.tic

public class Wheel {

	private double wheelDiameter
	private double nominalSectionWidth
	private double aspectRatio
	private String notes = ""

	public Wheel(double nominalSectionWidth,
	double aspectRatio, double wheelDiameter) {
		this.wheelDiameter = wheelDiameter
		this.nominalSectionWidth = nominalSectionWidth
		this.aspectRatio = aspectRatio
	}

	public Wheel(double nominalSectionWidth,
	double aspectRatio, double wheelDiameter, String notes) {
		this.wheelDiameter = wheelDiameter
		this.nominalSectionWidth = nominalSectionWidth
		this.aspectRatio = aspectRatio
		this.notes = notes
	}

	public double getWheelDiameter() {
		wheelDiameter
	}

	public void setWheelDiameter(double wheelDiameter) {
		this.wheelDiameter = wheelDiameter
	}

	public double getNominalSectionWidth() {
		nominalSectionWidth
	}

	public void setNominalSectionWidth(double nominalSectionWidth) {
		this.nominalSectionWidth = nominalSectionWidth
	}

	public double getAspectRatio() {
		aspectRatio
	}

	public void setAspectRatio(double aspectRatio) {
		this.aspectRatio = aspectRatio
	}

	public String getNotes() {
		notes
	}

	public void setNotes(String notes) {
		this.notes = notes
	}
}
