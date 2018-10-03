
package com.cal.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculatorService", targetNamespace = "http://service.cal.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculatorService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://service.cal.com/", className = "com.cal.service.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://service.cal.com/", className = "com.cal.service.AddResponse")
    @Action(input = "http://service.cal.com/CalculatorService/addRequest", output = "http://service.cal.com/CalculatorService/addResponse")
    public int add(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sub", targetNamespace = "http://service.cal.com/", className = "com.cal.service.Sub")
    @ResponseWrapper(localName = "subResponse", targetNamespace = "http://service.cal.com/", className = "com.cal.service.SubResponse")
    @Action(input = "http://service.cal.com/CalculatorService/subRequest", output = "http://service.cal.com/CalculatorService/subResponse")
    public int sub(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}
