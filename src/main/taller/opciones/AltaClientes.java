/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.opciones;

import main.util.GestorIO;
import main.taller.clientes.Cliente;
import main.taller.clientes.TipoCliente;
/**
 *
 * @author ciclost
 */
public class AltaClientes extends OpcionClientes{
    GestorIO entrada = new GestorIO();
    Cliente cliente;
    @Override
    public void ejecutar() {
        cliente = new Cliente(this.pedirNombre(), this.pedirTelefono());
    }
    
    public String pedirNombre(){
        System.out.println("Introduce un nombre");
        return entrada.inString();
    }
    
    public int pedirTelefono(){
        System.out.println("Introduce un número de teléfono");
        int tlf = entrada.inInt();
        String largo = String.valueOf(tlf);
        while(largo.length() != 9){
            System.out.println("El número debe tener 9 valores");
            tlf = entrada.inInt();
            largo = String.valueOf(tlf);
        }
        return tlf;
    }    
    
    
    
    
}
