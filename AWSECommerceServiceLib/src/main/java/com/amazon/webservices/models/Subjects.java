/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Subjects 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5352171834196387468L;
    private List<String> subject;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Subject")
    public List<String> getSubject ( ) { 
        return this.subject;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Subject")
    public void setSubject (List<String> value) { 
        this.subject = value;
        notifyObservers(this.subject);
    }
 
}
 