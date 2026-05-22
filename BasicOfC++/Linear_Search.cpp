#include<iostream>
using namespace std;

int main() {
    int arr[5], item;

    cout << "Enter 5 elements:\n";

    for(int i = 0; i < 5; i++) {
        cin >> arr[i];
    }

    cout << "Enter number to search: ";
    cin >> item;

    for(int i = 0; i < 5; i++) {
        if(arr[i] == item) {
            cout << "Element Found";
            return 0;
        }
    }

    cout << "Element Not Found";

    return 0;
}