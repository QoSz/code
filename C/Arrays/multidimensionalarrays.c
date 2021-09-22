#include <stdio.h>

int main()
{

    /*
        Single dimensional array would look like this int myGrades[number of columns] = {values}
        multi dimensional arrays would look like this int myGrades[number of rows][number of columns] = {values, values}
    */

    int myGradesSingle[] = {90, 88, 74}; // Single Dimension

    // int const columns = 4; // The columns must be specified in a multi dimensional array
    // int const rows = 3;
    int num[3][4] = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12}};

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            printf("%d ", num[i][j]);
        }
        printf("\n");
    }

    return 0;
}