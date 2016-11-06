
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
 *         &lt;element name="GetISOCountryCodeByCountyNameResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "getISOCountryCodeByCountyNameResult"
})
@XmlRootElement(name = "GetISOCountryCodeByCountyNameResponse", namespace = "http://www.webserviceX.NET")
public class GetISOCountryCodeByCountyNameResponse {

    @XmlElement(name = "GetISOCountryCodeByCountyNameResult", namespace = "http://www.webserviceX.NET")
    protected String getISOCountryCodeByCountyNameResult;

    /**
     * Gets the value of the getISOCountryCodeByCountyNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetISOCountryCodeByCountyNameResult() {
        return getISOCountryCodeByCountyNameResult;
    }

    /**
     * Sets the value of the getISOCountryCodeByCountyNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetISOCountryCodeByCountyNameResult(String value) {
        this.getISOCountryCodeByCountyNameResult = value;
    }

}
