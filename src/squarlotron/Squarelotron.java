package squarlotron;

import java.util.Scanner;

public class Squarelotron {
    int size;
    int[][] squarelotron;

    /* constructor */
    Squarelotron(int size) {
	this.size = size;
	squarelotron = new int[size][size];

	for (int i = 0; i < this.size; i++) {
	    for (int j = 0; j < this.size; j++) {
		squarelotron[i][j] = (i * this.size) + j + 1;
	    }
	}
    }

    /* public methods */

    public void printSquarelotron() {
	// System.out.print("print squarelotron to user\r\n");
	for (int i = 0; i < this.size; i++) {
	    for (int j = 0; j < this.size; j++) {
		System.out.print(squarelotron[i][j] + "\t");
	    }
	    System.out.print("\r\n");
	}
    }
    
    public Squarelotron upsideDownFlip(int ring) {
	//stub
	if(1 > ring)
	{
	    System.out.print("invalid ring\r\n");
	}
	
	//create a new squarelotron and modify it
	Squarelotron anotherSquarelotron = new Squarelotron(this.size);
	//copy data into new squarelotron
	for (int i = 0; i < this.size; i++) {
	    for (int j = 0; j < this.size; j++) {
		anotherSquarelotron.squarelotron[i][j] = this.squarelotron[i][j];
	    }
	}
	
	//loop through all items and modify if needed
	for (int i = 0; i < this.size; i++) {
	    for (int j = 0; j < this.size; j++) {
		//look for elements on the ring
		if((i == ring - 1)||(i == this.size - ring) || (j == ring -1) || (j == size - ring)) {
		    anotherSquarelotron.squarelotron[i][j] = this.squarelotron[Math.abs(i-(size-ring))][j];
		}
	    }
	}
	
	return anotherSquarelotron;
	
    }
    
    public Squarelotron mainDiagonalFlip(int ring) {
	//stub
	Squarelotron anotherSquarelotron = new Squarelotron(this.size);
	
	return anotherSquarelotron;
	
    }
    
    public void rotateRight(int numberOfTurns) {
	//stub
	return;
    }
    
    
    
    /* main method */

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter Squareletron size");
	int size = scanner.nextInt();
	
	Squarelotron mySquarelotron = new Squarelotron(size);
	mySquarelotron.printSquarelotron();
	
	/* clean up and end */
	scanner.close();
	return;

    }

}
