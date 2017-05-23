/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oclone;



import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author labin
 */
public class PopulaBDImpl implements PopulaBD{
    InserirBD bd = new InserirBD();
    @Override
    public void populaBD(List<Cidade> cidades){
       try{
           bd.abreConexao();
           for (Cidade cidade : cidades) {
                bd.insereCidade(cidade.getCodigo(), cidade.getNome(), cidade.getUf());
                for(Cliente cli : cidade.getClientes()){
                    bd.insereCliente(cli.getMatricula(), cli.getNome(), cli.getDataNascimento());
                }
           }
           bd.fechaConexao();
           
       } catch (ClassNotFoundException ex) {
            Logger.getLogger(PopulaBDImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PopulaBDImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
    }
    
}
