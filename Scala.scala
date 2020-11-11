object Main {
  def main(args:Array[String]){
    var Array(a,b,c) = scala.io.StdIn.readLine().split(" ").map(_.toDouble)
     if(a < b + c && b < a + c && c < a + b)
    {
        println("Perimetro = %.1f".format(a + b + c))
    }
    else
    {
        var z = 0.5 * (a + b) * c
        println("Area = %.1f".format(z))
    }
  }
}
