public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "  Life  doesn't  always    give     us  the       joys we want.";

        System.out.println(reverseWords(s));
    }


    public static String reverseWords(String s) {
        // write your code here
        //convert string into string array
        String[] sArray = new String[s.length()];
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        String answer;
        int i = 0;
        int wordIndex = 0;
        int sLength = s.length() - 1;
        //System.out.println(s);

        while (i <= sLength) {

            if (s.charAt(i)==' ') {

                i++;
            } else if (s.charAt(i)!=' ') {
                sb.append(s.charAt(i));
                i++;
            }

        }

        // add sb to array;
        sArray[sLength]=sb.toString();

        for (int j = sArray.length - 1; 0 <= j; j--) {
            if (!(sArray[j] == null) && !(sArray[j].equals(""))) {
                if(j==0) {
                    sb1.append(sArray[j].toString());
                } else {
                    sb1.append(sArray[j].toString()+" ");
                }


            }
        }

        answer=sb1.toString();

        return answer;
    }
}