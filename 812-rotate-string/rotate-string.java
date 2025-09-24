class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){return false;}
        String concatstring=s.concat(s);
        if(concatstring.contains(goal)){
            return true;
        }
        return false;

    }
}