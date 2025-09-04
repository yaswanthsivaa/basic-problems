// Summing the Digits of Number

#include <iostream>
using namespace std;

int main(){
  
  cout << "Enter a Number :";
  int num;
  cin >> num;

  int sum;
  for(;num>0;){
    int digit = num % 10;
    sum += digit;
    num /= 10;
  }

  cout << "The Sum of the Number is :" << sum;
  return 0;
}