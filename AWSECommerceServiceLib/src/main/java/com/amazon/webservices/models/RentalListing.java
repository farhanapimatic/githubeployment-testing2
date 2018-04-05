/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class RentalListing 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4835513536581460744L;
    private Price price;
    private NonNegativeIntegerWithUnits period;
    private Boolean isFulfilledByAmazon;
    private String disclaimer;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Price")
    public Price getPrice ( ) { 
        return this.price;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Price")
    public void setPrice (Price value) { 
        this.price = value;
        notifyObservers(this.price);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Period")
    public NonNegativeIntegerWithUnits getPeriod ( ) { 
        return this.period;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Period")
    public void setPeriod (NonNegativeIntegerWithUnits value) { 
        this.period = value;
        notifyObservers(this.period);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("IsFulfilledByAmazon")
    public Boolean getIsFulfilledByAmazon ( ) { 
        return this.isFulfilledByAmazon;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("IsFulfilledByAmazon")
    public void setIsFulfilledByAmazon (Boolean value) { 
        this.isFulfilledByAmazon = value;
        notifyObservers(this.isFulfilledByAmazon);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Disclaimer")
    public String getDisclaimer ( ) { 
        return this.disclaimer;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Disclaimer")
    public void setDisclaimer (String value) { 
        this.disclaimer = value;
        notifyObservers(this.disclaimer);
    }
 
}
 