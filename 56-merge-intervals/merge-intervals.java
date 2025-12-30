class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]>result=new ArrayList<>();

        int []current=intervals[0];
        result.add(current);
        for(int i=1;i<intervals.length;i++){
            int currentend=current[1];
            int nextstart=intervals[i][0];
            int nextend=intervals[i][1];
            if(nextstart<=currentend){
          current[1] = Math.max(currentend, nextend);
            }
            else{
                current=intervals[i];
                result.add(current);
            }
        }
        return result.toArray(new int[result.size()][]);
            // return result.toArray(new int[result.size()][]);
    }
}