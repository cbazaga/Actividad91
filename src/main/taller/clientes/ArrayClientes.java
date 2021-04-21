/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.clientes;

/**
 *
 * @author ciclost
 */
public class ArrayClientes {
    private Cliente[] arrayclientes;
    final private int cantidad = 10;
    
    public ArrayClientes(){
        arrayclientes = new Cliente[cantidad];
        this.aNull();
    }
    
    public void aNull(){
        for(int i=0; i<arrayclientes.length; i++){
            arrayclientes[i] = null;
        }
    }
}
