package bus;

import java.io.Serializable;

public class ElectricV extends Vehicle implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private double width;
	private double length;

	public double getwidth() {
		return width;
	}

	public void setwidth(double width) {
		this.width = width;
	}
	
	public double getlength() {
		return length;
	}

	public void setlength(double length) {
		this.length = length;
	}

	public ElectricV() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElectricV(Integer id, String name, String color, double xCoordinate, double yCoordinate,double width, double length) {
		super(id, name, color, xCoordinate, yCoordinate, EnumType.ElectricV);
		// TODO Auto-generated constructor stub
		this.width = width;
		this.length = length;
	}

	public ElectricV(String name, String color, double xCoordinate, double yCoordinate,double width, double length) {
		super(name, color, xCoordinate, yCoordinate, EnumType.ElectricV);
		// TODO Auto-generated constructor stub

		this.width = width;
		this.length = length;
	}

	public ElectricV(double width) {
		super();
		this.width = width;
		this.width = length;
	}

	@Override
	public String toString() {
		return "\nElectricV [width=" + width + ", length=" + length + ", Area=" + calculArea() + 
				",Circumference=" + calculCircum() +", "+ super.toString()  + "]";
	}

	@Override
	public double calculArea() {
		// TODO Auto-generated method stub
		return this.width * this.length ;
	}
	
	@Override
	public double calculCircum() {
		// TODO Auto-generated method stub
		return 2 * (this.width + this.length);
	}
	
	

}