class Solution {
    public int maxNumberOfBalloons(String text) {
 

      int b_count=0;
      int a_count=0;
      int l_count=0;
      int o_count=0;
      int n_count=0;
      int other=0;

      for(char ch:text.toCharArray())
      {
        switch(ch)
        {
            case 'b':
                   b_count++;
                   break;
              case 'a':
                   a_count++;
                   break;
                case 'l':
                   l_count++;
                   break;
              case 'o':
                   o_count++;
                   break;
                case 'n':
                   n_count++;
                   break;
                default:
                 other++;
                 break;
                
        }}
        int number_of_balloon=0;
        while(b_count>=1 && a_count>=1 && l_count>=2 && o_count>=2 && n_count>=1)
        {
              number_of_balloon++;
              b_count--;
              a_count--;
             l_count-=2;
              o_count-=2;
              n_count--;
        }
        return number_of_balloon;


      }
      
      
      
        
    }
