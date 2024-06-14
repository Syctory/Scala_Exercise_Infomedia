package exercises
import scala.io.StdIn.readLine
import scala.util.Try
object Exercise32_Sort3Integers extends App {

  // Leer el primer número entero del usuario
  println("Ingrese el primer  número:")
  var num1=readLine().toInt

  // Leer el segundo número entero del usuario
  println("Ingrese el segundo número:")
  var num2 =readLine().toInt

  // Leer el tercer número entero del usuario
  println("Ingrese el tercer número:")
  var num3 =readLine().toInt



  // Ordenar los números
  val minNum = num1 min num2 min num3
  val maxNum = num1 max num2 max num3
  val medio = num1 + num2 + num3- minNum - maxNum

  // Mostrar los números ordenados de menor a mayor
  println(s"Los números ordenados de menor a mayor son: $minNum, $medio, $maxNum")

}
