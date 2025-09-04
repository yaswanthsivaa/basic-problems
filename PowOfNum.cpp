// Calculating pow of Num using Recursion

#include <iostream>

int power(int n, int pow){

  if(pow == 1)
    return n;
  else{
    return power(n, pow-1)*n;
    
  }
}

int main(){
  
  int num;
  std :: cout << "Enter a Number :";
  std :: cin >> num;

  int pow;
  std :: cout << "Enter the Power Number :";
  std :: cin >> pow;

  int powerOfNumber = power(num, pow);

  std :: cout << "The Power of " << num << " is " << powerOfNumber;
  return 0;
}