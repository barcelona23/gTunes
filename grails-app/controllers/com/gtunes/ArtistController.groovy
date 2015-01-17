package com.gtunes

class ArtistController {

    def show() {
        def artist = Artist.findByName(params.artistName)
    }
}
