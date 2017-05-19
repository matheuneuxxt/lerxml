/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oclone;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.JDOMException;
/**
 *
 * @author labin
 */
public class OClone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JDOMException, IOException {
        // TODO code application logic here
        System.out.println("eu");
        File f = new File("C:\\Users\\labin\\Documents\\NetBeansProjects\\Xxt\\clientes.xml");
        System.out.println("" + f.exists());
        SAXBuilder builder = new SAXBuilder();
        Document doc = builder.build(f);
        Element root = (Element) doc.getRootElement();
        List cidades = root.getChildren();
        System.out.println("" + cidades.size());
        Iterator i = cidades.iterator();

        while (i.hasNext()) {
            Element cidade = (Element) i.next();
            System.out.println("codigo: " + cidade.getAttributeValue("codigo"));
            System.out.println("nome: " + cidade.getAttributeValue("nome"));
            System.out.println("uf: " + cidade.getAttributeValue("uf"));
            
            List clientes = cidade.getChildren();
            Iterator c = clientes.iterator();
            while (c.hasNext()) {
                Element cliente = (Element) c.next();
                System.out.println("matricula: " + cliente.getChildText("matricula"));
                System.out.println("nome: " + cliente.getChildText("nome"));
                System.out.println("nascimento: " + cliente.getChildText("nascimento"));
            }
        }
    }
    
}
