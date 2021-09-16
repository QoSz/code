#include <stdio.h>

int main() {
	// Some operators are evaluated from right to left for the operator precidence.

	int x, y;

	x = y = 5;
	
	// same as 
	// y = 5;
	// x = y;

	int z = 20;
	y = 2;
	
	x = -y + z;
	printf("%i\n", x); // Expect it to print out 18	

	return 0;
}
