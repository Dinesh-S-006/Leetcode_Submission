class Solution {

    public static boolean nonDecreasing(  List<Integer>l){
        for(int i=1;i<l.size();i++){
            if(l.get(i)<l.get(i-1)){
              return false;
            }
        }
        return true;
    }
  

    public int minimumPairRemoval(int[] nums) {
        List<Integer>l=new ArrayList<>();
        for(int n:nums){
            l.add(n);
        }
         //int minimumsum=Integer.MAX_VALUE;
        int operations=0;
          int index=0;
        while(!nonDecreasing(l)){
                  int minimumsum=Integer.MAX_VALUE;
            for(int i=1;i<l.size();i++){
        int sum=l.get(i)+l.get(i-1); 

        if(sum<minimumsum){
            minimumsum=sum;
           
        
 index=i;}}
        l.remove(index);
        l.remove(index-1);
        l.add(index-1,minimumsum);

         operations++;
            }
   
             return operations;

        }

    }
