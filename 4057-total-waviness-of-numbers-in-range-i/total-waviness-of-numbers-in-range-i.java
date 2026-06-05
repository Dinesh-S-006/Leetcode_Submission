class Solution {
    public int totalWaviness(int num1, int num2) {
         int p=0;
         int v=0;
         int waviness=0;
         int check=1;
        for(int i=num1;i<=num2;i++)
        {
            String number=Integer.toString(i);
            for(int j=1;j<number.length()-1;j++){
          
            int a=number.charAt(j-1)- '0';
            int c=number.charAt(j+1)- '0';
            int b= number.charAt(j)- '0';
            
            

            if(b>a && b>c){
              waviness++;
            }
            else if(b<a && b<c){
                waviness++;
            }

        }}
        return waviness;
        
    }
}