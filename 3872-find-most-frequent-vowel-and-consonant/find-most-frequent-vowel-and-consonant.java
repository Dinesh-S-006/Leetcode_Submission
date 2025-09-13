class Solution {
    public int maxFreqSum(String s) {

        Map<Character,Integer> vowelmap=new HashMap<>();
        Map<Character,Integer> constonantmap=new HashMap<>();
        for(char c:s.toCharArray()) {
            if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u'){
                vowelmap.put(c,vowelmap.getOrDefault(c,0)+1);}
                else if(Character.isLetter(c)){
                    constonantmap.put(c,constonantmap.getOrDefault(c,0)+1);
                    }


                }
                List<Integer> l1=new ArrayList<>(vowelmap.values());
                List<Integer> l2=new ArrayList<>(constonantmap.values());
                int max1=l1.isEmpty()?0:Collections.max(l1);
                int max2=l2.isEmpty()?0:Collections.max(l2);
                return max1+max2;


    

                }

            }
        
        
    
