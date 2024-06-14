package exercises

object Exercise135_Anagrams extends App{

    // Leer las dos cadenas desde la entrada estándar
    println("Ingrese la primera cadena:")
    val str1 = scala.io.StdIn.readLine()
    println("Ingrese la segunda cadena:")
    val str2 = scala.io.StdIn.readLine()

    // Verificar si las cadenas son anagramas
    val result = if (areAnagrams(str1, str2)) {
      "son"
    } else {
      "no son"
    }


    println(s"Las cadenas '$str1' y '$str2' $result anagramas.")


  // Función para verificar si dos cadenas son anagramas
  def areAnagrams(str1: String, str2: String): Boolean = {
    // Convertir las cadenas a listas de caracteres, eliminar espacios en blanco y ordenarlas
    val sortedStr1 = str1.toLowerCase.filter(_.isLetter).sorted
    val sortedStr2 = str2.toLowerCase.filter(_.isLetter).sorted
    sortedStr1 == sortedStr2
  }

}
