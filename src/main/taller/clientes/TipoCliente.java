/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.taller.clientes;

import main.util.GestorIO;

/**
 *
 * @author ciclost
 */
public enum TipoCliente {
        VIP, NORMAL;
        private GestorIO entrada = new GestorIO();
        
        public TipoCliente getVip(){
            System.out.println("Desea convertirse en \" CLIENTE VIP \"?");
            System.out.println("1. Sí \n2. No");
            int pregunta = -1;
            do {
                pregunta = entrada.inInt();
            } while (pregunta!=1 || pregunta!=2);
            if(pregunta == 1) return VIP;
            else return NORMAL;
        }
        
        
}
