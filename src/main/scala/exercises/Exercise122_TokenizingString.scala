package exercises
import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readLine
object Exercise122_TokenizingString extends App {

    println("Ingrese una expresión matemática:")
    val expression = readLine()

    // Tokenizar la expresión matemática
    val tokens = tokenize(expression)

    // Imprimir la lista de tokens
    println("Tokens:")
    tokens.foreach(println)

  // Función para tokenizar una expresión matemática
  def tokenize(expression: String): List[String] = {
    val tokens = ListBuffer[String]()
    var currentToken = ""

    // Iterar a través de cada carácter de la cadena de entrada
    for (char <- expression) {
      // Identificar los diferentes tipos de tokens
      if (char.isWhitespace) {
        // Ignorar los espacios en blanco y agregar el token actual a la lista
        if (currentToken.nonEmpty) {
          tokens += currentToken
          currentToken = ""
        }
      } else if (char == '(' || char == ')' || char == '+' || char == '-' || char == '*' || char == '/') {
        // Agregar el token actual a la lista y comenzar a construir un nuevo token con el carácter actual
        if (currentToken.nonEmpty) {
          tokens += currentToken
          currentToken = ""
        }
        tokens += char.toString
      } else {
        // Construir el token actual con el carácter actual
        currentToken += char
      }
    }

    // Agregar el último token construido a la lista
    if (currentToken.nonEmpty) {
      tokens += currentToken
    }

    tokens.toList
  }

}
