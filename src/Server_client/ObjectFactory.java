
package Server_client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Server_client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PrvaMetoda_QNAME = new QName("http://Server/", "prvaMetoda");
    private final static QName _PrvaMetodaResponse_QNAME = new QName("http://Server/", "prvaMetodaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Server_client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PrvaMetoda }
     * 
     */
    public PrvaMetoda createPrvaMetoda() {
        return new PrvaMetoda();
    }

    /**
     * Create an instance of {@link PrvaMetodaResponse }
     * 
     */
    public PrvaMetodaResponse createPrvaMetodaResponse() {
        return new PrvaMetodaResponse();
    }

    /**
     * Create an instance of {@link TransferObjekat }
     * 
     */
    public TransferObjekat createTransferObjekat() {
        return new TransferObjekat();
    }

    /**
     * Create an instance of {@link Korisnik }
     * 
     */
    public Korisnik createKorisnik() {
        return new Korisnik();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrvaMetoda }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "prvaMetoda")
    public JAXBElement<PrvaMetoda> createPrvaMetoda(PrvaMetoda value) {
        return new JAXBElement<PrvaMetoda>(_PrvaMetoda_QNAME, PrvaMetoda.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrvaMetodaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "prvaMetodaResponse")
    public JAXBElement<PrvaMetodaResponse> createPrvaMetodaResponse(PrvaMetodaResponse value) {
        return new JAXBElement<PrvaMetodaResponse>(_PrvaMetodaResponse_QNAME, PrvaMetodaResponse.class, null, value);
    }

}
