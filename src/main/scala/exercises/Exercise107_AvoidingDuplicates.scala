package exercises
import scala.collection.mutable.HashSet
import scala.io.StdIn.readLine
object Exercise107_AvoidingDuplicates extends App {

  // Conjunto mutable para almacenar las palabras únicas ingresadas por el usuario
  val palabrasUnicas = HashSet[String]()

  println("Ingrese palabras. Presione Enter para terminar.")
  var palabra = readLine()
  while (palabra.nonEmpty) {
    palabrasUnicas.add(palabra)
    palabra = readLine()
  }

  // Mostrar cada palabra única ingresada por el usuario en el mismo orden
  println("Palabras únicas ingresadas:")
  palabrasUnicas.foreach(println)

}
