class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maximum=1;
        for(int value:candies){
            maximum=Math.max(maximum,value);

        }
        List<Boolean>list=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            list.add(candies[i]+extraCandies>=maximum);
                // list.add("true");
            }
            // else{
            //     list.add("false");
            // }
        
        return list;
    }
}