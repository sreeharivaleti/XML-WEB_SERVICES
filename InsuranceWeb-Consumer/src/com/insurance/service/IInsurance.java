
package com.insurance.service;

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
@WebService(name = "IInsurance", targetNamespace = "http://service.insurance.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IInsurance {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.insurance.service.EnrollmentInfo
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findPlan", targetNamespace = "http://service.insurance.com/", className = "com.insurance.service.FindPlan")
    @ResponseWrapper(localName = "findPlanResponse", targetNamespace = "http://service.insurance.com/", className = "com.insurance.service.FindPlanResponse")
    @Action(input = "http://service.insurance.com/IInsurance/findPlanRequest", output = "http://service.insurance.com/IInsurance/findPlanResponse")
    public EnrollmentInfo findPlan(
        @WebParam(name = "arg0", targetNamespace = "")
        PersonInfo arg0);

}
