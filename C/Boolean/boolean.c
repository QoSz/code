#include <stdio.h>
#include <stdbool.h>

int main(int argc, char *argv[]) {
	// With stdbool library you would declare a boolean as 
	// _Bool variableName = 1 or 0 where 1 = true and 0 = false
	// With stdbool library you would set a boolean value normally
	// such as bool hot = true;
	
	bool hot = true;

	printf("Is it hot today? %i\n", hot);

	printf("%i\n", hot + 99);

	return 0;
}
