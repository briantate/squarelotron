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
	
	System.out.print("testUpsideDownFlip \r\n\r\n");
	
	boolean failure = false;
	
	
	//ring 1
	
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
		if(testSquarelotron[i][j] != newSquarelotron.squarelotron[i][j])
		{
		    failure = true;
		    System.out.printf("err:[%d][%d]\r\n",i,j);
		}
	    }
	}
	
	System.out.print("newSquarelotron:\r\n");
	newSquarelotron.printSquarelotron();
	System.out.print("\r\n\r\n");
	
	//ring 2
	System.out.print("test2Squarelotron:\r\n");
	int[][] test2Squarelotron = 
	    {{ 1, 2, 3, 4, 5},
	     { 6,17,18,19,10},
	     {11,12,13,14,15},
	     {16, 7, 8, 9,20},
	     {21,22,23,24,25}};
	
	
	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		System.out.print(test2Squarelotron[i][j] + "\t");
	    }
	    System.out.print("\r\n");
	}
	
	System.out.print("\r\n\r\n");
	
	Squarelotron ring2Squarelotron = mySquarelotron.upsideDownFlip(2);
	
	//compare
	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		if(test2Squarelotron[i][j] != ring2Squarelotron.squarelotron[i][j])
		{
		    failure = true;
		    System.out.printf("err:[%d][%d]\r\n",i,j);
		}
	    }
	}
	
	System.out.print("ring2Squarelotron:\r\n");
	ring2Squarelotron.printSquarelotron();
	System.out.print("\r\n\r\n");
	
	if(failure)
	    fail("wrong values");
	
	
    }

    @Test
    void testMainDiagonalFlip() {
//	fail("Not yet implemented");
	System.out.print("testMainDiagonalFlip \r\n\r\n");
	
	boolean failure = false;
	
	//Ring 1 flip
	
	int[][] testSquarelotronRing1 = 
	    {{ 1, 6,11,16,21},
	     { 2, 7, 8, 9,22},
	     { 3,12,13,14,23},
	     { 4,17,18,19,24},
	     { 5,10,15,20,25}};
	
	System.out.print("testSquarelotron:\r\n");
	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		System.out.print(testSquarelotronRing1[i][j] + "\t");
	    }
	    System.out.print("\r\n");
	}
	
	System.out.print("\r\n\r\n");
	
	Squarelotron ring1Squarelotron = mySquarelotron.mainDiagonalFlip(1);
	
	//compare
	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		if(testSquarelotronRing1[i][j] != ring1Squarelotron.squarelotron[i][j])
		{
		    System.out.printf("err:[%d][%d]\r\n",i,j);
		    failure = true;
		}
		    
	    }
	}
	
	System.out.print("newSquarelotron:\r\n");
	ring1Squarelotron.printSquarelotron();
	System.out.print("\r\n\r\n");
	
	//ring 2 flip
	int[][] testSquarelotronRing2 = 
	    {{ 1, 2, 3, 4, 5},
	     { 6, 7,12,17,10},
	     {11, 8,13,18,15},
	     {16, 9,14,19,20},
	     {21,22,23,24,25}};
	
	System.out.print("testSquarelotron2:\r\n");
	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		System.out.print(testSquarelotronRing2[i][j] + "\t");
	    }
	    System.out.print("\r\n");
	}
	
	System.out.print("\r\n\r\n");
	
	Squarelotron ring2Squarelotron = mySquarelotron.mainDiagonalFlip(2);
	
	//compare
	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		if(testSquarelotronRing2[i][j] != ring2Squarelotron.squarelotron[i][j])
		{
		    System.out.printf("err:[%d][%d]\r\n",i,j);
		    failure = true;
		}
		    
	    }
	}
	
	System.out.print("newSquarelotron:\r\n");
	ring2Squarelotron.printSquarelotron();
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
		{
		    System.out.printf("err:[%d][%d]\r\n",i,j);
		    failure = true;
		}
	    }
	}
	
	System.out.print("mySquarelotron:\r\n");
	mySquarelotron.printSquarelotron();
	System.out.print("\r\n\r\n");
	
	if(failure)
	    fail("wrong values");
    }

}
