class Solution {
    public int calPoints(String[] operations) {
        ///check each character from Operation and based on switch case i perform operation for output i like to choose ArrayList 
        /// it make me to add -- delete-- and all so that 

        /// Each word iteration
          List<Integer> list=new ArrayList<>();
          int value=0;
        for(int i=0;i<operations.length;i++)
        {
            String ch=operations[i];
            switch(ch){
                case "+":
                 value=list.get(list.size()-1)+list.get(list.size()-2);
                 list.add(value);
                 break;
                case "D":
            value=list.get(list.size()-1);
                list.add(value*2);
                break;
                case "C":
                list.remove(list.size()-1);
                break;
                default:
               value=Integer.parseInt(operations[i]);
                list.add(value);
            }
        }
        int sum=0;
        for(int i:list){
           sum+=i;
        }
        return sum;
    }
}