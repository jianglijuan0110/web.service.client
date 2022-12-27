
package web.service.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour chambre complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="chambre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nbLits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="num" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prixParNuit" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="reservation" type="{http://service.web/}reservation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chambre", propOrder = {
    "nbLits",
    "num",
    "prixParNuit",
    "reservation"
})
public class Chambre {

    protected int nbLits;
    protected int num;
    protected float prixParNuit;
    protected Reservation reservation;

    /**
     * Obtient la valeur de la propriété nbLits.
     * 
     */
    public int getNbLits() {
        return nbLits;
    }

    /**
     * Définit la valeur de la propriété nbLits.
     * 
     */
    public void setNbLits(int value) {
        this.nbLits = value;
    }

    /**
     * Obtient la valeur de la propriété num.
     * 
     */
    public int getNum() {
        return num;
    }

    /**
     * Définit la valeur de la propriété num.
     * 
     */
    public void setNum(int value) {
        this.num = value;
    }

    /**
     * Obtient la valeur de la propriété prixParNuit.
     * 
     */
    public float getPrixParNuit() {
        return prixParNuit;
    }

    /**
     * Définit la valeur de la propriété prixParNuit.
     * 
     */
    public void setPrixParNuit(float value) {
        this.prixParNuit = value;
    }

    /**
     * Obtient la valeur de la propriété reservation.
     * 
     * @return
     *     possible object is
     *     {@link Reservation }
     *     
     */
    public Reservation getReservation() {
        return reservation;
    }

    /**
     * Définit la valeur de la propriété reservation.
     * 
     * @param value
     *     allowed object is
     *     {@link Reservation }
     *     
     */
    public void setReservation(Reservation value) {
        this.reservation = value;
    }

}
