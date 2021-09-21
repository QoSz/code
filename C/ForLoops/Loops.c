#include <stdio.h>

int main()
{

    /* Basic Structure of a for loop is
        for (initiallization; condition; update) {
            // Code
        } 
    */

    printf("Enter the number of round you would like to do: ");
    int numberOfRounds;
    scanf("%d", &numberOfRounds);

    for (int i = 1; i < numberOfRounds + 1; i++)
    {
        printf("You are on round %d\n", i);
    }
    return 0;
}