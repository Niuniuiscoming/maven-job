package concurrentHashMapTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Long, String> mReqPacket = new HashMap<Long, String>();
        for (long i = 0; i < 15; i++) {
            mReqPacket.put(i, i + "");
        }
        Set<String> set=new HashSet<String>();
        set.add("huang");
        /*for (Entry<Long, String> entry : mReqPacket.entrySet()) {
            long key = entry.getKey();
            String value = entry.getValue();
            if (key < 10) {
                mReqPacket.remove(key);
            }
        }*/
        for (Iterator<Entry<Long, String>> iterator = mReqPacket.entrySet().iterator(); iterator.hasNext();) {
            Entry<Long, String> entry = iterator.next();
            long key = entry.getKey();
            if (key < 10) {
                iterator.remove();
            }
        }

        for (Entry<Long, String> entry : mReqPacket.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
	}

}
