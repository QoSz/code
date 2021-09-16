#include <stdio.h>

int main() {
	// The modulus operator (%) returns the remainder of a division
	// Modulus is only use for doing calculations with the int data types

	
	// Say we have a pizza with 5 pieces and we want to spilt it between two people
	int piecesOfPizza = 5;
	int numberOfEaters = 2;
	int leftOver = 5 % 2;

	printf("The number of pieces of pizza left over is %i\n", leftOver); 

	return 0;
}
