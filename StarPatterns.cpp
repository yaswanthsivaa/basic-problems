// Star Pattern

#include <iostream>
using namespace std;

// Right Angle Triangle

void rightAngleTriangle(int rowsAndCols){
   
  for(int i=1; i<rowsAndCols+1; i++){
    for(int j=0; j<rowsAndCols-i; j++){
      cout << " ";
    }
    for(int k=0; k<i; k++){
      cout << "*";
    }
    cout << '\n';
  }
}

// Pyramid

void pyramid(int rowsAndCols){

   for(int i=1; i<rowsAndCols+1; i++){
     for(int j=1; j<=rowsAndCols-i; j++){
        cout << " ";
     }
     for(int k=0; k<(2*i-1); k++){
      cout << "*";
     }
     cout << '\n';
   }
}

int main(){

  cout << "Enter a Number :";
  int rowsCols;
  cin >> rowsCols;
  cout << "\n--- RIGHT ANGLE TRIANGLE ---\n";
  rightAngleTriangle(rowsCols);
  cout << "\n--- PYRAMID ---\n";
  pyramid(rowsCols);
}