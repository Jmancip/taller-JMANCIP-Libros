package libros;

public class Libro {

    // atributos
    String titulo;
    String autor;
    int paginas;
    int añoPublicacion;

    // Constructor
    public Libro(String titulo, String autor, int paginas, int anoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.añoPublicacion = anoPublicacion;
    }

    // Metodos Geter y Seter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getAnoPublicacion() {
        return añoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.añoPublicacion = anoPublicacion;
    }

    // Metodo para mostrar datos de la persona

    public void mostarDatosLibro(){
        System.out.println("Titulo: "+ titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + paginas);
        System.out.println("Año de publicación: " + añoPublicacion);

    }



}
