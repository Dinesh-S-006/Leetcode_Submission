class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        int maxarea=Integer.MIN_VALUE;
        int area=0;
        for(int i=0;i<heights.length;i++){
        while(!stack.isEmpty() && heights[i]<heights[stack.peek()] )
        {
            int height=heights[stack.pop()];
            int right=i;
            int left=stack.isEmpty()?-1:stack.peek();
            int width=right-left-1;
            area=height*width;
            maxarea=Math.max(area,maxarea);
        }
          stack.push(i);
    }
    while(!stack.isEmpty()){
           int height=heights[stack.pop()];
            int right=heights.length;
            int left=stack.isEmpty()?-1:stack.peek();
            int width=right-left-1;
            area=height*width;
            maxarea=Math.max(area,maxarea);

    }
    return maxarea;
}}