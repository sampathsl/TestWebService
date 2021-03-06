//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.25 at 09:30:01 AM IST 
//


package com.weather.service;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}apparentTemperatureMinTime"/>
 *           &lt;element ref="{}temperatureMax"/>
 *         &lt;/sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{}apparentTemperature"/>
 *           &lt;element ref="{}cloudCover"/>
 *           &lt;element ref="{}dewPoint"/>
 *           &lt;element ref="{}humidity"/>
 *           &lt;element ref="{}icon"/>
 *           &lt;element ref="{}ozone"/>
 *           &lt;element ref="{}precipIntensity"/>
 *           &lt;element ref="{}precipProbability"/>
 *           &lt;element ref="{}pressure"/>
 *           &lt;element ref="{}summary"/>
 *           &lt;element ref="{}temperature"/>
 *           &lt;element ref="{}time"/>
 *           &lt;element ref="{}windBearing"/>
 *           &lt;element ref="{}windSpeed"/>
 *           &lt;element ref="{}apparentTemperatureMax"/>
 *           &lt;element ref="{}apparentTemperatureMin"/>
 *           &lt;element ref="{}moonPhase"/>
 *           &lt;element ref="{}precipAccumulation"/>
 *           &lt;element ref="{}precipIntensityMax"/>
 *           &lt;element ref="{}precipType"/>
 *           &lt;element ref="{}sunriseTime"/>
 *           &lt;element ref="{}sunsetTime"/>
 *           &lt;element ref="{}temperatureMaxTime"/>
 *           &lt;element ref="{}temperatureMin"/>
 *           &lt;element ref="{}temperatureMinTime"/>
 *         &lt;/choice>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{}precipIntensityMaxTime"/>
 *           &lt;element ref="{}apparentTemperatureMaxTime"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "apparentTemperatureMinTime",
    "temperatureMax",
    "apparentTemperatureOrCloudCoverOrDewPoint",
    "precipIntensityMaxTime",
    "apparentTemperatureMaxTime"
})
@XmlRootElement(name = "data")
public class Data {

    protected BigInteger apparentTemperatureMinTime;
    protected BigDecimal temperatureMax;
    @XmlElementRefs({
        @XmlElementRef(name = "summary", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "time", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "temperatureMaxTime", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "humidity", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "precipAccumulation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cloudCover", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "precipIntensityMax", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "apparentTemperature", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "precipIntensity", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pressure", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "precipType", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "temperature", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "moonPhase", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "windSpeed", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sunriseTime", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "temperatureMin", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "icon", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "precipProbability", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "windBearing", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "apparentTemperatureMax", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dewPoint", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ozone", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "apparentTemperatureMin", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "temperatureMinTime", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sunsetTime", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> apparentTemperatureOrCloudCoverOrDewPoint;
    protected BigInteger precipIntensityMaxTime;
    protected BigInteger apparentTemperatureMaxTime;

    /**
     * Gets the value of the apparentTemperatureMinTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApparentTemperatureMinTime() {
        return apparentTemperatureMinTime;
    }

    /**
     * Sets the value of the apparentTemperatureMinTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApparentTemperatureMinTime(BigInteger value) {
        this.apparentTemperatureMinTime = value;
    }

    /**
     * Gets the value of the temperatureMax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTemperatureMax() {
        return temperatureMax;
    }

    /**
     * Sets the value of the temperatureMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTemperatureMax(BigDecimal value) {
        this.temperatureMax = value;
    }

    /**
     * Gets the value of the apparentTemperatureOrCloudCoverOrDewPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apparentTemperatureOrCloudCoverOrDewPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApparentTemperatureOrCloudCoverOrDewPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getApparentTemperatureOrCloudCoverOrDewPoint() {
        if (apparentTemperatureOrCloudCoverOrDewPoint == null) {
            apparentTemperatureOrCloudCoverOrDewPoint = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.apparentTemperatureOrCloudCoverOrDewPoint;
    }

    /**
     * Gets the value of the precipIntensityMaxTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrecipIntensityMaxTime() {
        return precipIntensityMaxTime;
    }

    /**
     * Sets the value of the precipIntensityMaxTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrecipIntensityMaxTime(BigInteger value) {
        this.precipIntensityMaxTime = value;
    }

    /**
     * Gets the value of the apparentTemperatureMaxTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApparentTemperatureMaxTime() {
        return apparentTemperatureMaxTime;
    }

    /**
     * Sets the value of the apparentTemperatureMaxTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApparentTemperatureMaxTime(BigInteger value) {
        this.apparentTemperatureMaxTime = value;
    }

}
