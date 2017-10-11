
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		// To be Implemented
		int result = 0;
		if (romanNum == "I"){
			result = 1;
		}else if (romanNum =="II"){
			result = 2;
		}
		
		return result;
	}

	public static boolean testRepetion3TimesInRow(String string) {
		// TODO Auto-generated method stub
	
		int I = 0, X = 0 , C = 0, M = 0;
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			switch(ch){
			case 'I':
				I += 1;
				break;
			case 'X':
				X += 1;
				break;
			case 'C':
				C += 1;
				break;
			case 'M':
				M += 1;
				break;
			}
			if (I == 3 | X == 3 | C == 3 | M == 3)
				return false;
		}
		return true;
		
	}
	
}
