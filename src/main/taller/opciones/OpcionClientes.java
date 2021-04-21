/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.opciones;
import main.taller.clientes.Cliente;
import main.util.GestorIO;
/**
 *
 * @author ciclost
 */
public abstract class OpcionClientes extends Opcion{
    Cliente[] arrayclientes;
    final private int cantidad = 10;
    public OpcionClientes(){
        arrayclientes = new Cliente[cantidad];
        this.aNull();
    }
    
    public void aNull(){
        for(int i=0; i<arrayclientes.length; i++){
            arrayclientes[i] = null;
        }
    }

    @Override
    public abstract void ejecutar();
}
