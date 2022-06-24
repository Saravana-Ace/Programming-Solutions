//
//  main.cpp
//  Team
//
//  Created by Saravana Polisetti on 6/24/22.
//

#include <iostream>
using namespace std;

int main() {
    int probs, first, second, third, count = 0;
    cin >> probs;
    for(int i = 0; i < probs; i ++) {
        cin >> first;
        cin >> second;
        cin >> third;
        if(first + second + third > 1)
            count++;
    }
    cout << count;
    return 0;
}
