from re import T


lcm = 0 
num = 45 
while True:
    if num%6 ==0 & num%45 ==0:
        lcm = num
        break
    num += 1

    
print(lcm)

'''
>>> lcm = 0
>>> num = 45
>>> while True:
...     if num %6 == 0 and num%45 == 0:
...             lcm = num                       
...             break
...     num += 1
... 
>>> lcm
90
'''
    
