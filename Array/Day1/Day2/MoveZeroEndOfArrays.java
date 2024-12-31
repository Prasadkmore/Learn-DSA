class Solution {
  static  void pushZerosToEnd(int[] arr) {
        // code here
        
        int n=arr.length;
        
        int[] temp = new int[n];
        
        int j=0;
        
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
            
        }
        
        while(j<n){
            arr[j]=0;
            j++;
        }
        
    }
    
    public static void main(String[] args){
        
        int[] arr={3,5,0,0,4 };
        pushZerosToEnd(arr);
         
         for(int num:arr){
             System.out.println(num +"");
         }
    }
  
}