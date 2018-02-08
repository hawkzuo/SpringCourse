package edu.tamu.amos.spring.xml;

/**
 * Created by Amos on 2018/2/7.
 */
public class XMLPersonDao {

    private XMLJdbcConnection xmlJdbcConnection;

    public XMLPersonDao(XMLJdbcConnection xmlJdbcConnection) {
        this.xmlJdbcConnection = xmlJdbcConnection;
    }

    public XMLJdbcConnection getXmlJdbcConnection() {
        return xmlJdbcConnection;
    }
}
