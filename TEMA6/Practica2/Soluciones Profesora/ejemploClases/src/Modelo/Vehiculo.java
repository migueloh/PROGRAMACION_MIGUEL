/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author nieves
 */
public class Vehiculo {
    private String matricula;
    private String color;
    
    private Persona p;

    public Persona getP() {
        return p;
    }

    public void setP(Persona p) {
        this.p = p;
    }

    public Vehiculo() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
