package edu.tamu.amos.spring.xml;

/**
 * Created by Amos on 2018/2/7.
 */
public class XmlPersonDao {

    private XmlJdbcConnection xmlJdbcConnection;

    public XmlPersonDao(XmlJdbcConnection xmlJdbcConnection) {
        this.xmlJdbcConnection = xmlJdbcConnection;
    }

    public XmlJdbcConnection getXmlJdbcConnection() {
        return xmlJdbcConnection;
    }
}
