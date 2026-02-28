package strings_programs;

public class Shortestpath {

    public static float getShortestpath(String path){
        int x = 0; int y = 0;
        for(int i = 0; i<path.length();i++){
        char direction = path.charAt(i);
        //NORTH
        if(direction=='N'){
            y++;
        }
        //SOUTH
          else if(direction == 'S'){
            y--;
         }
         //EAST
            else if(direction == 'E'){
                x--;
            }
            //WEST
              else{
                x++;
              }              
    }
        int xSquare = x*x;                                            //Formula to calculate shortest path or displacement
        int ySquare = y*y;
        return (int)Math.sqrt(xSquare+ySquare);
}
    public static void main(String[] args) {
        String path = "WNEENESENNN" ;
        System.out.println("The shortest path is:" + getShortestpath(path));
    }
}
