
package Server_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transferObjekat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transferObjekat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gdo" type="{http://Server/}korisnik" minOccurs="0"/>
 *         &lt;element name="poruka" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="currentRecord" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="igracNaPotezu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transferObjekat", propOrder = {
    "gdo",
    "poruka",
    "signal",
    "currentRecord",
    "igracNaPotezu",
    "krajIgre"
})
public class TransferObjekat {

    protected Korisnik gdo;
    protected String poruka;
    protected boolean signal;
    protected int currentRecord;
    protected String igracNaPotezu;
    protected boolean krajIgre;

    /**
     * Gets the value of the gdo property.
     * 
     * @return
     *     possible object is
     *     {@link Korisnik }
     *     
     */
    public Korisnik getGdo() {
        return gdo;
    }

    /**
     * Sets the value of the gdo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Korisnik }
     *     
     */
    public void setGdo(Korisnik value) {
        this.gdo = value;
    }

    /**
     * Gets the value of the poruka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoruka() {
        return poruka;
    }

    /**
     * Sets the value of the poruka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoruka(String value) {
        this.poruka = value;
    }

    /**
     * Gets the value of the signal property.
     * 
     */
    public boolean isSignal() {
        return signal;
    }

    /**
     * Sets the value of the signal property.
     * 
     */
    public void setSignal(boolean value) {
        this.signal = value;
    }

    /**
     * Gets the value of the currentRecord property.
     * 
     */
    public int getCurrentRecord() {
        return currentRecord;
    }

    /**
     * Sets the value of the currentRecord property.
     * 
     */
    public void setCurrentRecord(int value) {
        this.currentRecord = value;
    }

    /**
     * Gets the value of the igracNaPotezu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgracNaPotezu() {
        return igracNaPotezu;
    }

    /**
     * Sets the value of the igracNaPotezu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgracNaPotezu(String value) {
        this.igracNaPotezu = value;
    }
      /**
     * Gets the value of the krajIgre property.
     * 
     */
    public boolean isKrajIgre() {
        return krajIgre;
    }

    /**
     * Sets the value of the krajIgre property.
     * 
     */
    public void setKrajIgre(boolean krajIgre) {
        this.krajIgre = krajIgre;
    }
}
