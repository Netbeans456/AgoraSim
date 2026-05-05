/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ocorrencia;

/**
 *
 * @author aluno
 */
public class UuarioDoSistema {
    private int idUsuario;
    private String login;
    private String senha;
    private String perfil;
    
    public boolean autenticarSitema(){
        return true;
    }
    
    //ID
    public int getIdUsuario(){
        return idUsuario;
    }
    public void setIdBombeiro(int _idUsuario){
        this.idUsuario = _idUsuario;
    }
    
    //login
    public String getLogin(){
        return login;
    }
    public void setLogin(String _login){
        this.login = _login;
    }
    
    //senhas
    public String getSenha(){
        return senha;
    }
    public void setSenha(String _senha){
        this.senha = _senha;
    }
    
    //perfil
    public String getPerfil(){
        return perfil;
    }
    public void setPefil(String _perfil){
        this.perfil = _perfil;
    }
}
