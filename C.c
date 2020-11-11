#include<stdio.h>
int main()
{
    double a,b,c,z;
    scanf("%lf",&a);
    scanf("%lf",&b);
    scanf("%lf",&c);
    if(a < b + c && b < a + c && c < a + b)
    {
        printf("Perimetro = %.1lf\n", a + b + c);
    }
    else
    {
        z = 0.5 * (a + b) * c;
        printf("Area = %.1lf\n", z);
    }
    return 0;
}
