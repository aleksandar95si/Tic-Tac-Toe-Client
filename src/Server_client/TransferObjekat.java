
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
 *         &lt;element name="gdo" type="{http://Server/}igrac" minOccurs="0"/>
 *         &lt;element name="polje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="igracNaPotezu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="krajIgre" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "polje",
    "igracNaPotezu",
    "krajIgre"
})
public class TransferObjekat {

    protected Igrac gdo;
    protected String polje;
    protected String igracNaPotezu;
    protected boolean krajIgre;

    /**
     * Gets the value of the gdo property.
     * 
     * @return
     *     possible object is
     *     {@link Igrac }
     *     
     */
    public Igrac getGdo() {
        return gdo;
    }

    /**
     * Sets the value of the gdo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Igrac }
     *     
     */
    public void setGdo(Igrac value) {
        this.gdo = value;
    }

    /**
     * Gets the value of the polje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolje() {
        return polje;
    }

    /**
     * Sets the value of the polje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolje(String value) {
        this.polje = value;
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
    public void setKrajIgre(boolean value) {
        this.krajIgre = value;
    }

}
