class Solution {
    public String removeStars(String s) {

        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch!='*')
            {
                stack.push(ch);
            }
            else
            {
                stack.pop();
            }
        }
        StringBuilder st=new StringBuilder();
        while(!stack.isEmpty())
        {
           st.append(stack.pop());
        }
      String out =st.reverse().toString();
      return out;
    }
}