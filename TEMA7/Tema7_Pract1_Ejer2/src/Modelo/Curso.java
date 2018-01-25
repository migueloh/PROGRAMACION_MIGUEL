package Modelo;

import java.util.ArrayList;

/**
 *
 * @author MIGUEL
 */
public class Curso {
    
    private String curso;
    
    private ArrayList <Persona> listaPersonas;

    public Curso() {
    }

    public Curso(String curso, ArrayList<Persona> listaPersonas) {
        this.curso = curso;
        this.listaPersonas = listaPersonas;
    }

    
    public Curso(String curso) {
        this.curso = curso;
    }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public void editarCursoPersona(Persona per) {  
        this.listaPersonas.add(per);
    }

    public void borrarPersona(Persona per) {
        this.listaPersonas.remove(per);
    }
    
    
}
