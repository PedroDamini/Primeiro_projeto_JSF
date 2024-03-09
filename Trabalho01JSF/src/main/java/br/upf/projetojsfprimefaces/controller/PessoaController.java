/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.upf.projetojsfprimefaces.controller;

import br.upf.projetojsfprimefaces.entity.PessoaEntity;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 189134
 */
@Named(value = "pessoaController")
@SessionScoped
public class PessoaController implements Serializable {

    public PessoaController() {
    }
    
    private PessoaEntity pessoa = new PessoaEntity();
    
    private List<PessoaEntity> pessoaList = new ArrayList<>();

    public PessoaEntity getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaEntity pessoa) {
        this.pessoa = pessoa;
    }

    public List<PessoaEntity> getPessoaList() {
        return pessoaList;
    }

    public void setPessoaList(List<PessoaEntity> pessoaList) {
        this.pessoaList = pessoaList;
    }
    
    public void adicionarPessoa() {
        pessoaList.add(pessoa);
        
        exibirMensagem();
        
        pessoa = new PessoaEntity();
    }
    
    private void exibirMensagem() {
        String msg = "Contato adiconando: " + pessoa.getNome();
        
        FacesMessage fm = new FacesMessage(msg);  
        FacesContext.getCurrentInstance().addMessage(msg, fm);
    }
    
}
