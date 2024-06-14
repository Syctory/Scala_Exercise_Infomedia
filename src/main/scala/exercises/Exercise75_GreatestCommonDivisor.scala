package exercises
import scala.io.StdIn.readInt
import math.min
object Exercise75_GreatestCommonDivisor extends App  {



  // Leer dos enteros positivos del usuario
  println("Ingrese el primer número:")
  val n = readInt()

  println("Ingrese el segundo número:")
  val m = readInt()

  // Calcular y mostrar el máximo común divisor de los números ingresados
  val mcd = calcularMCD(n, m)
  println(s"El máximo común divisor de $n y $m es: $mcd")

  // Función para calcular el máximo común divisor (MCD) de dos números
  def calcularMCD(n: Int, m: Int): Int = {
    // Inicializar d al mínimo entre n y m
    var d = min(n, m)

    while (n % d != 0 || m % d != 0) {
      d -= 1
    }

    d
  }
}
