/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class EditorialReview 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5439568892537172895L;
    private String source;
    private String content;
    private Boolean isLinkSuppressed;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Source")
    public String getSource ( ) { 
        return this.source;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Source")
    public void setSource (String value) { 
        this.source = value;
        notifyObservers(this.source);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Content")
    public String getContent ( ) { 
        return this.content;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Content")
    public void setContent (String value) { 
        this.content = value;
        notifyObservers(this.content);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("IsLinkSuppressed")
    public Boolean getIsLinkSuppressed ( ) { 
        return this.isLinkSuppressed;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("IsLinkSuppressed")
    public void setIsLinkSuppressed (Boolean value) { 
        this.isLinkSuppressed = value;
        notifyObservers(this.isLinkSuppressed);
    }
 
}
 