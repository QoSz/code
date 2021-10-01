#include <stdio.h>

int main(int argc, char *argv[])
{

    int x = 4;
    int y = 9;

    // Two if statements evaluates two of the condition statements.
    printf("Using two if statements\n");
    if (x == 4)
    {
        printf("Hello\n");
    }
    if (y == 9)
    {
        printf("World!\n");
    }

    // Only evaluates one of the conditions.
    printf("\n");
    printf("Using and if else statement\n");
    if (x == 4)
    {
        printf("Hello2\n");
    }
    else if (y == 9)
    {
        printf("World2!\n");
    }

    return 0;
}