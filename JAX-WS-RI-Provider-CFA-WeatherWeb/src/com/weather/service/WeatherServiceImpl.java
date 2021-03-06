
package com.weather.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WeatherServiceImpl", targetNamespace = "http://service.weather.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WeatherServiceImpl {


    /**
     * 
     * @param zip
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(name = "getTemperatureReturn", targetNamespace = "http://service.weather.com")
    @RequestWrapper(localName = "getTemperature", targetNamespace = "http://service.weather.com", className = "com.weather.service.GetTemperature")
    @ResponseWrapper(localName = "getTemperatureResponse", targetNamespace = "http://service.weather.com", className = "com.weather.service.GetTemperatureResponse")
    public double getTemperature(
        @WebParam(name = "zip", targetNamespace = "http://service.weather.com")
        int zip);

}
