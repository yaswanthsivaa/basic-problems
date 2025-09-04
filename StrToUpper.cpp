// String to Uppercase String

#include <iostream>
using namespace std;

int main(){
  
  string str;
  cout << "Enter a Name :";
  cin >> str;
  
  string strUpper = "";

  for(char letter : str){
    strUpper += toupper(letter);
  }

  cout << "Captitalized String  : ";
  cout << strUpper;

  return 0;
}