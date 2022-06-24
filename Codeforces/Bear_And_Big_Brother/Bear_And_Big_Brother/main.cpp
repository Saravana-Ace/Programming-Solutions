//
//  main.cpp
//  Bear_And_Big_Brother
//
//  Created by Saravana Polisetti on 6/24/22.
//

#include <iostream>
using namespace std;

int main() {
    int l, b, years = 0;
    cin >> l;
    cin >> b;
    
    while (l <= b) {
        l *= 3;
        b *= 2;
        years++;
    }
    
    cout << years;
    return 0;
}
