var
a,b,c,z : double;
begin
    read(a);
    read(b);
    read(c);
   if((a < b + c) and (b < a + c) and (c < a + b))then
      writeln('Perimetro = ', a + b + c :-1:1)
   else
   begin
      z := 0.5 * (a + b) * c;
      writeln('Area = ', z :-1:1);
   end
end.
