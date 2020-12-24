class TwoPointers {
    public static void main(String[] args) {
        int[] numbers= {-3,2,3,3,6,8,15};
        int target =15;
        int left =0;
        int right = numbers.length-1;

        while (left<right) {

            if(target==numbers[left]+numbers[right]) {
                System.out.println(left + " " + right);
                break;
            }else if (target>numbers[left]+numbers[right]) {
                System.out.println(left+" before add left "+right);
                left++;
                System.out.println(left+" after add left "+right);
            }else if (target<numbers[left]+numbers[right]) {
                System.out.println(left+" before minus right "+right);
                right--;
                System.out.println(left+" after minus right "+right);

            }
        }
        System.out.println(" no solution ");

    }
}