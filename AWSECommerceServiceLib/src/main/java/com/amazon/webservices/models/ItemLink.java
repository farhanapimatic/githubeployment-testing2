/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ItemLink 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5222746256645243801L;
    private String description;
    private String uRL;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Description")
    public void setDescription (String value) { 
        this.description = value;
        notifyObservers(this.description);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("URL")
    public String getURL ( ) { 
        return this.uRL;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("URL")
    public void setURL (String value) { 
        this.uRL = value;
        notifyObservers(this.uRL);
    }
 
}
 