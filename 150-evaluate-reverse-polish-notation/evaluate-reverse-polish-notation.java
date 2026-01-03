class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack=new Stack<>();
      
        for(String s:tokens){
            if(s.equals("+") || s.equals("-")|| s.equals("*") || s.equals("/")){
                int b=stack.pop();
                int a=stack.pop();
                  int res=0;
                switch(s){
                case"+":res=a+b;break;
                case"-":res=a-b;break;
                case"*":res=a*b;break;
                case"/":res=a/b;break;
            }
            stack.push(res);}
            else{
                stack.push(Integer.parseInt(s));
            }

        }
        return stack.pop();
    }
}