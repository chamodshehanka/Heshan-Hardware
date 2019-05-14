package com.chamodshehanka.heshanhardware.util;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * @author chamodshehanka on 4/13/2019
 * @project HeshanHardware
 **/
public class QueryUtil extends CommonUtil {

    public static String queryByID(String id) throws SAXException, IOException, ParserConfigurationException {

        NodeList nodeList;
        Element element = null;

        File file = new File(System
                .getProperty("user.dir")+"\\web\\WEB-INF\\DBQuery.xml");

        nodeList = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse(file).getElementsByTagName(CommonConstants.TAG_NAME);

        for (int value = 0; value < nodeList.getLength(); value++) {
            element = (Element) nodeList.item(value);
            if (element.getAttribute(CommonConstants.ATTRIB_ID).equals(id))
                break;
        }

        assert element != null;
        return element.getTextContent().trim();
    }

}
