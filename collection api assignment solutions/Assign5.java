/* 
5) maintain ICC ranking of at least 5 batsmen in the "HashMap".
list should be maintain as "rank" "name"
e.g. "1" "Sachin Tendulkar".
Now ask any rank bet'n 1 to 5 from user. ( user input).
if user asks for a particular rank , retrieve batsman name for that rank from the HashMap.
*/


package collectionApi;
import java.util.*;
import java.util.Map.Entry;

public class Assign5 {
 private int rank;
 private String name;
 
	public static void main(String[] args) {
		Map<Integer,String> h = new HashMap<Integer,String>();
		h.put(1,"M.S. Dhoni");
		h.put(2,"Sachin Tendulkar");
		h.put(3,"Virat Kohli");
		h.put(4,"Suresh Raina");
		h.put(5,"Hardik Pandya");
		Scanner sc= new Scanner(System.in);
		System.out.println("ICC top 5");
		int rank = sc.nextInt();
		String str = h.get(rank);
		System.out.println(str);
				
		

	}

}
