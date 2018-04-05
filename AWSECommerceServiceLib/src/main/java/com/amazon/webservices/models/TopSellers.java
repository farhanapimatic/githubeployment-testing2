/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TopSellers 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5625478534144457481L;
    private List<TopSeller> topSeller;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("TopSeller")
    public List<TopSeller> getTopSeller ( ) { 
        return this.topSeller;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("TopSeller")
    public void setTopSeller (List<TopSeller> value) { 
        this.topSeller = value;
        notifyObservers(this.topSeller);
    }
 
}
 