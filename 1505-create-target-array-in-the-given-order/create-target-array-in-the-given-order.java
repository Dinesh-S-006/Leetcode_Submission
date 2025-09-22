class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
    List<Integer>l=new ArrayList<>();
    for(int i=0;i<index.length;i++){
        l.add(index[i],nums[i]);
    }
    int arr[]=new int[l.size()];
    int p=0;
    for(int i=0;i<l.size();i++){
        arr[p]=l.get(i);
        p++;
    }

      return arr;
        
            
        }
    }
