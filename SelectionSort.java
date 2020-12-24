class SelectionSort {
	public static void main(String[] args) {
		int[]nums={-2,9,13,4,-8,0};
		int arraySize=nums.length;
		int largest=0;
		int temp=0;
		for(int i=0;i<nums.length;i++){
			largest=i;
			System.out.print("largest "+largest);
			System.out.println();
			for(int j=i+1;j<arraySize;j++){
				if (nums[largest]<=nums[j]){
					largest=j;
					System.out.print("largest "+largest+" i="+i+" j="+j);
					System.out.println();
				}
				
			}
			temp=nums[i];
			nums[i]=nums[largest];
			nums[largest]=temp;	
		}

		
		for(int e=0;e<arraySize;e++){
			System.out.print(nums[e]);
		}
	}
}