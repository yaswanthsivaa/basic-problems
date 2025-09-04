// Print the Numbers in Reverse Order

#include <iostream>

int main(){
  
  int nums[10];
  int size = sizeof(nums) / sizeof(nums[0]);
  
  std :: cout << "--- Enter the Numbers : ---\n";
  for(int num=0; num<size; num++){
     std :: cin >> nums[num];
  }

  // Printing Numbers in Reverse
  std :: cout << "--- Printing the Numbers in Reverse Order : ---\n";
  for(int i=size-1; i>-1; i--){
     std :: cout << nums[i] << '\n';
  }

  return 0;
}