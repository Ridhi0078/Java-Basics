#include <stdio.h>
#include<conio.h>

int binarySearch(int arr[], int left, int right, int key) {
    if (right >= left) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == key)
            return mid;
        if (arr[mid] > key)  {
            return binarySearch(arr, left, mid - 1, key);
        }
        return binarySearch(arr, mid + 1, right, key);
    }
    return -1;
}

int main() {
    int arr[] = {65,43,45,78,98,23,44,28};
    int size = sizeof(arr) / sizeof(arr[0]);
    int key = 65;

    int index = binarySearch(arr, 0, size - 1, key);
    if (index == -1) {
        printf("Element is not present in array");
    }
    else {
        printf("Element is present at index %d", index);
    }
    return 0;
}