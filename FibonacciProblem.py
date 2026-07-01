# Fibonacci Series Using Loop
  # Time Complexity = O(N)
  # Space Complexity = O(1)

prev = 1
prevPrev = 0

for i in range(0, 11):
    if i == 0:
        print(prevPrev)
        continue
     
    if i == 1:
        print(prev)
        continue

    temp = prev + prevPrev
    prevPrev = prev
    prev = temp
    print(temp)
