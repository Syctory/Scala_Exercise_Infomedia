package exercises
import scala.io.StdIn.readInt
object Exercise85_ConvertIntegerOrdinalNumber extends App {

 println ("Escriba su numero")
  var num= readInt().toInt
println (s"El numero ordinal de $num es: ${numeroOrdinal(num)}")

  // Función para obtener el número ordinal en inglés
  def numeroOrdinal(numero: Int): String = {
    numero match {
      case 1 => "first"
      case 2 => "second"
      case 3 => "third"
      case 4 => "fourth"
      case 5 => "fifth"
      case 6 => "sixth"
      case 7 => "seventh"
      case 8 => "eighth"
      case 9 => "ninth"
      case 10 => "tenth"
      case 11 => "eleventh"
      case 12 => "twelfth"
      case _ => ""
    }
  }

}
