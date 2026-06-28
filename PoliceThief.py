
d = 1
s2 = "PTTPT"

count = 0
used = []
for i in range(len(s2)):
  left = max(0, i-d)
  right = min(len(s2) - 1, i+d)

  for j in range(left, right+1):
    if s2[i] != s2[j] and i not in used and j not in used:
      if s2[i] == 'P':
        used.append(i)
      else:
        used.append(j)
      count += 1
      break 
print(count)
