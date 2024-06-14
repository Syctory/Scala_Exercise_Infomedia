package exercises
import scala.math._
import scala.io.StdIn.readLine
object Exercise23_AreaRegularPolygon extends App{

    println("Ingrese la longitud de un lado:")
    val longitudLado = scala.io.StdIn.readLine().toDouble

    println("Ingrese el número de lados:")
    val numLados = readLine().toInt

    // Calcular el área del polígono regular
    val area = calcularArea(longitudLado, numLados)
    println(s"El área del polígono regular con $numLados lados y longitud de lado $longitudLado es: ${"%.2f"format(area)}")

  // Función para calcular el área de un polígono regular
  def calcularArea(longitudLado: Double, numLados: Int): Double = {
    val perimetro = longitudLado * numLados
    val apotema = longitudLado / (2 * math.tan(math.Pi / numLados))
    0.5 * perimetro * apotema
  }
}
