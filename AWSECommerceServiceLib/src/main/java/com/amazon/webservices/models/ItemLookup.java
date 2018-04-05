/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ItemLookup 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5457530413951337879L;
    private String marketplaceDomain;
    private String aWSAccessKeyId;
    private String associateTag;
    private String validate;
    private String xMLEscaping;
    private ItemLookupRequest shared;
    private List<ItemLookupRequest> request;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MarketplaceDomain")
    public String getMarketplaceDomain ( ) { 
        return this.marketplaceDomain;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MarketplaceDomain")
    public void setMarketplaceDomain (String value) { 
        this.marketplaceDomain = value;
        notifyObservers(this.marketplaceDomain);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("AWSAccessKeyId")
    public String getAWSAccessKeyId ( ) { 
        return this.aWSAccessKeyId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("AWSAccessKeyId")
    public void setAWSAccessKeyId (String value) { 
        this.aWSAccessKeyId = value;
        notifyObservers(this.aWSAccessKeyId);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("AssociateTag")
    public String getAssociateTag ( ) { 
        return this.associateTag;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("AssociateTag")
    public void setAssociateTag (String value) { 
        this.associateTag = value;
        notifyObservers(this.associateTag);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Validate")
    public String getValidate ( ) { 
        return this.validate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Validate")
    public void setValidate (String value) { 
        this.validate = value;
        notifyObservers(this.validate);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("XMLEscaping")
    public String getXMLEscaping ( ) { 
        return this.xMLEscaping;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("XMLEscaping")
    public void setXMLEscaping (String value) { 
        this.xMLEscaping = value;
        notifyObservers(this.xMLEscaping);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Shared")
    public ItemLookupRequest getShared ( ) { 
        return this.shared;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Shared")
    public void setShared (ItemLookupRequest value) { 
        this.shared = value;
        notifyObservers(this.shared);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Request")
    public List<ItemLookupRequest> getRequest ( ) { 
        return this.request;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Request")
    public void setRequest (List<ItemLookupRequest> value) { 
        this.request = value;
        notifyObservers(this.request);
    }
 
}
 