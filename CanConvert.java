class CanConvert {
	public static void main(String[] args) {
		String s="adcadcadcdac";
		String t="adddaa";
		System.out.print(canConvert(s,t));
	}
	
	public static boolean canConvert(String s, String t) {
			// Write your code here
		if (s==null && t==null ) {
			return true;
		}
		if (s==null || t==null || t.length()>s.length()) {
			return false;
		}

		int tCount=0;

		for (int sCount=0;sCount<s.length(); sCount++) {
			if (s.charAt(sCount)==t.charAt(tCount)){
				tCount++;
			}
			if (t.length() == tCount) {
				return true;
			}
		}
		return tCount == t.length() ? true : false ;
	}

}
		
