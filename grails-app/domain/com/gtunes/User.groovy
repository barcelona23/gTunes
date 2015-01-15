package com.gtunes

class User {

    String login
    String password
    String firstName
    String lastName

    static hasMany = [purchasedSongs:Song]

    static mapping = {
        table "gUser"
    }

    static constraints = {
        login blank: false, size: 5..15, matches: /[\S]+/, unique: true
        password blank: false, size : 5..15, matches: /[\S]+/, validator : { val, obj ->
            if(val?.equalsIgnoreCase(obj.firstName)){
                //return false
                return "password.cannot.be.firstname"
            }
        }
        firstName blank: false
        lastName blank: false
    }
}