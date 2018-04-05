/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TopItem 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5516456215639489692L;
    private String aSIN;
    private String title;
    private String detailPageURL;
    private String productGroup;
    private List<String> author;
    private List<String> artist;
    private List<String> actor;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ASIN")
    public String getASIN ( ) { 
        return this.aSIN;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ASIN")
    public void setASIN (String value) { 
        this.aSIN = value;
        notifyObservers(this.aSIN);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Title")
    public String getTitle ( ) { 
        return this.title;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Title")
    public void setTitle (String value) { 
        this.title = value;
        notifyObservers(this.title);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("DetailPageURL")
    public String getDetailPageURL ( ) { 
        return this.detailPageURL;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("DetailPageURL")
    public void setDetailPageURL (String value) { 
        this.detailPageURL = value;
        notifyObservers(this.detailPageURL);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ProductGroup")
    public String getProductGroup ( ) { 
        return this.productGroup;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ProductGroup")
    public void setProductGroup (String value) { 
        this.productGroup = value;
        notifyObservers(this.productGroup);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Author")
    public List<String> getAuthor ( ) { 
        return this.author;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Author")
    public void setAuthor (List<String> value) { 
        this.author = value;
        notifyObservers(this.author);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Artist")
    public List<String> getArtist ( ) { 
        return this.artist;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Artist")
    public void setArtist (List<String> value) { 
        this.artist = value;
        notifyObservers(this.artist);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Actor")
    public List<String> getActor ( ) { 
        return this.actor;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Actor")
    public void setActor (List<String> value) { 
        this.actor = value;
        notifyObservers(this.actor);
    }
 
}
 