/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CartModifyResponseMsg 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5031318262090942458L;
    private CartModifyResponse body;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("body")
    public CartModifyResponse getBody ( ) { 
        return this.body;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("body")
    public void setBody (CartModifyResponse value) { 
        this.body = value;
        notifyObservers(this.body);
    }
 
}
 