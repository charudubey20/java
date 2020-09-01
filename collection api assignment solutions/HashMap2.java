/*
2) create a HashMap.
store  prn no. and students name of 10 students inside the HashMap.
display it using iterator.
*/

package collectionApi;
import java.util.*;
import java.util.Map.Entry;

public class HashMap2 {
	public static void main(String[] args) {
		Map<Integer,String> h = new HashMap<Integer,String>();
		h.put(1,"charu");
		h.put(2,"swati");
		h.put(3,"jassi");
		h.put(4,"rupal");
		h.put(5,"dilip");
		h.put(6,"rohit");
		h.put(7,"neha");
		h.put(8,"venky");
		h.put(9,"ravi");
		h.put(10,"prashant");
		Set<Entry<Integer,String>> set = h.entrySet();
		Iterator<Entry<Integer,String>> i = set.iterator();
		while(i.hasNext())
		{
			Map.Entry<Integer,String> m = (Entry<Integer,String>)i.next();
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		
		

}
}
