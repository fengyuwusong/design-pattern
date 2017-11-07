package util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.net.URL;

/**
 * Created by fengyuwusong on 2017/10/31 16:57.
 */
public class XMLUtil {
    public static String getName(String fileName){
        try{
            DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=dFactory.newDocumentBuilder();
            Document doc;
            URL url=XMLUtil.class.getResource(fileName);
            doc=builder.parse(new File(url.getFile()));
            NodeList nl=doc.getElementsByTagName("className");
            Node classNode=nl.item(0).getFirstChild();
            return classNode.getNodeValue();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
