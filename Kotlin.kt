import java.util.Scanner

fun main(args: Array<String>){
    val read = Scanner(System.`in`);
    var a = read.nextDouble()
    var b = read.nextDouble()
    var c = read.nextDouble()
    if(a < b + c && b < a + c && c < a + b)
    {
        println("Perimetro = %.1f".format(a + b + c));
    }
    else
    {
        var z = 0.5 * (a + b) * c;
        println("Area = %.1f".format(z));
    }
}

    
