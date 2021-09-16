#include <stdio.h>

int main() {
	
	int pizzasToEat = 100;

	printf("Initial pizzas to eat: %i\n", pizzasToEat);

	pizzasToEat += 100; // Incrementing

	printf("Pizzas to eat after incrementingy: %i\n", pizzasToEat);
	
	
	pizzasToEat -= 50; // Decrementing

	printf("Pizzas to eat after decrementingy: %i\n", pizzasToEat);
	
	pizzasToEat *= 2; // Multiplying

	printf("Pizzas to eat after multiplying: %i\n", pizzasToEat);

	pizzasToEat %= 2; // Modulus

	printf("Pizzas to eat after applying modulus: %i\n", pizzasToEat);
	
	return 0;
}
