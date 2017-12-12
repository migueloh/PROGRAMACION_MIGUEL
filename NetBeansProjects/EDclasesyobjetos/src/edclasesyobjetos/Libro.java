
package edclasesyobjetos;
import javax.swing.JOptionPane;

public class Libro {
    /*variables globales*/
    private int ISBN;
    private String Titulo;
    private String Autor;
    private int Npaginas;
    /*conversor*/
    public Libro(int ISBN,String Titulo,String Autor, int Npaginas)
       {
          this.ISBN=ISBN;
          this.Titulo=Titulo;
          this.Autor=Autor;
          this.Npaginas=Npaginas;
    }
//get
    
    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNpaginas() {
        return Npaginas;
    }

    
    /*set*/
    
    
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNpaginas(int Npaginas) {
        this.Npaginas = Npaginas;
    }
    
    public void obtenerlibros() {
        
     JOptionPane.showMessageDialog(null,"El numero de ISBN es "+ ISBN +"El Titulo es " + Titulo +"El autor es " + Autor + "El numero de paginas es " + Npaginas );   

}
}
