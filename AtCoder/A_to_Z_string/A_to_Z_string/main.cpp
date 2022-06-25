//
//  main.cpp
//  A_to_Z_string
//
//  Created by Saravana Polisetti on 6/25/22.
//

#include <iostream>
#include <string>
using namespace std;

int main() {
    int count;
    int index;
    cin >> count;
    cin >> index;
    index--;
    
    string letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    string newLetters = "";
    for(int i = 0; i < letters.size(); i++) {
        for (int j = 0; j < count; j++) {
            newLetters += letters[i];
        }
    }
    
    cout << newLetters[index];
    return 0;
}
