package exercises
import scala.io.StdIn.readLine
object Exercise67_AdmissionPrice extends App {

  println("Ingrese las edades de los huéspedes (una por línea). Presione Enter para finalizar:")

  var edades: List[Int] = List()
  var entrada = readLine()

  while (entrada != "") {
    val edad = entrada.toInt
    edades = edades :+ edad
    entrada = readLine()
  }

  // Calcular el precio total de admisión para el grupo
  val precioTotal = edades.map(calcularPrecioEdad).sum
  println(f"El costo total de admisión para el grupo es: $$$precioTotal%.2f")

  // Función para calcular el precio de admisión para un huésped
  def calcularPrecioEdad(edad: Int): Double = edad match {
    case e if e <= 2 => 0.00
    case e if e >= 3 && e <= 12 => 14.00
    case e if e >= 65 => 18.00
    case _ => 23.00
  }
}
