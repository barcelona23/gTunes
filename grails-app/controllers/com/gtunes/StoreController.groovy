package com.gtunes

import grails.gorm.DetachedCriteria

class StoreController {

    def index() {

    }

    def shop() {
        def genreList = new DetachedCriteria(Album).distinct('genre').list()
        [genres:genreList.sort()]
    }
}
