#include <iostream>
using namespace std;

class Atm {
private:
    int paisa;   // data hidden (encapsulation)

public:
    // constructor
    Atm(int p) {
        paisa = p;
    }

    // function to withdraw money
    int withdraw(int a) {
        if (paisa >= a) {
            paisa = paisa - a;
        } else {
            cout << "Insufficient Balance" << endl;
        }
        return paisa;
    }
};

int main() {
    Atm t1(100);      // object create
    int x = t1.withdraw(20);  // withdraw
    cout << x;        // output

    return 0;
}