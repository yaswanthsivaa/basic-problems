// Making the String Reverse

#include <iostream>
#include <string>
using namespace std;

string reverseString(string str){
  
  int size = str.length();
  
  char first = str[0];
  char last = str[size-1];
  
  int firstIndex = 0;
  int lastIndex = size-1;

  while(firstIndex < lastIndex){
    char temp = str[firstIndex];
    str[firstIndex] = str[lastIndex];
    str[lastIndex] = temp;

    firstIndex++;
    lastIndex--;
  }

  return str;

}

int main(){

  string name = "Consistent Coder";

  string reversed = reverseString(name);

  cout << "Reversed string : " << reversed;
  
  return 0;
}