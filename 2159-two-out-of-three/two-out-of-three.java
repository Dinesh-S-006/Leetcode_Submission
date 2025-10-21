class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer>l=new ArrayList<>();
        Set<Integer>set=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        Set<Integer> set3=new HashSet<>();

        for(int n:nums1){set.add(n);}
        for(int n:nums2){set2.add(n);}
        for(int n:nums3){set3.add(n);}
        int c=0;

        for(int i=1;i<=100;i++){
            if(set.contains(i)){
                c++;
            }
             if(set2.contains(i)){
                c++;
            }
            if(set3.contains(i)){
                c++;
            }
            if(c>=2){
                l.add(i);
                
            }
            c=0;
        }
        return l;
            
        }

    }
