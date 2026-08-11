# The Clock Problem
  # Time Complexity = O(1)
  # Space Complexity = O(1)

t1 = int(input())
t2 = int(input())

railwayTime = t1 * t2
normalTime = 12 if railwayTime % 12 == 0 else railwayTime
print(normalTime)
