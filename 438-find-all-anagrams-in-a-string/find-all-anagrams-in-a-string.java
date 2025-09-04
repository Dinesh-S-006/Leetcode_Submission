class Solution {
    public List<Integer> findAnagrams(String s, String p) {
  
      List<Integer> result=new ArrayList<>();
            if(s.length()<p.length()){return result;}
      int s_arr[]=new int[26];
      int p_arr[]=new int[26];
      for(int ch:p.toCharArray()){
        p_arr[ch-'a']++;

      }
      int window=p.length();
      for(int i=0;i<window;i++){
        s_arr[s.charAt(i)-'a']++;
      }
      if(Arrays.equals(p_arr,s_arr)){
        result.add(0);
      }
      for(int i=window;i<s.length();i++){
        s_arr[s.charAt(i)-'a']++;
        s_arr[s.charAt(i-window)-'a']--;
        if(Arrays.equals(p_arr,s_arr)){
        result.add(i-window+1);
      }
      }
      return result;

        

      }
    }
