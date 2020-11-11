import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double a,b,c,z;
    a = input.nextDouble();
    b = input.nextDouble();
    c = input.nextDouble();
    if(a < b + c && b < a + c && c < a + b)
    {
        System.out.printf("Perimetro = %.1f\n", a + b + c);
    }
    else
    {
        z = 0.5 * (a + b) * c;
        System.out.printf("Area = %.1f\n", z);
    }
  } 
}
