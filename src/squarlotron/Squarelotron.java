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
