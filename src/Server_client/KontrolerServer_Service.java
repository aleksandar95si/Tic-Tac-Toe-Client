
package Server_client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "KontrolerServer", targetNamespace = "http://Server/", wsdlLocation = "http://localhost:8080/IksOksServer/KontrolerServer?wsdl")
public class KontrolerServer_Service
    extends Service
{

    private final static URL KONTROLERSERVER_WSDL_LOCATION;
    private final static WebServiceException KONTROLERSERVER_EXCEPTION;
    private final static QName KONTROLERSERVER_QNAME = new QName("http://Server/", "KontrolerServer");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/IksOksServer/KontrolerServer?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        KONTROLERSERVER_WSDL_LOCATION = url;
        KONTROLERSERVER_EXCEPTION = e;
    }

    public KontrolerServer_Service() {
        super(__getWsdlLocation(), KONTROLERSERVER_QNAME);
    }

    public KontrolerServer_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), KONTROLERSERVER_QNAME, features);
    }

    public KontrolerServer_Service(URL wsdlLocation) {
        super(wsdlLocation, KONTROLERSERVER_QNAME);
    }

    public KontrolerServer_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, KONTROLERSERVER_QNAME, features);
    }

    public KontrolerServer_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public KontrolerServer_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns KontrolerServer
     */
    @WebEndpoint(name = "KontrolerServerPort")
    public KontrolerServer getKontrolerServerPort() {
        return super.getPort(new QName("http://Server/", "KontrolerServerPort"), KontrolerServer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns KontrolerServer
     */
    @WebEndpoint(name = "KontrolerServerPort")
    public KontrolerServer getKontrolerServerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Server/", "KontrolerServerPort"), KontrolerServer.class, features);
    }

    private static URL __getWsdlLocation() {
        if (KONTROLERSERVER_EXCEPTION!= null) {
            throw KONTROLERSERVER_EXCEPTION;
        }
        return KONTROLERSERVER_WSDL_LOCATION;
    }

}
