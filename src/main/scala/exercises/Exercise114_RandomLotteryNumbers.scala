package exercises
import scala.util.Random
object Exercise114_RandomLotteryNumbers extends App {
  // Función para generar una selección aleatoria de 6 números únicos
  def generarNumerosLoteria(): Seq[Int] = { //Seq nos permite generar la secuencia primitiva
    val random = new Random()
    // Creamos un conjunto mutable para almacenar los números únicos
    val numerosUnicos = scala.collection.mutable.Set[Int]()
    // Generamos números hasta que tengamos 6 números únicos
    while (numerosUnicos.size < 6) {
      val numero = random.nextInt(49) + 1 // Genera un número aleatorio entre 1 y 49
      numerosUnicos.add(numero)
    }
    numerosUnicos.toSeq.sorted // Convertimos el conjunto a una secuencia ordenada y la devolvemos
  }

  // Generar los números de la lotería
  val numerosLoteria = generarNumerosLoteria()

  // Mostrar los números de la lotería en orden ascendente
  println("Los números de la lotería son:")
  numerosLoteria.foreach(numero => print(s"$numero "))
}
