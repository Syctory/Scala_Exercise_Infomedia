package exercises

object Exercise148_SumaListofNumbers extends App {
  var sum = 0.0

  println("Ingrese números para sumar. Presione Enter para sumar y mostrar el resultado. Deje en blanco para terminar.")

  var input = ""
  def sumarNumeros(): Unit = {
    while ( {
      input = scala.io.StdIn.readLine(); input.nonEmpty
    }) {
      try {
        val number = input.toDouble
        sum += number
        println(s"Suma actual: $sum")
      } catch {
        case _: NumberFormatException => println("Error: Entrada no válida. Intente de nuevo.")
      }
    }
  }
  sumarNumeros()
}
