package studio9;

import static org.junit.Assert.assertArrayEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Map<String, String> nameHeight = new HashMap<String, String>();
		nameHeight.put("Kevin", "185");
		nameHeight.put("Bob", "165");
		nameHeight.put("John", "300");
		
		while (nameHeight.isEmpty()==false || in.next() !=null) {
		
		System.out.println(nameHeight.get(in.next()));
		
		}
		
		

		// FIXME
		throw new NotYetImplementedException();

	}
}
