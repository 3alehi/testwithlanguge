#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main() {
    srand(time(NULL)); // set the seed for randomization using current time
    const int code_length = 8; // set the length of the security code
    string code = "";

    for (int i = 0; i < code_length; i++) {
        char c = 'A' + rand() % 26; // generate a random uppercase letter
        code += c;
    }

    cout << "Your security code is: " << code << endl;
    return 0;
}
