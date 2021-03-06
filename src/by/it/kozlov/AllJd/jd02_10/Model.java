//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.02.13 at 06:59:28 PM MSK 
//


package by.it.kozlov.jd02_10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigInteger;


/**
 * <p>Java class for Model complex type.
 * <p>
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="Model"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Class" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Years" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Model", propOrder = {
        "name",
        "clazz",
        "price",
        "years"
})
public class Model {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Class", required = true)
    protected String clazz;
    @XmlElement(name = "Price", required = true)
    protected BigInteger price;
    @XmlElement(name = "Years", required = true)
    protected BigInteger years;

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the clazz property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the price property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setPrice(BigInteger value) {
        this.price = value;
    }

    /**
     * Gets the value of the years property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getYears() {
        return years;
    }


    /**
     * Sets the value of the years property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setYears(BigInteger value) {
        this.years = value;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", clazz='" + clazz + '\'' +
                ", price=" + price +
                ", years=" + years +
                '}';
    }
}
