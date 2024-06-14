package exercises
import scala.io.Source //Una representación iterable de los datos de origen.
                       // Se puede restablecer con el método de reinicio opcional .
import java.io.PrintWriter//es una clase en Java utilizada para escribir datos basados en texto en un archivo.
import scala.io.StdIn.readLine
object Exercise160_RedactingTextinaFile extends App {


  // Leer rutas de archivos del usuario
  println("Ingrese la ruta del archivo de texto original:")
  val rutaArchivoOriginal = readLine()

  println("Ingrese la ruta del archivo de palabras sensibles:")
  val rutaArchivoPalabrasSensibles = readLine()

  println("Ingrese la ruta del archivo redactado:")
  val rutaArchivoRedactado = readLine()

  // Leer palabras sensibles del archivo
  val palabrasSensibles = Source.fromFile(rutaArchivoPalabrasSensibles).getLines().toSet

  // Leer texto del archivo original
  val textoOriginal = Source.fromFile(rutaArchivoOriginal).mkString

  // Redactar palabras sensibles
  val textoRedactado = redactarPalabras(textoOriginal, palabrasSensibles)

  // Escribir texto redactado en un nuevo archivo
  val escritor = new PrintWriter(rutaArchivoRedactado)
  escritor.write(textoRedactado)
  escritor.close()

  println("El archivo ha sido redactado con éxito.")

  // Función para eliminar palabras sensibles del texto
  def redactarPalabras(texto: String, palabrasSensibles: Set[String]): String = {
    // Dividir el texto en palabras
    val palabras = texto.split("\\s+")

    // Redactar palabras sensibles
    val palabrasRedactadas = palabras.map { palabra =>
      if (palabrasSensibles.contains(palabra.toLowerCase)) "*" * palabra.length
      else palabra
    }

    //Volver a unir las palabras redactadas en una cadena
    palabrasRedactadas.mkString(" ") //mkString concatenamos cadenas
  }

}
