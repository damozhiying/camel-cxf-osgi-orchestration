
package net.wsip;

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
 *         &lt;element name="GetGeoIPContextResult" type="{http://www.webservicex.net/}GeoIP" minOccurs="0"/&gt;
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
    "getGeoIPContextResult"
})
@XmlRootElement(name = "GetGeoIPContextResponse", namespace = "http://www.webservicex.net/")
public class GetGeoIPContextResponse {

    @XmlElement(name = "GetGeoIPContextResult", namespace = "http://www.webservicex.net/")
    protected GeoIP getGeoIPContextResult;

    /**
     * Gets the value of the getGeoIPContextResult property.
     * 
     * @return
     *     possible object is
     *     {@link GeoIP }
     *     
     */
    public GeoIP getGetGeoIPContextResult() {
        return getGeoIPContextResult;
    }

    /**
     * Sets the value of the getGeoIPContextResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoIP }
     *     
     */
    public void setGetGeoIPContextResult(GeoIP value) {
        this.getGeoIPContextResult = value;
    }

}
