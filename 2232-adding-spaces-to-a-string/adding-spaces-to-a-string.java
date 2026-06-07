class Solution {
    public String addSpaces(String s, int[] spaces) {
    //     Set<Integer> set=new HashSet<>();
    //     for(int n:spaces)
    //     {
    //         set.add(n);
    //     }

    //     String result="";
    //     for(int i=0;i<s.length();i++)
    //     {
    //       if(set.contains(i))
    //       {
    //         result+=" ";
    //         result+=s.charAt(i);
    //       }
    //       else {
    //         result+=s.charAt(i);
    //       }
    //     }
    //     return result;
    // }

    StringBuilder sb=new StringBuilder();
    int j=0;
    for(int i=0;i<s.length();i++)
    {
        if(j<spaces.length && i==spaces[j])
        {
            sb.append(" ");
            j++;
            
        }
        sb.append(s.charAt(i));
    }
   return sb.toString();
}}