/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oclone;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author labin
 */
public class Cidade {

    private int codigo;
    private String nome;
    private String uf;
    private List<Cliente> clientes;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public void addCliente(Cliente cliente){
        if (clientes == null){
            clientes = new ArrayList<>();
        }
        clientes.add(cliente);
    }
}
