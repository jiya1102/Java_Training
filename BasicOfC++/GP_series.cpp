#include <iostream>
using namespace std;

int main() {
    int a, r, n;
    
    cout << "Enter first term (a): ";
    cin >> a;
    
    cout << "Enter common ratio (r): ";
    cin >> r;
    
    cout << "Enter number of terms (n): ";
    cin >> n;

    cout << "GP Series: ";

    for(int i = 0; i < n; i++) {
        cout << a << " ";
        a = a * r;  // next term
    }

    return 0;
}