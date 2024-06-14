/*calculos
Pies a pulgadas =
Pies a yardas =
Pies a millas =
 */

package exercises

object Exercise15_DistanceUnits extends App{

  println("Ingrese la medida en pies:")
  val feet = scala.io.StdIn.readLine().toDouble

  // Convertimos las pulgadas
  val pies = feetToInches(feet)
  val yardas = feetToYards(feet)
  val millas = feetToMiles(feet)

  println(s"$feet pies es equivalente a:")
  println(s"Pulgadas: ${"%.2f".format(pies)}")
  println(s"Yardas: ${"%.2f".format(yardas)}")
  println(s"Millas: ${"%.2f".format(millas)}")

  def feetToInches(feet: Double): Double = {
    val inchesPerFoot = 12
    feet * inchesPerFoot
  }

  def feetToYards(feet: Double): Double = {
    val yardsPerFoot = 1.0 / 3.0
    feet * yardsPerFoot
  }

  def feetToMiles(feet: Double): Double = {
    val milesPerFoot = 1.0 / 5280.0
    feet * milesPerFoot
  }
}
