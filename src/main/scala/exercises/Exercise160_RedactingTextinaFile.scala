package exercises
import scala.io.Source
import java.io.PrintWriter
object Exercise160_RedactingTextinaFile extends App {
  // Function to redact sensitive words from the text
  def redactWords(text: String, sensitiveWords: Set[String]): String = {
    // Split the text into words
    val words = text.split("\\s+")

    // Redact sensitive words
    val redactedWords = words.map { word =>
      if (sensitiveWords.contains(word.toLowerCase)) "*" * word.length
      else word
    }

    // Join redacted words back into a string
    redactedWords.mkString(" ")
  }

  // Read file paths from the user
  println("Ingrese la ruta del archivo de texto original:")
  val originalFilePath = scala.io.StdIn.readLine()

  println("Ingrese la ruta del archivo de palabras sensibles:")
  val sensitiveWordsFilePath = scala.io.StdIn.readLine()

  println("Ingrese la ruta del archivo redactado:")
  val redactedFilePath = scala.io.StdIn.readLine()

  // Read sensitive words from the file
  val sensitiveWords = Source.fromFile(sensitiveWordsFilePath).getLines().toSet

  // Read text from the original file
  val originalText = Source.fromFile(originalFilePath).mkString

  // Redact sensitive words
  val redactedText = redactWords(originalText, sensitiveWords)

  // Write redacted text to a new file
  val writer = new PrintWriter(redactedFilePath)
  writer.write(redactedText)
  writer.close()

  println("El archivo ha sido redactado con éxito.")

}
