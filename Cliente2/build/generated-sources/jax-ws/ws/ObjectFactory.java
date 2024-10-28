
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _Calculadora_QNAME = new QName("http://WS/", "Calculadora");
    private final static QName _CalculadoraResponse_QNAME = new QName("http://WS/", "CalculadoraResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Calculadora_Type }
     * 
     */
    public Calculadora_Type createCalculadora_Type() {
        return new Calculadora_Type();
    }

    /**
     * Create an instance of {@link CalculadoraResponse }
     * 
     */
    public CalculadoraResponse createCalculadoraResponse() {
        return new CalculadoraResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calculadora_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "Calculadora")
    public JAXBElement<Calculadora_Type> createCalculadora(Calculadora_Type value) {
        return new JAXBElement<Calculadora_Type>(_Calculadora_QNAME, Calculadora_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculadoraResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "CalculadoraResponse")
    public JAXBElement<CalculadoraResponse> createCalculadoraResponse(CalculadoraResponse value) {
        return new JAXBElement<CalculadoraResponse>(_CalculadoraResponse_QNAME, CalculadoraResponse.class, null, value);
    }

}
