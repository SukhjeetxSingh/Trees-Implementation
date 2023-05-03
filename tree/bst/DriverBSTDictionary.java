import java.util.Iterator;
/** 
   A driver that demonstrates the class BstDictionary.
   
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 5.0
*/
public class DriverBSTDictionary
{
	public static void main(String[] args) 
	{
		
	}  // end main
	
	
	
	public static void display(DictionaryInterface<String, String> dictionary)
	{
		Iterator<String> keyIterator   = dictionary.getKeyIterator();
		Iterator<String> valueIterator = dictionary.getValueIterator();
		
		while (keyIterator.hasNext() && valueIterator.hasNext())
			System.out.println(keyIterator.next() + " : " + valueIterator.next());
		System.out.println();
	} // end display
}  // end Driver
