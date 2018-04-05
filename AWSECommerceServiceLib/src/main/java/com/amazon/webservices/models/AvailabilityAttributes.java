/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AvailabilityAttributes 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5568906166117531541L;
    private String availabilityType;
    private Boolean isPreorder;
    private Integer minimumHours;
    private Integer maximumHours;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("AvailabilityType")
    public String getAvailabilityType ( ) { 
        return this.availabilityType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("AvailabilityType")
    public void setAvailabilityType (String value) { 
        this.availabilityType = value;
        notifyObservers(this.availabilityType);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("IsPreorder")
    public Boolean getIsPreorder ( ) { 
        return this.isPreorder;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("IsPreorder")
    public void setIsPreorder (Boolean value) { 
        this.isPreorder = value;
        notifyObservers(this.isPreorder);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MinimumHours")
    public Integer getMinimumHours ( ) { 
        return this.minimumHours;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MinimumHours")
    public void setMinimumHours (Integer value) { 
        this.minimumHours = value;
        notifyObservers(this.minimumHours);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MaximumHours")
    public Integer getMaximumHours ( ) { 
        return this.maximumHours;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MaximumHours")
    public void setMaximumHours (Integer value) { 
        this.maximumHours = value;
        notifyObservers(this.maximumHours);
    }
 
}
 