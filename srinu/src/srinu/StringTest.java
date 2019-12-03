package srinu;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "srinivasulu";//o/p 1r1n2va2
		char[] cha = string.toCharArray();
		int count=1;
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < cha.length; i++) {
			if (map.containsKey(cha[i])) {
				map.put(cha[i], map.get(cha[i]) + 1);
			} else {
				map.put(cha[i], 1);
			}
		}
		for (int i = 0; i < cha.length; i++) {
			if (map.containsKey(cha[i])) {
				if (map.get(cha[i])>1) {
					 int s=map.get(cha[i]);
					cha[i]=(char)(s+'0');
					//count++;
				}
			}
		}
      System.out.println(map);
      System.out.println(cha);
	}

}
