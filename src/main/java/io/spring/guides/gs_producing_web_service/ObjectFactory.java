//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.22 at 10:07:58 AM UTC 
//


package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.spring.guides.gs_producing_web_service package. 
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

    private final static QName _PrototypeRequestAll_QNAME = new QName("http://spring.io/guides/gs-producing-web-service", "PrototypeRequestAll");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.spring.guides.gs_producing_web_service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PrototypeResponseAll }
     * 
     */
    public PrototypeResponseAll createPrototypeResponseAll() {
        return new PrototypeResponseAll();
    }

    /**
     * Create an instance of {@link PrototypeRequest }
     * 
     */
    public PrototypeRequest createPrototypeRequest() {
        return new PrototypeRequest();
    }

    /**
     * Create an instance of {@link PrototypeResponse }
     * 
     */
    public PrototypeResponse createPrototypeResponse() {
        return new PrototypeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://spring.io/guides/gs-producing-web-service", name = "PrototypeRequestAll")
    public JAXBElement<Object> createPrototypeRequestAll(Object value) {
        return new JAXBElement<Object>(_PrototypeRequestAll_QNAME, Object.class, null, value);
    }

}