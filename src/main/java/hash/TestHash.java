package hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class TestHash {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*HashMap<String,Object> map=new HashMap<String, Object>();
		
		System.out.println(map.put("name", "Lin"));
		System.out.println(map.put("name1", "Lee"));
		System.out.println(map.put("name", "Lv"));*/
		
		ArrayList<String> list=new ArrayList<String>();
		
		Hashtable<String, Object> hashtable=new Hashtable<String, Object>();
		hashtable.put("one", 1);
		hashtable.put("two", 2);
		
		
	}

	private static int indexFor(int i, int length) {
		// TODO Auto-generated method stub
		return i & (length-1);
	}
	
	/*public int indexFor(int h, int length) {
	    return h & (length-1);
	}*/
}
