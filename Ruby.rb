a,b,c = gets().chomp().split(' ');
a = a.to_f
b = b.to_f
c = c.to_f
if a < b + c && b < a + c && c < a + b
    printf("Perimetro = %.1f\n", a + b + c);
else
    z = 0.5 * (a + b) * c;
    printf("Area = %.1f\n", z);
end
