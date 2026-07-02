# Pattern Search in Large Text 

s1 = input()
s2 = input()

s1Len = len(s1)
s2Len = len(s2)

res = []
if s1Len > s2Len:
  for i in range(s1Len-s2Len+1):
    sliced = s1[i:s2Len+i]
    if sliced == s2:
      res.append(i)
else:
  for i in range(s2Len):
    sl = s2[i:s1Len+i]

    if sliced == s1:
      res.append(i)

if len(res) == 0:
  print("No match found")
else:
  print(*res)
