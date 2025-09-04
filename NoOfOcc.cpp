// Number of Occurences

#include <iostream>
using namespace std;

int main(){
  
  int nums[] = {1,2,3,1,2};

  int s = sizeof(nums) / sizeof(nums[0]);
  
  int hash[5] = {0};
  
  for(int i=0; i<s; i++){
    int num = nums[i] % 10;
    hash[num]++;
  }
  
  int number;
  cout << "Enter a Number :";
  cin >> number;

  cout << hash[number];
  
  return 0;
}