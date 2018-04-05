/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SearchResultsMap 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5295265055395192709L;
    private List<SearchIndex> searchIndex;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("SearchIndex")
    public List<SearchIndex> getSearchIndex ( ) { 
        return this.searchIndex;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("SearchIndex")
    public void setSearchIndex (List<SearchIndex> value) { 
        this.searchIndex = value;
        notifyObservers(this.searchIndex);
    }
 
}
 