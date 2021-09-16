#include <stdio.h>

int main(int argc, char *argv[]) {
	// Airthmetic operators are / * + -
	// When preforming calculation there is operator precidence 
	// so it will be in the order of bodmas
	// 1st - ()
	// 2nd - /
	// 3rd - *
	// 4th - +
	// 5th - -
	
	int x = (12 + 8) / 2 * 5 - 3; // Should return 47 as it follows the precidence shown above

	printf("%i\n", x);

	return 0;
}
