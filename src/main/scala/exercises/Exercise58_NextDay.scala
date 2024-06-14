package exercises
import scala.io.StdIn.readInt
object Exercise58_NextDay extends App {



    println("Ingrese el año:")
    val año = readInt()

    println("Ingrese el mes:")
    val mes = readInt()

    println("Ingrese el día:")
    val día = readInt()

    // Verificar si es un año bisiesto
    val esBisiesto = (año % 4 == 0) && (año % 100 != 0 || año % 400 == 0)

    // Definir el número de días en cada mes
    val díasEnMes = mes match {
      case 1 | 3 | 5 | 7 | 8 | 10 | 12 => 31
      case 4 | 6 | 9 | 11 => 30
      case 2 => if (esBisiesto) 29 else 28
      case _ => 0 // Mes no válido
    }

    // Calcular el sucesor de la fecha
    val (nuevoAño, nuevoMes, nuevoDía) = if (día < díasEnMes) {
      (año, mes, día + 1)
    } else if (mes < 12) {
      (año, mes + 1, 1)
    } else {
      (año + 1, 1, 1)
    }

    // Mostrar el sucesor de la fecha
    println(s"El día siguiente a $año/$mes/$día  es: $nuevoAño/$nuevoMes/$nuevoDía")


}
