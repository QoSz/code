#include <stdio.h>

int main()
{
    printf("Choose a menu option (1 - 4): \n");
    printf("1. Enter patients details.\n");
    printf("2. View a patient\n");
    printf("3. Search a patient\n");
    printf("4. Exit\n");

    int input;
    scanf("%d", &input);

    if (input == 1)
    {
        printf("Entering patients details\n");
    }
    else if (input == 2)
    {
        printf("Viewing a patient\n");
    }
    else if (input == 3)
    {
        printf("Searching for a patients records\n");
    }
    else if (input == 4)
    {
        printf("Exiting....\n");
        printf("Do you want to save your changed? (Y/N): \n");

        char b = getchar(); // Used to clear out the input stream. So removes any \n left from previous scanf's when used for int.
        char q;
        scanf("%c", &q);

        if (q == 'Y' || q == 'y')
        {
            printf("Saving changes.\n");
        }
        else if (q == 'N' || q == 'n')
        {
            printf("Any changes made were discarded.\n");
        }
        else
        {
            printf("Self distructing in 3..2..1..Booooom!\n");
        }
    }
    else
    {
        printf("Incorrrect input\n");
    }

    return 0;
}