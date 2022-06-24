//
//  main.cpp
//  Vanya_and_friends
//
//  Created by Saravana Polisetti on 6/24/22.
//

#include <iostream>
//#include <string>
using namespace std;


int main() {
    int friends,height, checkH, count = 0;
    
    cin >> friends;
    cin >> height;
    
    for (int i = 0; i < friends; i++) {
        cin >> checkH;
        if(checkH > height)
            count += 2;
        else
            count += 1;
    }
    
    cout << count;
    return 0;
}
