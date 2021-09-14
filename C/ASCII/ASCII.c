#include <stdio.h>

int main(int argc, char *argv[]) {
	
	char ASCII;

	printf("Enter a character here\n");
	scanf("%c", &ASCII);
	printf("%i\n", ASCII); 
	
	int integer;

	printf("Enter an integer from 0 - 127\n");
	scanf("%i", &integer);
	printf("%c\n", integer);

	return 0;
}
