#include <stdio.h>

int main()
{
    printf("What would you like to do (Enter a option from (1 - 4)): \n");
    printf("1. View patients records.\n");
    printf("2. View next patient.\n");
    printf("3. Check time table.\n");
    printf("4. Exit.\n");

    int option;
    scanf("%d", &option);

    switch (option)
    {
    case 1:
        printf("Viewing the patients records.\n");
        break;

    case 2:
        printf("Viewing the next patient.\n");
        break;

    case 3:
        printf("Checking time table.\n");
        break;
    case 4:
        printf("Exiting...\n");
        break;

    default:
        printf("Please enter a valid option next time.\n");
        printf("Exiting...\n");
        break;
    }

    return 0;
}