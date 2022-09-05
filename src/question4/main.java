package question4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class main {
	
	public static void main(String[] args) {
		Map<String, List<String>> mp=new TreeMap<>();
		mp.put("bihar",Arrays.asList("patna","hajipur","urisa","darbhanga","madhubanui"));
		mp.put("rajsthan",Arrays.asList("jaipur","udaypur","jodhpur","bhartpur","haldighati"));
		mp.put("up",Arrays.asList("locknow","gajibad","agra","banars","kanpur"));
		mp.put("panjab",Arrays.asList("haldghati","amrit sahar","pathankot"));
		
		
	Set<Map.Entry<String, List<String>> > tm=mp.entrySet();
	 for(Map.Entry<String, List<String>> item:tm) {
		 System.out.println(item.getKey()+"----"+item.getValue());
	 }
	   
	}

}
