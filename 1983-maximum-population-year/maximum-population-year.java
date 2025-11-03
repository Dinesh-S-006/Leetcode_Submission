class Solution {
    public int maximumPopulation(int[][] logs) {
        // Map<Integer,Integer> map=new HashMap<>();

        // for(int n[]:logs){
        //     int birth=n[0];
        //     int death=n[1]-1;
        //     for(int i=birth;i<=death;i++){
        //         map.put(i,map.getOrDefault(i,0)+1);
        //     }
        // }
        // int maxyear=Integer.MAX_VALUE;
        // int maxpopulation=0;
        // for(int year:map.keySet()){
        //     int population=map.get(year);
        //     if(population>maxpopulation ||population==maxpopulation && year<maxyear){
        //         maxyear=year;
        //         maxpopulation=population;}}
           
        //    return maxyear;}
           
        //     }
            
            int arr[]=new int[2051];
            for(int n[]:logs){
                int birth=arr[n[0]]++;
                int death=arr[n[1]]--;

            }
            int year=1950;
            int pop=0;
           int maxpop=0;
            for(int i=1950;i<=2050;i++){
                pop+=arr[i];
                if(pop>maxpop){
                    maxpop=pop;
                    year=i;
                }
            }
            return year;}}

            
            
            
            
            
            
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