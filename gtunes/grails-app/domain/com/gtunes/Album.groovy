package com.gtunes

class Album implements Serializable{

    Date dateCreated
    Date lastUpdated

    String title
    Integer year
    String genre

    //List songs //allows duplicates
    SortedSet songs

    static hasMany = [songs: Song]
    static belongsTo = [artist: Artist]

    static searchable = [only: ['genre', 'title']]

    static constraints = {
        title blank:false
        year range:1900..2100
    }

    // this or implement Comparable interface
    static mapping = {
        //songs sort: "trackNumber"
    }

    String toString() { title }
}