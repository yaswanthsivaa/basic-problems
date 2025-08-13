# Celcius to Fahrenheit

try:
   celcius = eval(input('Enter the Temperature (Celcius) :'))
   fahrenheit = int((celcius * 9/5) + 32)
   
   # Converting Celcius to Fahrenheit

   print(f"Temperature in Fahrenheit : {fahrenheit} 'Fahrenheit'")
except:
   print("*Invalid Input!")
