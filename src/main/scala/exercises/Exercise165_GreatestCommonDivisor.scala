package exercises

object Exercise165_GreatestCommonDivisor extends App {

  println("Ingrese dos enteros para calcular su máximo común divisor:")
  val a = scala.io.StdIn.readInt()
  val b = scala.io.StdIn.readInt()

  val resultado = mcd(a, b)
  println(s"El máximo común divisor de $a y $b es: $resultado")

  // Función para calcular el máximo común divisor utilizando el algoritmo de Euclides
  def mcd(a: Int, b: Int): Int = {
   if (b==0){
     a
   }
   else {
      mcd(b,(a%b))
   }
  }
}
