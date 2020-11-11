#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
    double a,b,c,z;
    cin>>a;
    cin>>b;
    cin>>c;
    if(a < b + c && b < a + c && c < a + b)
    {
        cout<<"Perimetro = "<<fixed<<setprecision(1)<<a + b + c<<endl;
    }
    else
    {
        z = 0.5 * (a + b) * c;
       cout<<"Area = "<<fixed<<setprecision(1)<<z<<endl;
    }
    return 0;
}
