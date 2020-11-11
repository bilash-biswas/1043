a,b,c = input().split()
a = float(a)
b = float(b)
c = float(c)
if a < b + c and b < a + c and c < a + b :
    print("Perimetro = {0:.1f}".format(a + b + c))
else:
    z = 0.5 * (a + b) * c
    print("Area = {0:.1f}".format(z))

    
