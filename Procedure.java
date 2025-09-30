public class Procedure {
	private String name;
	private String date;
	private String practitioner;
	private double charges;
	
//default constructor
	public Procedure() {
	}
//over loaded constructor with some
	public Procedure(String name, String date) {
		this.name = name;
		this.date = date;
	}
//overloaded constructprs, with all
	public Procedure(String name, String date, String practitioner, double charges) {
		this.name = name;
		this.date = date;
		this.practitioner = practitioner;
		this.charges = charges;
	}
//returns name
	public String getName() {
		return name;
	}
//sets name
	public void setName(String name) {
		this.name = name;
	}
//returns date
	public String getDate() {
		return date;
	}
//sets date
	public void setDate(String date) {
		this.date = date;
	}
//returns practitioner for each object
	public String getPractitioner() {
		return practitioner;
	}
//sets practitioner
	public void setPractitioner(String practitioner) {
		this.practitioner = practitioner;
	}
//returns charges
	public double getCharges() {
		return charges;
	}
//sets charge
	public void setCharges(double charges) {
		this.charges = charges;
	}

	@Override
	public String toString() {
		return "Procedure: " + name + "\n" + "Date: " + date + "\n" + "Practitioner: " + practitioner + "\n"
				+ "Charges: $" + charges;
	}
}
