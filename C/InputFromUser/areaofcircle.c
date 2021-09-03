#include <stdio.h>
#include <math.h>

int main(int argc, char *argv[]) {
    int radius; // Distance from center to a point outside of the circle
    printf("Enter a radius here: ");
    scanf("%i", &radius); // Gets input from the user
    double area = (355.0/(float) 113) * pow(radius, 2);
    printf("The area of a circle of radius %i is %.10f\n", radius, area);
    return 0;
}
