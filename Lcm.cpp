// Finding the Lcm of Numbers

#include <iostream>
using namespace std;

int gcd(int a, int b){

  while(b != 0){
    int temp = b;
    b = a % b;
    a = temp;
  }

  return a;
}

int lcm(int a, int b){
  return (a * b) / gcd(a, b);
}

int main(){

  int num;
  cout << "Enter the Values :";
  cin >> num;
  
  int num2;
  cout << "Enter the Values :";
  cin >> num2;

  cout << lcm(num, num2);
    
  return 0;
}