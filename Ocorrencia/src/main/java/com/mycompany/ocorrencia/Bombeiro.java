/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ocorrencia;

/**
 *
 * @author aluno
 */
public class Bombeiro {
    private int idBombeiro;
    private String nome;
    private String nomeGuerra;
    private int matricula;
    private int contato;
    
    //id
    public int getIdBombeiro(){
        return idBombeiro;
    }
    public void setIdBombeiro(int _idBombeiro){
        this.idBombeiro = _idBombeiro;
    }
    
    //nome
    public String getNome(){
        return nome;
    }
    public void setIdBombeiro(String _nome){
        this.nome = _nome;
    }
    
    //nome e Guerra
    public String getNomeGuerra(){
        return nomeGuerra;
    }
    public void setNomeguerra(String _nomeGuerra){
        this.nomeGuerra = _nomeGuerra;
    }
    
    //matricula
    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int _matricula){
        this.matricula = _matricula;
    }
    
    //cantato
    public int getContato(){
        return contato;
    }
    public void etContato(int _contato){
        this.contato = _contato;
    }
}
