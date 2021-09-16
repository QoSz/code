#include <stdio.h>

int main() {
	// -- creates a positive when performing a calculation
	// ++ has no effect when performing a calculation
	
	int money = 25;
	int bill = 15;

	int moneyPaid = 25 - -15;

	printf("%i\n", moneyPaid);
	
	
	return 0;
}
