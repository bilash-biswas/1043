a = io.read("*n")
b = io.read("*n")
c = io.read("*n")
if(a < b + c and b < a + c and c < a + b)then
    print("Perimetro = "..string.format( "%.1f", a + b + c ))
else
    z = 0.5 * (a + b) * c
    print("Area = "..string.format( "%.1f", z ))
end
