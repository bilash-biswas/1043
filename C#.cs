using System.IO;
using System;

class Program
{
    static void Main()
    {
        double a,b,c,z;
        var p = Console.ReadLine().Split();
        a = double.Parse(p[0]);
        b = double.Parse(p[1]);
        c = double.Parse(p[2]);
    if(a < b + c && b < a + c && c < a + b)
    {
        Console.WriteLine("Perimetro = {0:0.0}", a + b + c);
    }
    else
    {
        z = 0.5 * (a + b) * c;
        Console.WriteLine("Area = {0:0.0}", z);
    }
  }
}
