/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oclone;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author labin
 */
public class LerXMLImpl extends LerXML {

    @Override
    public List<Cidade> lerCidades(String pathXML) {
        List<Cidade> lista = new ArrayList<Cidade>();

        try {
            File f = new File("C:\\Users\\labin\\Documents\\NetBeansProjects\\lerxml\\clientes.xml");
            System.out.println("" + f.exists());
            SAXBuilder builder = new SAXBuilder();
            Document doc;
            doc = builder.build(f);
            Element root = (Element) doc.getRootElement();
            List cidades = root.getChildren();
            System.out.println("" + cidades.size());
            Iterator i = cidades.iterator();
            Cidade cid = new Cidade();
            Cliente cli = new Cliente();
            while (i.hasNext()) {
                Element cidade = (Element) i.next();
                System.out.println("codigo: " + cidade.getAttributeValue("codigo"));
                System.out.println("nome: " + cidade.getAttributeValue("nome"));
                System.out.println("uf: " + cidade.getAttributeValue("uf"));
                cid.setCodigo(Integer.parseInt(cidade.getAttributeValue("codigo")));
                cid.setNome(cidade.getAttributeValue("nome"));
                cid.setUf(cidade.getAttributeValue("uf"));
                List clientes = cidade.getChildren();
                Iterator c = clientes.iterator();

                while (c.hasNext()) {
                    Element cliente = (Element) c.next();
                    System.out.println("matricula: " + cliente.getChildText("matricula"));
                    System.out.println("nome: " + cliente.getChildText("nome"));
                    System.out.println("nascimento: " + cliente.getChildText("nascimento"));
                    cli.setMatricula(Integer.parseInt(cliente.getChildText("matricula")));
                    cli.setNome(cliente.getChildText("nome"));
                    cli.setDataNascimento(cliente.getChildText("nascimento"));
                    cid.addCliente(cli);
                }
                lista.add(cid);
            }
        } catch (JDOMException ex) {
            Logger.getLogger(LerXMLImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LerXMLImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
