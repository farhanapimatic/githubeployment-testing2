/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Tracks 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5387017952448884942L;
    private List<Disc> disc;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Disc")
    public List<Disc> getDisc ( ) { 
        return this.disc;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Disc")
    public void setDisc (List<Disc> value) { 
        this.disc = value;
        notifyObservers(this.disc);
    }
 
}
 