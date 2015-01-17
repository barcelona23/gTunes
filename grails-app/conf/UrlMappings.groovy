class UrlMappings {

	static mappings = {

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: "store")
        //"/"(view:"/index")

        "/showAlbum/$controller/$action?/$id?"{
            constraints{}
        }

        "/showArtist"(controller: 'artist', action: 'show')

        "/showArtist/$artistName"(controller: 'artist', action: 'show')

        "500"(view:'/error')
	}
}
