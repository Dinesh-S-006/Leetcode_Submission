class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int totaldrunk=0;
        int full=numBottles;
        int empty=0;
        while(full>0){
            totaldrunk+=full;
            empty+=full;
            full=0;
          if(empty>=numExchange){
            empty-=numExchange;
            full+=1;
            numExchange++;
          }

        }
        return totaldrunk;
    }
}