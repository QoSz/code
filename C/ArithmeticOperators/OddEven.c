#include <stdio.h>

int main() {
	
	int userInput;

	printf("Enter any whole number: \n");
	scanf("%i", &userInput);

	if (userInput % 2 == 0) {
		printf("The number entered is even.\n");
	} else {
		printf("The number entered is odd.\n");
	}

	return 0;
}
