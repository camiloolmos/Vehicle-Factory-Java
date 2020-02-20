package bus;

import java.io.Serializable;

public class GasV extends Vehicle implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private double radius;
	private double pi = Math.PI;;
	
	public double getradius() {
		return radius;
	}
	public void setradius(double radius) {
		this.radius = radius;
	}
	public double getpi() {
		return pi;
	}
	public void setpi(double pi) {
		this.pi = pi;
	}	
	public GasV() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GasV (Integer id, String name, String color, double xCoordinate, double yCoordinate,double radius, double pi) {
		super(id, name, color, xCoordinate, yCoordinate,  EnumType.GasV);
		// TODO Auto-generated constructor stub

		this.radius = radius;
		this.pi = pi;
	}

	public GasV(double radius, double pi) {
		super();
		this.radius = radius;
		this.pi = pi;
	}
	@Override
	public String toString() {
		return "\nGasV [radius=" + radius + ", pi=" + pi + ", Area=" + calculArea() + 
				",Circumference=" + calculCircum() +", "+ super.toString()  + "]";
	}

	@Override
	public double calculArea() {
		// TODO Auto-generated method stub
		return this.pi * this.radius * this.radius ;
	}
	
	@Override
	public double calculCircum() {
		// TODO Auto-generated method stub
		return 2 * this.pi * this.radius;
	}
	
	
}