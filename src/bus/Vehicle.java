package bus;

import java.io.Serializable;

public abstract class Vehicle implements Serializable, IVehicle{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String color;
	private double xCoordinate;
	private double yCoordinate;
	private EnumType type;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
		this.color = color;
	}
	public double getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public double getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	public EnumType getType() {
		return type;
	}
	public void setType(EnumType type) {
		this.type = type;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(Integer id, String name, String color, double xCoordinate, double yCoordinate, EnumType type) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		this.type = type;
	}
	public Vehicle( String name, String color, double xCoordinate, double yCoordinate, EnumType type) {
		super();
		this.id = Sequence.getIndex() ;
		this.name = name;
		this.color = color;
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		this.type = type;
	}
	@Override
	public String toString() {
		return "\n\tVehicle [id=" + id + ", name=" + name + ", color=" + color + ", xCoordinate=" + xCoordinate + ", yCoordinate=" + yCoordinate
				+ ", type=" + type + "]";
	}
	

}
