#include <stdio.h>
#include <math.h>

int main(int argc, char *argv[]) {
    int radius;
    double PI = (double) 355 / 113;

    // Area of a Sphere = 4 / 3 * PI * r ^ 3
    printf("Enter the radius of the sphere here: ");

    scanf("%i", &radius);
    
    double volume = ((double) 4 / 3) * PI * pow(radius, 3);
    printf("The volume of the sphere with radius %i is %f meters cubed\n", radius, volume); 
    return 0;
}