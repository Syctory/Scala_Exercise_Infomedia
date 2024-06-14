package exercises
import scala.io.StdIn.readInt
object Exercise5_BottleDeposits extends App {

  var totalPequenos = 0
  var totalGrandes = 0
  var continuar = true

  // Ciclo while para permitir al usuario ingresar envases hasta que decida detenerse
  while (continuar) {
    println("Ingrese la cantidad de contenedores de menos de un litro")
    val cantidadPequenos = scala.io.StdIn.readInt()


    if (cantidadPequenos == 0) {
      continuar = false
    } else {
      println("Ingrese la cantidad de contenedores de más de un litro:")
      val cantidadGrandes = scala.io.StdIn.readInt()
      totalPequenos += cantidadPequenos
      totalGrandes += cantidadGrandes
    }
    println("Si no de sea ingresar mas contenedores precione la tecla 0")
  }

  val reembolsoTotal = calcularReembolso(totalPequenos, totalGrandes)

  println("El reembolso total por devolver los contenedores es: " + reembolsoTotal)

  // Función para calcular el reembolso por contenedor
  def calcularReembolso(cantidadPequenos: Int, cantidadGrandes: Int): Double = {
    val reembolsoPequenos = cantidadPequenos * 0.10
    val reembolsoGrandes = cantidadGrandes * 0.25
    val totalReembolso = reembolsoPequenos + reembolsoGrandes
    totalReembolso
  }

}
