class Solution {
    public int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
       return new int[0];
}
        Arrays.sort(changed);
        HashMap<Integer,Integer> map=new HashMap<>();
        int index=0;
        int newarr[]=new int[changed.length/2];
        for(int n:changed)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int i=0;i<changed.length ;i++)
        {
             int doubled= changed[i]*2;
              if (map.get(changed[i]) == 0) {
                continue;
            }
             if (map.getOrDefault(doubled, 0) == 0) {
                return new int[0];
            }
           if (index >= newarr.length) {
    return new int[0];
}

newarr[index++] = changed[i];
        


            map.put(changed[i], map.get(changed[i]) - 1);
            map.put(doubled, map.get(doubled) - 1);
        }

            return newarr;
        }

    
}