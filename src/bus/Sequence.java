package bus;

public class Sequence {
		
	private static int index = 1000;
		
		public static int getIndex()
		{
			return Sequence.index++;
			
		}		
		public static void setIndex( int index)
		{
			Sequence.index= index;
		}
}
