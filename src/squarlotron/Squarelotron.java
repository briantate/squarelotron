package squarlotron;

import java.util.Scanner;

public class Squarelotron {
    int size;
    int[][] squarelotron;

    // private data
    private int numRings;

    /* constructor */
    Squarelotron(int size) {
	this.size = size;
	squarelotron = new int[size][size];
	this.numRings = (this.size / 2) + (this.size % 2);

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

	if ((1 > ring ) || (ring > this.numRings)) {
	    System.out.print("invalid ring\r\n");
	}

	// create a new squarelotron and modify it
	Squarelotron anotherSquarelotron = new Squarelotron(this.size);
	// copy data into new squarelotron
	for (int i = 0; i < this.size; i++) {
	    for (int j = 0; j < this.size; j++) {
		anotherSquarelotron.squarelotron[i][j] = this.squarelotron[i][j];
	    }
	}
	
	// loop through all items and modify if needed
	for (int i = ring - 1; i < this.size - ring + 1; i++) {
	    for (int j = ring - 1; j < this.size - ring + 1; j++) {
		// look for elements on the ring
		if ((i == ring - 1) || (i == this.size - ring) || (j == ring - 1) || (j == size - ring)) {
		    anotherSquarelotron.squarelotron[i][j] = this.squarelotron[size - i - 1][j];
		}
	    }
	}

	return anotherSquarelotron;

    }

    public Squarelotron mainDiagonalFlip(int ring) {

	if ((1 > ring ) || (ring > this.numRings)) {
	    System.out.print("invalid ring\r\n");
	}

	// create a new squarelotron and modify it
	Squarelotron anotherSquarelotron = new Squarelotron(this.size);
	// copy data into new squarelotron
	for (int i = 0; i < this.size; i++) {
	    for (int j = 0; j < this.size; j++) {
		anotherSquarelotron.squarelotron[i][j] = this.squarelotron[i][j];
	    }
	}

	// loop through all items and modify if needed
	for (int i = ring - 1; i < this.size - ring + 1; i++) {
	    for (int j = ring - 1; j < this.size - ring + 1; j++) {
		// look for elements on the ring
		if ((i == ring - 1) || (i == this.size - ring) || (j == ring - 1) || (j == size - ring)) {
		    anotherSquarelotron.squarelotron[i][j] = this.squarelotron[j][i];
		}
	    }
	}

	return anotherSquarelotron;

    }

    public void rotateRight(int numberOfTurns) {

	// temporary squarelotron to hold the initial state
	int[][] tempSquare = new int[this.size][this.size];

	// copy the initial contents to a temporary squarelotron
	for (int i = 0; i < this.size; i++) {
	    for (int j = 0; j < this.size; j++) {
		tempSquare[i][j] = this.squarelotron[i][j];
	    }
	}

	// flip numberOfTurns times
	// ToDo:
	// operate on all rings
	for (int ring = 1; ring < this.numRings + 1; ring++) {
	    System.out.printf("ring = %d\r\n",ring);   
	    
	    for(int moves = 0; moves < 3; moves++)//do this operation 3 times to rotate a ring
	    {
		System.out.println("moves =" + moves);
		Squarelotron mainDiagSquarelotron;
		mainDiagSquarelotron = this.mainDiagonalFlip(ring);
		
		Squarelotron upsideDownSquarelotron;
		upsideDownSquarelotron = mainDiagSquarelotron.upsideDownFlip(ring);
		
		//copy new contents to original squarelotron
		for (int i = 0; i < this.size; i++) {
		    for (int j = 0; j < this.size; j++) {
			this.squarelotron[i][j] = upsideDownSquarelotron.squarelotron[i][j];
		    }
		}
		this.printSquarelotron();
		System.out.print("\r\n\r\n");
	    }
	    this.printSquarelotron();
	}

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
