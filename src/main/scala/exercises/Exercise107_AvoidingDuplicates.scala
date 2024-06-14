package exercises
import scala.collection.mutable.HashSet
import scala.io.StdIn.readLine
object Exercise107_AvoidingDuplicates extends App {

  // Conjunto mutable para almacenar las palabras únicas ingresadas por el usuario
  val palabrasUnicas = HashSet[String]() //crea instancia vacia

  println("Ingrese palabras. Presione Enter para terminar.")
  var palabra = readLine()
  while (palabra.nonEmpty) { //NonEmpty[A]denota que es una lista no vacía cuyos elementos son de tipo A
    palabrasUnicas.add(palabra)
    palabra = readLine()
  }

  // Mostrar cada palabra única ingresada por el usuario en el mismo orden
  println("Palabras únicas ingresadas:")
  palabrasUnicas.foreach(println)

}
