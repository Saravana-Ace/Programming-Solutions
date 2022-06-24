//
//  main.cpp
//  Anton_and_Danik
//
//  Created by Saravana Polisetti on 6/24/22.
//

#include <iostream>
#include <string>
using namespace std;

int main(int argc, const char * argv[]) {
    int count,ant = 0, dan = 0;
    string games;
    
    cin >> count;
    cin >> games;
    
    for(int i = 0; i < count; i++) {
        if(games[i] == 'A')
            ant++;
        else
            dan++;
    }
    
    if(ant > dan)
        cout << "Anton";
    else if (dan > ant)
        cout << "Danik";
    else
        cout << "Friendship";
    return 0;
}
