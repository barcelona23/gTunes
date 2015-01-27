package com.gtunes

class Artist implements Serializable{

    Date dateCreated
    Date lastUpdated

    String name

    static hasMany = [albums:Album]

    static searchable = [only: ['name']]

    static constraints = {
        name blank:false, nullable:false
    }

    String toString() { name }
}