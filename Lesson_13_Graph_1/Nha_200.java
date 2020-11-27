class Solution {
    class Point{
        int x;
        int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    public boolean checkInside(int i, int j, int max_i, int max_j){
        if (i<0 || i>=max_i){
            return false;
        }
        if (j<0 || j>= max_j){
            return false;
        }
        return true;
    }
    
    public void BFS(char[][] grid, int pos_i, int pos_j){
        Stack<Point> myStack = new Stack<Point>();
        
        
        Point newPoint = new Point(pos_i, pos_j);
        myStack.add(newPoint);
        
        while(!myStack.empty()){
            Point point = myStack.pop();
            for (int i=point.x-1; i<=point.x+1; i++){
                for (int j=point.y-1; j<=point.y+1; j++){
                    if (checkInside(i, j, grid.length, grid[0].length)){
                        if (i == point.x || j == point.y){           
                            if (i != point.x || j != point.y){
                                if (grid[i][j] == '1'){
                                    // System.out.println("i, j = " + i + " " + j);
                                    myStack.add(new Point(i, j));
                                    grid[i][j] = '0';
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i=0; i<grid.length; i++){
            for (int j=0; j<grid[i].length; j++){
                if (grid[i][j] == '1'){
                    // System.out.println("Start = " + i + " " + j);
                    BFS(grid, i, j);
                    count++;
                }
            }
        }
        
        return count;
    }
}