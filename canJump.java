class Untitled {
	public static void main(String[] args) {
		int[] myArr={1,5,0,1,5,0,0,0,0,2,0,1,0};
		System.out.println(canJump(myArr));
	}
	
    public static boolean canJump(int[] A) {
        // write your code here
		
        //int A={1,5,0,1,5,0,0,0,0,2,0,1,0};
		//       0,1,2,3,4,5,6,7,8,9,
        int zeroPosition;
		if (A.length==1){
			return true;
		}else if(A[0]==0){
		    return false;
		}else if (A.length==2&&A[0]>=1){
		    return true;
		}
		
		for(int i=0; i<A.length; i++){
		    System.out.print("i="+i);
			if (A[i]==0){
				zeroPosition=i;
				System.out.println("i="+i+" zeroPosition="+zeroPosition);
				for(int j=zeroPosition-1;j>=0;j--){
				     System.out.println("j="+j+" zeroPosition="+zeroPosition);
					
					if(A[j]>zeroPosition-j){ //J position > Z position space
						
					   break;
						
					}else if (j==0){ //if reach beganning no more number to check.
					    return false;
					}
				}
			}else if(i==A.length-1){ //reach end of last number
			        return true;
			}
			
		}
		
		return true;	
	}
}