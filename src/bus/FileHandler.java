package bus;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public final class FileHandler {

	public static void writeToFile(ArrayList<Vehicle> myVehicle) throws IOException
	{
	    FileOutputStream   fos = new FileOutputStream("src/data/myVehicle.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

	    oos.writeObject(myVehicle);
	    oos.close();
	    fos.close();

	}
	@SuppressWarnings("unchecked")
	public static ArrayList<Vehicle> readToFile()throws IOException,ClassNotFoundException
	{
		ArrayList<Vehicle> myVehicle;
		FileInputStream fis = new FileInputStream("src/data/myVehicle.ser");
	    ObjectInputStream ois=new ObjectInputStream(fis);

	    myVehicle=(ArrayList<Vehicle>)ois.readObject();
	    ois.close();
	    fis.close();
	    return myVehicle;
	}		
}