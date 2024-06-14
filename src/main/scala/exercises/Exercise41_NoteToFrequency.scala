package exercises
import scala.io.StdIn.readInt
import scala.io.StdIn.readLine

object Exercise41_NoteToFrequency extends App {
  println("Ingrese el nombre de la nota (por ejemplo, C, D, E):")
  val note = readLine().charAt(0).toUpper

  println("Ingrese el número de octava (por ejemplo, 4 para la cuarta octava):")
  val octave = readInt()

  // Calcular y mostrar la frecuencia de la nota
  val frequency = calculateFrequency(note, octave)
  if (frequency != 0.0) {
    println(s"La frecuencia de la nota "+ note + " octave es:" + frequency+"Hz")
  } else {
    println("Nota no válida. Por favor, ingrese una nota válida.")
  }


  // Función para calcular la frecuencia de una nota en base a su nombre y octava
  def calculateFrequency(note: Char, octave: Int): Double = {
    // Calcular la frecuencia en base a la nota y la octava
    val frequency = if (octave == 4) {

      note match {
        case 'C' => 261.63
        case 'D' => 293.66
        case 'E' => 329.63
        case 'F' => 349.23
        case 'G' => 392.00
        case 'A' => 440.00
        case 'B' => 493.88
        case _ => 0.0
      }
    } else {
      // Calcular la frecuencia en base a la octava
      val baseFrequency = calculateFrequency(note, 4)
      baseFrequency / math.pow(2, 4 - octave)
    }

    frequency
  }


}
