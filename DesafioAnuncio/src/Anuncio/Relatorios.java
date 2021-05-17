package Anuncio;


import Anuncio.CadastroAnuncio;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Relatorios {
    private ArrayList<CadastroAnuncio> anuncios = new ArrayList();

    public void add(CadastroAnuncio anuncio){
           if (anuncio != null){
            this.anuncios.add(anuncio);
        }
        else {
            throw new IllegalArgumentException("Ánuncio inválido. Não pode ser nulo.");// tratamento de excesao 
        }
    }
    public double valorTotalInvestido(){
       float soma =0;
        for (CadastroAnuncio ca : this.anuncios) {
            String clinete= ca.getCliente();
            if(clinete==clinete){
                soma+= ca.getInverstimentoDia();
            }
            
        }
        return soma;
    }

    
}
