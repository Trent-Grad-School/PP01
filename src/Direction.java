//*********************************************************************
//*                                                                   *
//* CIS611                   Spring 2023               Trenton Schien *
//*                                                    Jose Escobar   *
//*                     Program Project PP01                          *
//*                                                                   *
//*          This is used to solve mazes in the worst way             *
//*                                                                   *
//*                                                                   *
//*                           2-13-2023                                *
//*                                                                   *
//*                  Saved in: Direction.java                         *
//*                                                                   *
//*********************************************************************

// This class must have the code in the run() method to solve the maze
// It searches for the Java logo based on the provided path/direction algorithm in Part II

public class Direction extends Thread{

	Maze maze;
	Position location;

	Direction(Maze maze, Position location) {
		
		this.maze = maze;
		this.location = location;
	}
	
	// This is the code part that needs to be programmed by students to solve the maze 
	// using the provided path/direction algorithm
	
        public void run(){
  			// Shows it moves
//			if(this.maze.moveRight())
//				location.textArea.append("Success" + "\n");
//			else
//				location.textArea.append("Failure" + "\n");
//			if(this.maze.moveLeft())
//				location.textArea.append("Success" + "\n");
//			else
//				location.textArea.append("Failure" + "\n");
//			if(this.maze.moveUp())
//				location.textArea.append("Success" + "\n");
//			else
//				location.textArea.append("Failure" + "\n");
//			if(this.maze.moveDown())
//				location.textArea.append("Success" + "\n");
//			else
//				location.textArea.append("Failure" + "\n");

			// Shows that it can find target
//			for(int i = 0; i < 10; i++){
//				if(this.maze.moveRight()) {
//					location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
//					location.textArea.append("Success" + "\n");
//				}
//				else{
//					location.textArea.append("Failure" + "\n");
//				}
//			}
//			for(int i = 0; i < 2; i++){
//				if(this.maze.moveDown()) {
//					location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
//					location.textArea.append("Success" + "\n");
//				}
//				else{
//					location.textArea.append("Failure" + "\n");
//				}
//
//			}

			// Part 2
			while(!maze.isDone()) {

				if(maze.getCurrCol() % 2 == 0 && this.maze.moveDown())
					location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
				else if(maze.getCurrCol() % 2 == 1 && this.maze.moveUp())
					location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
				else if (maze.getCurrCol() % 2 == 0 && this.maze.getCurrRow() != this.maze.getHeight()-1){
					if(this.maze.moveRight()){
						location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
					}
					if(!maze.isDone() && this.maze.moveDown()){
						location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
					}
					if(!maze.isDone() && this.maze.moveDown()){
						location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
					}
					if(!maze.isDone() && this.maze.moveLeft()){
						location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
					}
				}
				else if (maze.getCurrCol() % 2 == 1 && this.maze.getCurrRow() != 0){
					if(this.maze.moveLeft()){
						location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
					}
					if(!maze.isDone() && this.maze.moveUp()){
						location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
					}
					if(!maze.isDone() && this.maze.moveUp()){
						location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
					}
					if(!maze.isDone() && this.maze.moveRight()){
						location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
					}
				}
				else if(this.maze.moveRight()){
					location.textArea.append("Moved to row " + maze.getCurrRow() + ", column " + maze.getCurrCol() + "\n");
				}
				else {
					break;
				}
			}

		}
}
