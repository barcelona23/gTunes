package com.gtunes

class AlbumController {

    def index() { }

    def update(){
        def album = Album.get(params.id)
        album.properties = params
        album.save()
    }
}
