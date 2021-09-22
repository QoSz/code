#include <stdio.h>

int main()
{
    // Using do while loops
    /* 
        Basic structure of a do while loop is as follows.
        initiallization, comparison, update


        initiallize varaible
        do {
            // code
            // update 
        } while(comparison);
    */

    int input;
    scanf("%d", &input);

    do
    {
        printf("Enter a number between 0 - 9 ");
        scanf("%d", &input);
    } while (input < 0 || input > 9);

    return 0;
}