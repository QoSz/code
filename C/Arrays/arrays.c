#include <stdio.h>

int main()
{

    // sizeof() is a method for calculating the size of an array.

    int myGrades[] = {60, 75, 89, 91, 78, 88};
    int size;

    size = sizeof(myGrades) / sizeof(myGrades[0]); //Method

    for (int i = 0; i < size; i++)
    {
        printf("%d\n", myGrades[i]);
    }

    return 0;
}