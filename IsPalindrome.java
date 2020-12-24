class IsPalindrome{
    public static void main (String[] args){
        String s=".";
       System.out.print(isPalindrome(s));

    }
    public static boolean isPalindrome(String s) {
        // write your code here
        int left=0;
        int right = s.length()-1;
        if (s.length()<=1){
            return true;
        }
        while (left<right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                System.out.println(left+" left letter "+Character.isLetterOrDigit(s.charAt(left)));
                left++;
            }else if (Character.isLetterOrDigit(s.charAt(right))==false) {
                System.out.println(right+" right letter "+Character.isLetterOrDigit(s.charAt(right)));
                right--;
            }else if (Character.toUpperCase(s.charAt(left)) == Character.toUpperCase(s.charAt(right))){
                System.out.println(Character.isLetterOrDigit(s.charAt(right))+" left right "+Character.isLetterOrDigit(s.charAt(right)));
                left++;
                right--;
            }else if(Character.toUpperCase(s.charAt(left)) != Character.toUpperCase(s.charAt(right))){
                return false;
            }
        }
        return true;
    }

}

