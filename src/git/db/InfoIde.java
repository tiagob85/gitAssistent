/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.db;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Tiago B
 */
public class InfoIde implements Serializable{
    int Id;
    String NomeIde;
    String NomeProcesso;
    String Diretorio;
    String NomeProjeto;
    Date DataAtualizacao;
    
    public InfoIde(){}//Construtor

    public InfoIde(int Id, String NomeIde, String NomeProcesso, String Diretorio, String NomeProjeto, Date DataAtualizacao) {
        this.Id = Id;
        this.NomeIde = NomeIde;
        this.NomeProcesso = NomeProcesso;
        this.Diretorio = Diretorio;
        this.NomeProjeto = NomeProjeto;
        this.DataAtualizacao = DataAtualizacao;
    }
    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNomeIde() {
        return NomeIde;
    }

    public void setNomeIde(String NomeIde) {
        this.NomeIde = NomeIde;
    }

    public String getNomeProcesso() {
        return NomeProcesso;
    }

    public void setNomeProcesso(String NomeProcesso) {
        this.NomeProcesso = NomeProcesso;
    }

    public String getDiretorio() {
        return Diretorio;
    }

    public void setDiretorio(String Diretorio) {
        this.Diretorio = Diretorio;
    }

    public String getNomeProjeto() {
        return NomeProjeto;
    }

    public void setNomeProjeto(String NomeProjeto) {
        this.NomeProjeto = NomeProjeto;
    }

    public Date getDataAtualizacao() {
        return DataAtualizacao;
    }

    public void setDataAtualizacao(Date DataAtualizacao) {
        this.DataAtualizacao = DataAtualizacao;
    }
    
}
