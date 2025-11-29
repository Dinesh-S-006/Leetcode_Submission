class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
       Map<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<deck.length;i++){
        map.put(deck[i],map.getOrDefault(deck[i],0)+1);
       }
    int g=0;
    boolean finalresult=false;;
    for(int count:map.values()){
      g= gcd(g,count);
  
    
    }
    return g>1;
    }
    public static int  gcd(int a,int b){
     
        if(b==0) return a;
        return gcd(b,a%b);
    }
}