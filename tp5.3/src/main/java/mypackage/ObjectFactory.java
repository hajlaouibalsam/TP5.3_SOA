
package mypackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package. 
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

    private final static QName _ConversionResponse_QNAME = new QName("http://service/", "conversionResponse");
    private final static QName _Compte_QNAME = new QName("http://service/", "compte");
    private final static QName _Conversion_QNAME = new QName("http://service/", "conversion");
    private final static QName _GetComptesResponse_QNAME = new QName("http://service/", "getComptesResponse");
    private final static QName _GetComptes_QNAME = new QName("http://service/", "getComptes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConversionResponse }
     * 
     */
    public ConversionResponse createConversionResponse() {
        return new ConversionResponse();
    }

    /**
     * Create an instance of {@link GetComptes }
     * 
     */
    public GetComptes createGetComptes() {
        return new GetComptes();
    }

    /**
     * Create an instance of {@link GetComptesResponse }
     * 
     */
    public GetComptesResponse createGetComptesResponse() {
        return new GetComptesResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link Conversion }
     * 
     */
    public Conversion createConversion() {
        return new Conversion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "conversionResponse")
    public JAXBElement<ConversionResponse> createConversionResponse(ConversionResponse value) {
        return new JAXBElement<ConversionResponse>(_ConversionResponse_QNAME, ConversionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<Compte>(_Compte_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Conversion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "conversion")
    public JAXBElement<Conversion> createConversion(Conversion value) {
        return new JAXBElement<Conversion>(_Conversion_QNAME, Conversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getComptesResponse")
    public JAXBElement<GetComptesResponse> createGetComptesResponse(GetComptesResponse value) {
        return new JAXBElement<GetComptesResponse>(_GetComptesResponse_QNAME, GetComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getComptes")
    public JAXBElement<GetComptes> createGetComptes(GetComptes value) {
        return new JAXBElement<GetComptes>(_GetComptes_QNAME, GetComptes.class, null, value);
    }

}
