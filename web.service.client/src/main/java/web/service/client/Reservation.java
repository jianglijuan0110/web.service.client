
package web.service.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour reservation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="reservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chambre" type="{http://service.web/}chambre" minOccurs="0"/>
 *         &lt;element name="dateArrivee" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dateDepart" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservation", propOrder = {
    "chambre",
    "dateArrivee",
    "dateDepart"
})
public class Reservation {

    protected Chambre chambre;
    protected int dateArrivee;
    protected int dateDepart;

    /**
     * Obtient la valeur de la propriété chambre.
     * 
     * @return
     *     possible object is
     *     {@link Chambre }
     *     
     */
    public Chambre getChambre() {
        return chambre;
    }

    /**
     * Définit la valeur de la propriété chambre.
     * 
     * @param value
     *     allowed object is
     *     {@link Chambre }
     *     
     */
    public void setChambre(Chambre value) {
        this.chambre = value;
    }

    /**
     * Obtient la valeur de la propriété dateArrivee.
     * 
     */
    public int getDateArrivee() {
        return dateArrivee;
    }

    /**
     * Définit la valeur de la propriété dateArrivee.
     * 
     */
    public void setDateArrivee(int value) {
        this.dateArrivee = value;
    }

    /**
     * Obtient la valeur de la propriété dateDepart.
     * 
     */
    public int getDateDepart() {
        return dateDepart;
    }

    /**
     * Définit la valeur de la propriété dateDepart.
     * 
     */
    public void setDateDepart(int value) {
        this.dateDepart = value;
    }

}
