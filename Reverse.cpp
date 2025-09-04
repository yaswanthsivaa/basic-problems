// Reverse a Number

#include <iostream>

int main(){
  
  int num;
  std::cout << "Enter a Number  :";
  std::cin >> num;

  // Reverse a Number

  int reverseNum = 0;
  
  // Reversing a Number

  while(num > 0){
    reverseNum = reverseNum * 10 + num % 10;
    num = num / 10;
  }

  std::cout << reverseNum;
  return 0;
}