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
public class Cliente {
    private int codigo;
    private boolean socio;
    private boolean vip;
    private int acumulador;
    
    public Cliente(int codigo, boolean vip){
        this.codigo = codigo;
        this.vip = vip;
        acumulador = 0;
    }
    
    public Cliente(boolean vip){
        this.vip = vip;
    }

    public boolean isSocio() {
        return socio;
    }
    
    public boolean isVip() {
        return vip;
    }
    
    public void acumularmas(){
        if(acumulador<=10)
        acumulador++;
    }    
    
}
