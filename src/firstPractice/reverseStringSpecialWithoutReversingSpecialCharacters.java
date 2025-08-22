package firstPractice;

public class reverseStringSpecialWithoutReversingSpecialCharacters {

	
	public static void main(String[] args) {
		String str=reverseStringSpecialWithoutReversingSpecialCharacters("abcdef*#");
		System.out.println(str);
	}
	
	
	public static String reverseStringSpecialWithoutReversingSpecialCharacters(String str) {
		
		char [] chars=str.toCharArray();
		//1)created two pointers
		int left =0;
		int right=str.length()-1;
		
		//2)Move the two pointers inwards,dont swap if special character
		
		while(left<right) {
			if(!Character.isLetter(chars[left])) {
				left++;
			}
			else if(!Character.isLetter(chars[right])){
				right--;
			}
			else {
				char temp=chars[left];
				chars[left]=chars[right];
				chars[right]=temp;
				left++;
				right--;
			}
		}
		return new String(chars);
	}
	
}
