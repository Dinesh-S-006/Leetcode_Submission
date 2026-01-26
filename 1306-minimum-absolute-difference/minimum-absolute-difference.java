class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
         Arrays.sort(arr);
        int difference=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            difference=Math.min(difference,Math.abs(arr[i]-arr[i-1]));
        }
       
      
       List<List<Integer>>l=new ArrayList<>();
            for(int i=1;i<arr.length;i++){
                List<Integer>pair=new ArrayList<>();
                if(Math.abs(arr[i]-arr[i-1])==difference){
                    
                    pair.add(arr[i-1]);
                    pair.add(arr[i]);
                      l.add(pair);
                }
              
            }
            return l;
    }
}