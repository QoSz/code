#include <stdio.h>

typedef struct
{
    int height;
    int width;
} rectangle;

typedef struct
{
    int x;
    int y;
} position;

typedef struct
{
    char owner[30];
    rectangle rectangle;
    position position;
} buildingPlan;

int main()
{

    rectangle myRectange = {40, 20};

    printf("Length = %d\n", myRectange.height);
    printf("Width = %d\n", myRectange.width);

    buildingPlan myHouse = {"Yash Shah", {100, 200}, {124, 163}};

    printf("The house at %d, %d (size %d * %d) and is owned by %s\n",
           myHouse.position.x,
           myHouse.position.y,
           myHouse.rectangle.height,
           myHouse.rectangle.width,
           myHouse.owner);

    int size = 3;
    position path[] = {{0, 1}, {1, 2}, {3, 4}};

    for (int i = 0; i < size; i++)
    {
        printf("%d %d\n", path[i].x, path[i].y);
    }

    buildingPlan *structPointer = &myHouse;
    printf("Position x: %d\n", structPointer->position.x);

    return 0;
}