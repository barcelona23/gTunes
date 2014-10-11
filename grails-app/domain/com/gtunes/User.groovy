package com.gtunes

class User {

    String firstName
    String password

    static constraints = {
        password unique : true, length : 5..15, validator : { val, obj ->
            if(val?.equalsIgnoreCase(obj.firstName)){
                //return false
                return "password.cannot.be.firstname"
            }
        }

    }
}
