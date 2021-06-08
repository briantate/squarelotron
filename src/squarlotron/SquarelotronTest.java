package squarlotron;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SquarelotronTest {
    Squarelotron mySquarelotron; //used throughout this test
    int size = 5;
    
    
    @BeforeEach
    void setUp() throws Exception {
	mySquarelotron = new Squarelotron(size);
    }

    @Test
    void testUpsideDownFlip() {
//	fail("Not yet implemented");
	System.out.print("testUpsideDownFlip \r\n\r\n");
	
	boolean failure = false;
	
	int[][] testSquarelotron = 
	    {{21,22,23,24,25},
	     {16, 7, 8, 9,20},
	     {11,12,13,14,15},
	     { 6,17,18,19,10},
	     { 1, 2, 3, 4, 5}};
	
	System.out.print("testSquarelotron:\r\n");
	
	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		System.out.print(testSquarelotron[i][j] + "\t");
	    }
	    System.out.print("\r\n");
	}
	
	System.out.print("\r\n\r\n");
	
	Squarelotron newSquarelotron = mySquarelotron.upsideDownFlip(1);
	
	//compare
	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		if(testSquarelotron[i][j] != mySquarelotron.squarelotron[i][j])
		    failure = true;
	    }
	}
	
	System.out.print("mySquarelotron:\r\n");
	mySquarelotron.printSquarelotron();
	System.out.print("\r\n\r\n");
	
	if(failure)
	    fail("wrong values");
	
	
    }

    @Test
    void testMainDiagonalFlip() {
//	fail("Not yet implemented");
	System.out.print("testMainDiagonalFlip \r\n\r\n");
	
	boolean failure = false;
	
	int[][] testSquarelotron = 
	    {{ 1, 6,11,16,21},
	     { 2, 7, 8, 9,22},
	     { 3,12,13,14,23},
	     { 4,17,18,19,24},
	     { 5,10,15,20,25}};
	
	System.out.print("testSquarelotron:\r\n");
	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		System.out.print(testSquarelotron[i][j] + "\t");
	    }
	    System.out.print("\r\n");
	}
	
	System.out.print("\r\n\r\n");
	
	Squarelotron newSquarelotron = mySquarelotron.mainDiagonalFlip(1);
	
	//compare
	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		if(testSquarelotron[i][j] != newSquarelotron.squarelotron[i][j])
		    failure = true;
	    }
	}
	
	System.out.print("mySquarelotron:\r\n");
	mySquarelotron.printSquarelotron();
	System.out.print("\r\n\r\n");
	
	if(failure)
	    fail("wrong values");
    }

    @Test
    void testRotateRight() {
//	fail("Not yet implemented");
	
	System.out.print("testRotateRight \r\n\r\n");
	
	boolean failure = false;
	
	int[][] testSquarelotron = 
	    {{ 21,16,11, 6, 1},
	     { 22,17,12, 7, 2},
	     { 23,18,13, 8, 3},
	     { 24,19,14, 9, 4},
	     { 25,20,15,10, 5}};
	
	System.out.print("testSquarelotron:\r\n");
	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		System.out.print(testSquarelotron[i][j] + "\t");
	    }
	    System.out.print("\r\n");
	}
	
	System.out.print("\r\n\r\n");
	
	mySquarelotron.rotateRight(1);
	
	//compare
	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		if(testSquarelotron[i][j] != mySquarelotron.squarelotron[i][j])
		    failure = true;
	    }
	}
	
	System.out.print("mySquarelotron:\r\n");
	mySquarelotron.printSquarelotron();
	System.out.print("\r\n\r\n");
	
	if(failure)
	    fail("wrong values");
    }

}
