/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ocorrencia;

/**
 *
 * @author aluno
 */
public class Viatura {
    private int idViatura;
    private String tipoParaSalvamento;
    private String placa;
    private String status;
    
    
    
    
    //Id viatura
    public int getIdViatura(){
        return idViatura;
    }
    public void setIdViatura(int _idViatura){
        this.idViatura = _idViatura;
    }
    
    //tipoParaSalvamento
    public String getTipoParaSalvamneto(){
        return tipoParaSalvamento;
    }
    public void setTipoParaSalvamento(String _tipoparaSalvamento){
        this.tipoParaSalvamento = _tipoparaSalvamento;
    }
    
    //placa
    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String _placa){
        this.placa = _placa;
    }
    
    //status
    public String getStatus(){
        return status;
    }
    public void setStatus(String _status){
        this.status = _status;
    }
}
