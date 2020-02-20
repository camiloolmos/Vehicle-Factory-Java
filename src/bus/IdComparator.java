package bus;

import java.util.Comparator;

public class IdComparator implements Comparator<Vehicle>{
	
	public int compare(Vehicle e1, Vehicle e2)
	{
		if ( e1.getId().compareTo(e2.getId()) <  0 )
				return -1 ;
		     if ( e1.getId().compareTo(e2.getId()) >  0 )
		           return +1;		     
		  return 0;	
	}	

}