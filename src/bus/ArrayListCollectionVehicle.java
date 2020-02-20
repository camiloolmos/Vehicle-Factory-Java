package bus;

import java.util.Collections;
import java.util.ArrayList;

public class ArrayListCollectionVehicle {

	private static ArrayList <Vehicle> MyVehicle = new ArrayList<Vehicle>();

	public static ArrayList<Vehicle> getmyShapes() {
		return MyVehicle;
	}

	public static void setmyShapes(ArrayList<Vehicle> myShapes) {
		ArrayListCollectionVehicle.MyVehicle = myShapes;
	}

	public ArrayListCollectionVehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static void add(Vehicle e) 
	{
		
		MyVehicle.add(e);
		
	}
	public static Vehicle search(Integer key)
	{
		Vehicle found = null ;
		for( int i = 0; i<= MyVehicle.size(); i++ ) {
			found = MyVehicle.get(i);
		}
		return found;
	}
	
	public static boolean remove(Integer key)
	{
		boolean success = false;
		Vehicle found = search(key) ;
		
		if (found != null)
		{
			MyVehicle.remove(found);
			
			success = true;
		}		
		return success;
	}
	public static void sortId() 
	{
		Collections.sort(MyVehicle, new IdComparator());
		
	}
	
	
}
