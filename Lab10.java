/**
 * An algorithm helps an Athlete solve a maze, perhaps by keeping one hand against a wall.
 * 
 * @author Rebecca Brunsberg
 * @version 4th December 2014
 *
 */

import edu.fcps.karel2.Display; 

public class Lab10 {
  
  public static void main(String[] args) {
   //open maze1, maze2, or maze3
   Display.openWorld("maps/maze3.map");
   Display.setSize(10, 10);
   Athlete athena = new Athlete(1, 1, Display.NORTH, Display.INFINITY);
   clearMaze(athena);
  }
  
  public static void clearMaze(Athlete arg) {
   //TODO Write an algorithm that directs arg to the beeper at the end of the maze
    while (!arg.nextToABeeper()){
      if (!arg.leftIsClear() && arg.frontIsClear()){
        arg.move();
      }
      else if(!arg.leftIsClear() && !arg.frontIsClear()){
        arg.turnRight();
      }
      else if(arg.leftIsClear()){
        arg.turnLeft();
        arg.move();
      }
      
      
    }
  }
 }