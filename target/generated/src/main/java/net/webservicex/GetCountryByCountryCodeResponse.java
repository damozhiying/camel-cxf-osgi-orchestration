
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetCountryByCountryCodeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getCountryByCountryCodeResult"
})
@XmlRootElement(name = "GetCountryByCountryCodeResponse", namespace = "http://www.webserviceX.NET")
public class GetCountryByCountryCodeResponse {

    @XmlElement(name = "GetCountryByCountryCodeResult", namespace = "http://www.webserviceX.NET")
    protected String getCountryByCountryCodeResult;

    /**
     * Gets the value of the getCountryByCountryCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetCountryByCountryCodeResult() {
        return getCountryByCountryCodeResult;
    }

    /**
     * Sets the value of the getCountryByCountryCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetCountryByCountryCodeResult(String value) {
        this.getCountryByCountryCodeResult = value;
    }

}