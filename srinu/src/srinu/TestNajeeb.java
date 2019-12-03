package srinu;

import java.util.HashMap;
import java.util.Map;

public class TestNajeeb {

	public static <Char> void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "srinivasulu";
		
		for(char c : name.toCharArray()) {
			int check = name.split(((Character)c).toString()).length;
			if(c == name.charAt(name.length()-1)) {
				check++;
			}
			if(check > 2 ) {
				for(int j = 1 ; j <= check ; j++) {
					name = name.replaceFirst(((Character)c).toString(), ""+j);
				}
			}
		}
		
		System.out.println(name);
	}

}
