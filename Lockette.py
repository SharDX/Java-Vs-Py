print("Welcome to Lockette.Py")
print(" Version 0.1 ")
token = 2
DPassword = ("123")
DUser = ("User")
User = str(input('Enter Your Username : '))
Password = int(input('Enter your Password : '))
if User == DUser and Password == DPassword:
  print("Right Password ")
  token = 1
else: 
  print(" Wrong Password ")
  token = 0 
