class Solution {
    public int findClosest(int x, int y, int z) {
        // person 1 to reach person 3 
        // taking difference between person 1 and peerson 3
        int difference_Between_p1_p3=Math.abs(x-z);
      
        int difference_Between_p2_p3=Math.abs(y-z);
       // Reaches first check Minimum
       if(difference_Between_p1_p3==difference_Between_p2_p3){return 0;}
       int min=Math.min( difference_Between_p2_p3,difference_Between_p1_p3);
       if(min==difference_Between_p1_p3){
        return 1;
       }else if(min== difference_Between_p2_p3){
        return 2;
       }
       return 0;
       
    }
}