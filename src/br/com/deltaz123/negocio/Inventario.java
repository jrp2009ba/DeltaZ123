/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.deltaz123.negocio;

/**
 *
 * @author Fabiana
 */
public class Inventario {
    //Declaração de atributos
    private Equipamento equipamento;
    private Software software;
    
    public void listarSoftwareInstalado(){
        
    }
    
    //Declaração de Getters e Setters
    public Equipamento getEquipamento(){
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento){
        this.equipamento = equipamento;
    }

    public Software getSoftware(){
        return software;
    }

    public void setSoftware(Software software){
        this.software = software;
    }
}
