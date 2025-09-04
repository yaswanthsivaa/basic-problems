// Reverse Array

#include <iostream>

int main(){

  const char *languages[4] = {"C", "C++", "Java", "Python"};
  int size = sizeof(languages)/ sizeof(languages[0]);
  
  for(int i=size-1; i>-1; i--){
    std::cout << languages[i] << '\n';
  }
  return 0;
}