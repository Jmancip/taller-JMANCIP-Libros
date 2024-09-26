package libros;

public class AdminLibros {
    public static void main(String[] args) {

        //Objetos
        Libro libroUno = new Libro("El Principito","Antoine de Saint-Exupéry",96,1943);
        Libro libroDos = new Libro("Cien años de soledad","Gabriel García Márquez",417,1967);

        System.out.println("---- Ejercicio Libros por Julian Mancipe ----");
        System.out.println("Datos del libro 1");
        libroUno.mostarDatosLibro();
        System.out.println("---------------------------------------------");

        System.out.println("Datos del libro 2");
        libroDos.mostarDatosLibro();

        System.out.println("---------------------------------------------");
        System.out.println("--- Modificando el número de páginas del primer libro ---");
        libroUno.setPaginas(100);
        System.out.println("--- Libro 1-Paginas modificadas: " + libroUno.getPaginas() );
        System.out.println("---------------------------------------------");
        System.out.println("------- Datos del Libro 1 Actualizado -------");
        libroUno.mostarDatosLibro();









    }
}