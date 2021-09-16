#include <stdio.h>

int main() {
	
	int x = 5.42; // Implicitly type casts the double value of 5.42 to an integer as the data type is int
	printf("%d\n", x);  
	
	// Dividing pizza sliced between two people
	int slices = 17;
	int numberOfPeople = 2;
	
	printf("%i\n", slices / numberOfPeople); // No type casting
	printf("%f\n", (double) slices / numberOfPeople); // Explicit Type casting
	
	return 0;
}
