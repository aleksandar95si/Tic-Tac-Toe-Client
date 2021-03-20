
package Server_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for korisnik complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="korisnik">
 *   &lt;complexContent>
 *     &lt;extension base="{http://Server/}generalDObject">
 *       &lt;sequence>
 *         &lt;element name="idKorisnik" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="korisnickoIme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sifra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prezime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brojPobeda" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="brojPoraza" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datumRodjenja" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "korisnik", propOrder = {
    "idKorisnik",
    "korisnickoIme",
    "sifra",
    "ime",
    "prezime",
    "brojPobeda",
    "brojPoraza",
    "datumRodjenja"
})
public class Korisnik
    extends GeneralDObject
{

    protected int idKorisnik;
    protected String korisnickoIme;
    protected String sifra;
    protected String ime;
    protected String prezime;
    protected int brojPobeda;
    protected int brojPoraza;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datumRodjenja;

    /**
     * Gets the value of the idKorisnik property.
     * 
     */
    public int getIdKorisnik() {
        return idKorisnik;
    }

    /**
     * Sets the value of the idKorisnik property.
     * 
     */
    public void setIdKorisnik(int value) {
        this.idKorisnik = value;
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
     * Gets the value of the ime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIme() {
        return ime;
    }

    /**
     * Sets the value of the ime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIme(String value) {
        this.ime = value;
    }

    /**
     * Gets the value of the prezime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrezime() {
        return prezime;
    }

    /**
     * Sets the value of the prezime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrezime(String value) {
        this.prezime = value;
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

    /**
     * Gets the value of the datumRodjenja property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumRodjenja() {
        return datumRodjenja;
    }

    /**
     * Sets the value of the datumRodjenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumRodjenja(XMLGregorianCalendar value) {
        this.datumRodjenja = value;
    }

}
