#include <stdio.h>
#include<conio.h>

int linearSearch(int arr[], int size, int key)
{
    if (size == 0) {
        return -1;
    }

    if (arr[size - 1] == key) {
        return size - 1;
    }
    return linearSearch(arr, size - 1, key);
}

int main()
{
    int arr[] = {45,63,33,98,56,23};
    int key = 56;
    int index
        = linearSearch(arr, sizeof(arr) / sizeof(int), key);
    if (index == -1) {
        printf("Key not found in the array.\n");
    }
    else {
        printf("The element %d is found at %d index of the "
               "given array \n",
               key, index);
    }
    return 0;
}