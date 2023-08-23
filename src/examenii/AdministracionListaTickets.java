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
public class AdministracionListaTickets extends AdministracionTickets {

    HashMap<Integer, Tipo> ticket = new HashMap();

    public HashMap<Integer, Tipo> getTicket() {
        return ticket;
    }

    public void setTicket(HashMap<Integer, Tipo> ticket) {
        this.ticket = ticket;
    }

    public AdministracionListaTickets(Tipo tipo, int numero) {
        super(tipo, numero);
    }

    public boolean eliminarPorValue(int numero, Tipo tipo) {

        if (this.ticket.isEmpty()) {
            ticket.remove(numero, tipo);
            return true;
        }
        return false;

    }

    public boolean eliminarPorKey(int numero) {

        if (this.ticket.isEmpty()) {
            ticket.remove(numero);
            return true;
        }
        return false;

    }

    public HashMap<Integer, Tipo> buscar(Tipo tipo) {
        if (ticket.containsValue(tipo)) {
            return ticket;
        }
        return null;
    }

    public boolean insertar(int numero, Tipo tipo) {
        if (this.ticket == null && !this.ticket.containsKey(numero)) {
            ticket.put(numero, tipo);
            return true;
        }
        return false;

    }
}
