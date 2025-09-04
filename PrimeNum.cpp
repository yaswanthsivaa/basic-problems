// Prime Numbers

#include <iostream>

// Check whether given Number is Prime number or not ...

bool checkPrime(int previous, int num){
    if (num % previous == 0 || previous == 1){
      if(previous == 1){
        return true;
      }
      return false;
    }
    else{ 
      return checkPrime(previous-1, num);
    }     
}

int main(){
  
  int num;
  std :: cout << "Enter a Number :";
  std :: cin >> num;
  bool check = checkPrime(num-1, num);
  if(check)
    std :: cout << "Yes! Given Number is Prime Number . . .";
  else
    std :: cout << "No! Given Number is not Prime Number . . . ";
  return 0;
}