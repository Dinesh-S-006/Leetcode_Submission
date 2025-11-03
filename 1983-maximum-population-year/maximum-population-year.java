class Solution {
    public int maximumPopulation(int[][] logs) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int n[]:logs){
            int birth=n[0];
            int death=n[1]-1;
            for(int i=birth;i<=death;i++){
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        int maxyear=Integer.MAX_VALUE;
        int maxpopulation=0;
        for(int year:map.keySet()){
            int population=map.get(year);
            if(population>maxpopulation ||population==maxpopulation && year<maxyear){
                maxyear=year;
                maxpopulation=population;}}
           
           return maxyear;}
           
            }
            
            
            
            
            
            
            
//             )
//         }
       

        
        
    

// // Step 2: Find year with maximum population
//         int maxYear = Integer.MAX_VALUE;
//         int maxPopulation = 0;

//         for (int year : map.keySet()) {
//             int population = map.get(year);
//             if (population > maxPopulation || (population == maxPopulation && year < maxYear)) {
//                 maxPopulation = population;
//                 maxYear = year;
//             }
//         }

//         return maxYear;
//     }
// }