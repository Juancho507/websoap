
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Calculadora complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Calculadora"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dato" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dato1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="con" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Calculadora", propOrder = {
    "dato",
    "dato1",
    "con"
})
public class Calculadora_Type {

    protected int dato;
    protected int dato1;
    protected int con;

    /**
     * Obtiene el valor de la propiedad dato.
     * 
     */
    public int getDato() {
        return dato;
    }

    /**
     * Define el valor de la propiedad dato.
     * 
     */
    public void setDato(int value) {
        this.dato = value;
    }

    /**
     * Obtiene el valor de la propiedad dato1.
     * 
     */
    public int getDato1() {
        return dato1;
    }

    /**
     * Define el valor de la propiedad dato1.
     * 
     */
    public void setDato1(int value) {
        this.dato1 = value;
    }

    /**
     * Obtiene el valor de la propiedad con.
     * 
     */
    public int getCon() {
        return con;
    }

    /**
     * Define el valor de la propiedad con.
     * 
     */
    public void setCon(int value) {
        this.con = value;
    }

}
