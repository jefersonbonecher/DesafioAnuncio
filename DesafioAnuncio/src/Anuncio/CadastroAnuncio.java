package Anuncio;


import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class CadastroAnuncio {
    private String nomeAnuncio;
    private String cliente;
    private Date dataInicio;
    private Date dataTermino;
   private float inverstimentoDia;

    public String getNomeAnuncio() {
        return nomeAnuncio;
    }

    public void setNomeAnuncio(String nomeAnuncio) {
        this.nomeAnuncio = nomeAnuncio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public float getInverstimentoDia() {
        return inverstimentoDia;
    }

    public void setInverstimentoDia(float inverstimentoDia) {
        this.inverstimentoDia = inverstimentoDia;
    }

    public CadastroAnuncio(String nomeAnuncio, String cliente, Date dataInicio, Date dataTermino, float inverstimentoDia) {
        this.nomeAnuncio = nomeAnuncio;
        this.cliente = cliente;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.inverstimentoDia = inverstimentoDia;
    }
   
    
}
