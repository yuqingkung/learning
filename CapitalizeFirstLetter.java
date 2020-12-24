class CapitalizeFirstLetter {
	public static void main (String[] args) {
		String s="i am working to a k k   ew  ";
		StringBuilder answer = new StringBuilder(s.length());
		String finalAnswer;
		int skip;
		answer.append(Character.toUpperCase(s.charAt(0)));//change first letter to Uppercase
		// conver s to string builder
		for(int i=1;i<s.length();i++){ 
			//read each character in stringbuilder
			if(s.charAt(i)==' ' ) { 
				//see space add the character to answer;
				answer.append(s.charAt(i));	
				continue;
			}
			
			if((s.charAt(i-1)==' ') && ((char)s.charAt(i)>='a' && (char)s.charAt(i)<='z')) {
				//if see a lowercase and previous number is space, change to uppper case.
				answer.append(Character.toUpperCase(s.charAt(i)));
				continue;
			}
			
			answer.append(s.charAt(i));	
		
		}
			
			//convert stringbuilder to string
			finalAnswer = answer.toString(); 
		
			System.out.print(finalAnswer);
		
		
		
	}
}