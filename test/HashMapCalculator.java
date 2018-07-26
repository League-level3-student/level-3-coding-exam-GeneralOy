import java.util.ArrayList;
import java.util.HashMap;

public class HashMapCalculator {

	public Object commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int commonValsAndKeys = 0;
		String commonKey = "";
		ArrayList<String> hashmap1keys = new ArrayList<String>();
		hashmap1keys.addAll(hashmap1.keySet());
		//ArrayList<String> hashmap2keys = new ArrayList<String>();
		//hashmap2keys.addAll(hashmap2.values());
		for(int i = 0; i < hashmap1.size(); i++) {
			if(hashmap2.containsKey(hashmap1keys.get(i))) {
				commonKey = hashmap1keys.get(i);
				if(hashmap2.get(commonKey).equals((hashmap1.get(commonKey)))) {
					commonValsAndKeys += 1;
				}
			}
		}
		return commonValsAndKeys;
	}

}