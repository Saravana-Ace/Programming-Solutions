//
//  main.cpp
//  squares
//
//  Created by Saravana Polisetti on 6/25/22.
//

#include <iostream>
using namespace std;

int main() {
    int squares, pieces, operations;
    cin >> squares;
    cin >> pieces;
    cin >> operations;
    
    int numSquares [squares];
    int indPiece [pieces];
    int moves [operations];
    
    for(int i = 0; i < squares; i++)
        numSquares[i] = 0;
    
    for(int i = 0; i < pieces; i++) {
        cin >> indPiece[i];
        numSquares[indPiece[i] - 1] = 1;
    }

    for(int i = 0; i < squares; i++) {
        if(numSquares[i] != 1) {
            numSquares[i] = 0;
        }
    }
    
    for(int i = 0; i < operations; i++) {
        cin >> moves[i];
        moves[i]--;
    }
    
    int temp;
    for(int i = 0; i < operations; i++) {
        temp = numSquares[indPiece[moves[i]]-1];
        
        if(temp == 1 && indPiece[moves[i]] < squares && numSquares[indPiece[moves[i]]] == 0) {
            numSquares[indPiece[moves[i]]] = 1;
            numSquares[indPiece[moves[i]]-1] = 0;
            indPiece[moves[i]]++;
        }
    }
    
    for(int i = 0; i < pieces; i++)
        cout << indPiece[i] << " ";
    return 0;
}
