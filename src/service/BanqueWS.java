
package service;

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
@WebService(name = "BanqueWS", targetNamespace = "http://Service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueWS {


    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod(operationName = "ConvertionEuroToDh")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ConvertionEuroToDh", targetNamespace = "http://Service/", className = "service.ConvertionEuroToDh")
    @ResponseWrapper(localName = "ConvertionEuroToDhResponse", targetNamespace = "http://Service/", className = "service.ConvertionEuroToDhResponse")
    @Action(input = "http://Service/BanqueWS/ConvertionEuroToDhRequest", output = "http://Service/BanqueWS/ConvertionEuroToDhResponse")
    public double convertionEuroToDh(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @param code
     * @return
     *     returns service.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://Service/", className = "service.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://Service/", className = "service.GetCompteResponse")
    @Action(input = "http://Service/BanqueWS/getCompteRequest", output = "http://Service/BanqueWS/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        Long code);

    /**
     * 
     * @return
     *     returns java.util.List<service.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getComptes", targetNamespace = "http://Service/", className = "service.GetComptes")
    @ResponseWrapper(localName = "getComptesResponse", targetNamespace = "http://Service/", className = "service.GetComptesResponse")
    @Action(input = "http://Service/BanqueWS/getComptesRequest", output = "http://Service/BanqueWS/getComptesResponse")
    public List<Compte> getComptes();

}
