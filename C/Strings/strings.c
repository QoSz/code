#include <stdio.h>
#include <string.h>

int main(int argc, char **argv[])
{

    printf("What is you favourite food? ");
    char favFood[50];
    scanf("%49s", favFood);
    printf("%s\n", favFood);

    int charCout = strlen(favFood);

    printf("The character count is %d\n", charCout);

    return 0;
}