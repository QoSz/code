#include <stdio.h>
#include <math.h>

int main() {
    double adjacent, opposite, hypotenuse;

    printf("This app will calculate the hypotenuse of a right angle triangle.");

    printf("Enter length for adjacent side: \n");
    scanf("%lf", &adjacent);

    printf("Enter length for opposite side: \n");
    scanf("%lf", &opposite);

    hypotenuse = sqrt(pow(adjacent, 2) + pow(opposite, 2));
    printf("Length of hypotenuse is equal to: %f\n", hypotenuse);

    return 0;   
}