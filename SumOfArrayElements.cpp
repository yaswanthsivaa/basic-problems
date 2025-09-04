// Sum of elements in the Array

#include <iostream>

int main(){

  int nums[5];
  int size = sizeof(nums) / sizeof(nums[0]);
  
  std::cout << "Enter the Elements  :\n";
  
  // Inputting the Values to Array

  for(int i=0; i<size; i++){
    std::cin >> nums[i];
  }
  
  // Sum+ing Elements
  
  int count=0;
  int sum=0;
  while(count < size){
    sum += nums[count];
    count++;
  }

  std::cout << "The sum of All Array Elements is : " << sum;
  return 0;
}