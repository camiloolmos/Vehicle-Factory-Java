package prod;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import bus.*;

public class Testing {

	public static void main(String x[]) 
		     throws IOException, FileNotFoundException, ClassNotFoundException{
		// TODO Auto-generated method stub
		
		 ArrayList <Vehicle> myVehicle = new ArrayList<Vehicle>();
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int ans;

		
		//Menu 
		do {
 
			System.out.print("\n\t\t\t Menu ");
			System.out.print("\n\t1.Make Tirp ");
			System.out.print("\n\t2.Display Vehicle");
			System.out.print("\n\t3.Sort Vehicle");
			System.out.print("\n\t4.Read Vehicle From File");
			System.out.print("\n Enter your choise: ");
			ans = scan.nextInt();
			
			if(ans == 1) {
				System.out.print("\n\t1.Make Tirp");
					
				System.out.print("\nEnter 1 for Gas Vehicle or 2 for Electric Vehicle ");
				ans = scan.nextInt();
				if (ans == 1) {
					GasV shp = new GasV();

					shp.setType(EnumType.GasV);
					
					System.out.print("\nGas Vehicle ID: ");
					
					shp.setId(scan.nextInt());
			
					System.out.print("\nGas Vehicle Name: ");
	
					shp.setname(scan.next());

					System.out.print("\nGas Vehicle Color: ");
					
					shp.setcolor(scan.next());
					
					System.out.print("\nGas Vehicle x Coordinate: ");
	
					shp.setxCoordinate(scan.nextInt());
					
					System.out.print("\nGas Vehicle Y Coordinate: ");
					
					shp.setyCoordinate(scan.nextInt());
					
					System.out.print("\nGas Vehicle Radius: ");
					
					shp.setradius(scan.nextDouble());				
					
					shp.setpi(3.14);
						
					myVehicle.add(shp);
					
					FileHandler.writeToFile(myVehicle);
					
					System.out.print("\n\t\t\t\t\t Saved Entry ");
					
				}
				else if (ans == 2) {
				
					ElectricV shp = new ElectricV();

					shp.setType(EnumType.ElectricV);
					
					System.out.print("\nElectric Vehicle ID: ");
					
					shp.setId(scan.nextInt());

					System.out.print("\nElectric Vehicle  Name: ");
	
					shp.setname(scan.next());

					System.out.print("\nElectric Vehicle  Color: ");
					
					shp.setcolor(scan.next());
					
					System.out.print("\nElectric Vehicle  X Coordinate: ");
	
					shp.setxCoordinate(scan.nextDouble());

					System.out.print("\nElectric Vehicle  Y Coordinate: ");
					
					shp.setyCoordinate(scan.nextDouble());
					
					System.out.print("\nElectric Vehicle  Width: ");
					
					shp.setwidth(scan.nextDouble());
					
					System.out.print("\nElectric Vehicle  Length: ");
					
					shp.setlength(scan.nextDouble());
						
					myVehicle.add(shp);
					
					FileHandler.writeToFile(myVehicle);
					
					System.out.print("\n\t\t\t\t\t Saved Entry ");
				}
				else {

					System.out.print("\n Incorrect Entry ");
					break;
				}
			}
				
				else if(ans == 2) {
				
				System.out.print("\n\t2.Display Vehicle");
							
				 ArrayList<Vehicle> myVehicleFromFile= FileHandler.readToFile();

			     for (Vehicle element : myVehicleFromFile) {
			     System.out.println(element);
				
			     }
				
			}
						
			else if(ans == 3) {

				System.out.print("\n\t3.Sort Vehicle");
				System.out.print("\nEnter 1 to SortByID");
				ans = scan.nextInt();
				
				if(ans ==1)
				{
					Collections.sort(myVehicle, new IdComparator());
					
				}
				else {

					System.out.print("\n Incorrect Entry ");
					break;
				}
			}
			
			else if(ans == 4) {
				

				System.out.print("\n\t4.Read Vehicle From File");
				
				 ArrayList<Vehicle> myVehicleFromFile= FileHandler.readToFile();

			     for (Vehicle element : myVehicleFromFile) {
			     System.out.println(element);
				
			     }
					
			}
		
		}while (ans<5);


		System.out.print("\n Exiting Programm ");

	}

}