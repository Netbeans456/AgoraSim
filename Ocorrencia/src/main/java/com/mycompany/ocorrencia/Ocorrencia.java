/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ocorrencia;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Ocorrencia {
    private int idOcorrencia;
    private String tipoOcorrencia;
    private Date data;
    private int hora;
    private String decricao;
    private String status;
    private String sinistro;
    private boolean prioridade;
    
    //idOcorrencia
    public int getIdOcorrencia(){
        return idOcorrencia;
    }
    public void setIdOcorrencia(int _idOcorrencia){
        this.idOcorrencia = _idOcorrencia;
    }
    
    //tipoOcorrencia
    public String getTipoOcorrencia(){
        return tipoOcorrencia;
    }
    public void setTipoOcorrencia(String _tipoocorrencia){
        this.tipoOcorrencia = _tipoocorrencia;
    }
    
    //Date
    public Date getData(){
        return data;
    }
    public void setData(Date _data){
        this.data = _data;
    }
    
    //hora
    public int getHora(){
        return hora;
    }
    public void setHora(int _hora){
        this.hora = _hora;
    }
    
    //escrição
    public String getDescricao(){
        return decricao;
    }
    public void setDescricao(String _descricao){
        this.decricao = _descricao;
    }
    
    //status
    public String getStatus(){
        return status;
    }
    public void setStatus(String _status){
        this.status = _status;
    }
    //sinistro
    public String getSinistro(){
        return sinistro;
    }
    public void setSinistro(String _sinistro){
        this.sinistro = _sinistro;
    }
    //prioridade
    public boolean getPrioridade(){
        return prioridade;
    }
    public void setPrioridade(boolean _prioridade){
        this.prioridade = _prioridade;
    }
}
