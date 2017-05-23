/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oclone;


import java.util.List;

/**
 *
 * @author labin
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Lendo o XML");
        LerXML lx = new LerXMLImpl();
        List<Cidade> cidades = lx.lerCidades("C:\\Users\\labin\\Documents\\NetBeansProjects\\lerxml\\oClone\\BLIBLIOTECAS E BASE\\clientes.xml");
        
        System.out.println("Inserindo no banco");
        PopulaBD pb = new PopulaBDImpl();
        pb.populaBD(cidades);
    }
}
