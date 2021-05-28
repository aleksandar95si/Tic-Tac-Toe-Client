
package Server_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for igrac complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="igrac">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Server/}generalDObject">
 *       &lt;sequence>
 *         &lt;element name="idIgrac" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="korisnickoIme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sifra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brojPobeda" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="brojPoraza" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "igrac", propOrder = {
    "idIgrac",
    "korisnickoIme",
    "sifra",
    "brojPobeda",
    "brojPoraza"
})
public class Igrac
    extends GeneralDObject
{

    protected int idIgrac;
    protected String korisnickoIme;
    protected String sifra;
    protected int brojPobeda;
    protected int brojPoraza;

    /**
     * Gets the value of the idIgrac property.
     * 
     */
    public int getIdIgrac() {
        return idIgrac;
    }

    /**
     * Sets the value of the idIgrac property.
     * 
     */
    public void setIdIgrac(int value) {
        this.idIgrac = value;
    }

    /**
     * Gets the value of the korisnickoIme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    /**
     * Sets the value of the korisnickoIme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKorisnickoIme(String value) {
        this.korisnickoIme = value;
    }

    /**
     * Gets the value of the sifra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSifra() {
        return sifra;
    }

    /**
     * Sets the value of the sifra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSifra(String value) {
        this.sifra = value;
    }

    /**
     * Gets the value of the brojPobeda property.
     * 
     */
    public int getBrojPobeda() {
        return brojPobeda;
    }

    /**
     * Sets the value of the brojPobeda property.
     * 
     */
    public void setBrojPobeda(int value) {
        this.brojPobeda = value;
    }

    /**
     * Gets the value of the brojPoraza property.
     * 
     */
    public int getBrojPoraza() {
        return brojPoraza;
    }

    /**
     * Sets the value of the brojPoraza property.
     * 
     */
    public void setBrojPoraza(int value) {
        this.brojPoraza = value;
    }

}
