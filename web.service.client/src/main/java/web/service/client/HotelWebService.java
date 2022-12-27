
package web.service.client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HotelWebService", targetNamespace = "http://service.web/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HotelWebService {


    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNbEtoiles", targetNamespace = "http://service.web/", className = "web.service.client.GetNbEtoiles")
    @ResponseWrapper(localName = "getNbEtoilesResponse", targetNamespace = "http://service.web/", className = "web.service.client.GetNbEtoilesResponse")
    @Action(input = "http://service.web/HotelWebService/getNbEtoilesRequest", output = "http://service.web/HotelWebService/getNbEtoilesResponse")
    public int getNbEtoiles();

    /**
     * 
     * @return
     *     returns java.util.List<web.service.client.Chambre>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getChambres", targetNamespace = "http://service.web/", className = "web.service.client.GetChambres")
    @ResponseWrapper(localName = "getChambresResponse", targetNamespace = "http://service.web/", className = "web.service.client.GetChambresResponse")
    @Action(input = "http://service.web/HotelWebService/getChambresRequest", output = "http://service.web/HotelWebService/getChambresResponse")
    public List<Chambre> getChambres();

    /**
     * 
     * @return
     *     returns web.service.client.Adresse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAdresse", targetNamespace = "http://service.web/", className = "web.service.client.GetAdresse")
    @ResponseWrapper(localName = "getAdresseResponse", targetNamespace = "http://service.web/", className = "web.service.client.GetAdresseResponse")
    @Action(input = "http://service.web/HotelWebService/getAdresseRequest", output = "http://service.web/HotelWebService/getAdresseResponse")
    public Adresse getAdresse();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getNom", targetNamespace = "http://service.web/", className = "web.service.client.GetNom")
    @ResponseWrapper(localName = "getNomResponse", targetNamespace = "http://service.web/", className = "web.service.client.GetNomResponse")
    @Action(input = "http://service.web/HotelWebService/getNomRequest", output = "http://service.web/HotelWebService/getNomResponse")
    public String getNom();

    /**
     * 
     * @return
     *     returns java.util.List<web.service.client.Reservation>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListeReservations", targetNamespace = "http://service.web/", className = "web.service.client.GetListeReservations")
    @ResponseWrapper(localName = "getListeReservationsResponse", targetNamespace = "http://service.web/", className = "web.service.client.GetListeReservationsResponse")
    @Action(input = "http://service.web/HotelWebService/getListeReservationsRequest", output = "http://service.web/HotelWebService/getListeReservationsResponse")
    public List<Reservation> getListeReservations();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setListeReservations", targetNamespace = "http://service.web/", className = "web.service.client.SetListeReservations")
    @ResponseWrapper(localName = "setListeReservationsResponse", targetNamespace = "http://service.web/", className = "web.service.client.SetListeReservationsResponse")
    @Action(input = "http://service.web/HotelWebService/setListeReservationsRequest", output = "http://service.web/HotelWebService/setListeReservationsResponse")
    public void setListeReservations(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Reservation> arg0);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "recherche", targetNamespace = "http://service.web/", className = "web.service.client.Recherche")
    @ResponseWrapper(localName = "rechercheResponse", targetNamespace = "http://service.web/", className = "web.service.client.RechercheResponse")
    @Action(input = "http://service.web/HotelWebService/rechercheRequest", output = "http://service.web/HotelWebService/rechercheResponse")
    public float recherche(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "recherche2", targetNamespace = "http://service.web/", className = "web.service.client.Recherche2")
    @ResponseWrapper(localName = "recherche2Response", targetNamespace = "http://service.web/", className = "web.service.client.Recherche2Response")
    @Action(input = "http://service.web/HotelWebService/recherche2Request", output = "http://service.web/HotelWebService/recherche2Response")
    public int recherche2(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "reserver", targetNamespace = "http://service.web/", className = "web.service.client.Reserver")
    @ResponseWrapper(localName = "reserverResponse", targetNamespace = "http://service.web/", className = "web.service.client.ReserverResponse")
    @Action(input = "http://service.web/HotelWebService/reserverRequest", output = "http://service.web/HotelWebService/reserverResponse")
    public void reserver(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4);

}
