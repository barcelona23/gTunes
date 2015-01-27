package com.gtunes

class Song implements Comparable{

    Date dateCreated
    Date lastUpdated

    String title
    String genre
    Integer year
    Integer trackNumber
    Integer duration
    Artist artist

    static belongsTo = [album: Album]

    static searchable = [only: ['genre', 'title']]

    static constraints = {
        title blank:false
        duration(min:1)
        year range:1900..2100
    }

    static mapping = {
        sort "trackNumber"
    }
    // or
    int compareTo(o){
        if (this.trackNumber > o.trackNumber){
            return 1
        } else if(this.trackNumber < o.trackNumber){
            return -1
        }
        return 0
    }

    String toString() { title }
}
