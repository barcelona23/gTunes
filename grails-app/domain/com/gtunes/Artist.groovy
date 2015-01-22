package com.gtunes

class Artist implements Serializable{

    static searchable = [only: ['name']]
    Date dateCreated
    Date lastUpdated

    String name
    static hasMany = [albums:Album]

    static constraints = {
        name blank:false, nullable:false
    }

    String toString() { name }
}