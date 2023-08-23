/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenii;

import java.util.HashMap;

/**
 *
 * @author Student
 */
public class AdministracionTickets {

    private Tipo tipo;
    private int numero;

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public AdministracionTickets(Tipo tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;

    }

    @Override
    public String toString() {
        return "AdministracionTickets{" + "tipo=" + tipo + '}';
    }

}
