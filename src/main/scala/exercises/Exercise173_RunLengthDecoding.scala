package exercises

object Exercise173_RunLengthDecoding extends App {
  def decodeRunLength(list: List[Any]): List[Any] = list match {
    case Nil => Nil
    case (elem: Any) :: (count: Int) :: tail => List.fill(count)(elem) ::: decodeRunLength(tail)
    case head :: tail => head :: decodeRunLength(tail)
  }

  // Ejemplo de lista codificada con run-length
  val encodedList = List("A", 12, "B", 4, "A", 6, "B", 1)

  // Decodificar la lista y mostrar el resultado
  val decodedList = decodeRunLength(encodedList)
  println("Lista codificada: " + encodedList)
  println("Lista decodificada: " + decodedList)
}
