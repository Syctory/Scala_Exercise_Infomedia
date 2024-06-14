package exercises

object Exercise92_NumberPrime extends App {
  // Leer un número entero del usuario
  println("Ingrese un número entero:")
  var num = scala.io.StdIn.readInt()
  println (s"El numero es: ${esPrimo(num)}")

  //Funcion para determinar si el numero es primo
  def esPrimo(numero: Int): Boolean = {
    if (numero <= 1) {
      false
    } else if (numero <= 3) {
      true
    } else if (numero % 2 == 0 || numero % 3 == 0) {
      false
    } else {
      var i = 5
      while (i * i <= numero) {
        if (numero % i == 0 || numero % (i + 2) == 0) {
          return false
        }
        i += 6
      }
      true
    }
  }
}

