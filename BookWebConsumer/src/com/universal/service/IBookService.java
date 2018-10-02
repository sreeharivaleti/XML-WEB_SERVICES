
package com.universal.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import com.universal.domain.Book;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IBookService", targetNamespace = "http://service.universal.com")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.universal.domain.ObjectFactory.class,
    com.universal.service.ObjectFactory.class
})
public interface IBookService {


    /**
     * 
     * @param isbn
     * @return
     *     returns com.universal.domain.Book
     */
    @WebMethod
    @WebResult(name = "searchBookReturn", targetNamespace = "http://service.universal.com", partName = "book")
    @Action(input = "http://service.universal.com/IBookService/searchBookRequest", output = "http://service.universal.com/IBookService/searchBookResponse")
    public Book searchBook(
        @WebParam(name = "isbn", targetNamespace = "http://service.universal.com", partName = "isbn")
        int isbn);

}