package com.gtunes

class Album {

    String title

    //Default Set unordered
    SortedSet songs

    static hasMany = [songs : Song]

    static belongsTo = [artist : Artist]

    static constraints = {
    }
}
