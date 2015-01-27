package com.blog

class PostController {

    static allowedMethods = [save: "POST"]

    def index() {
        redirect(action: list, params: params)
    }

    def list() {
        [postList: Post.list(max: 5)]
    }

    def create() {
        [post: new Post(params)]
    }

    def save() {
        def post = new Post()
        post.properties['title','body'] = params
        if(!post.hasErrors() && post.save()){
            flash.message = "Post ${post.id} created"
            redirect(action: list)
        }else{
            render(view: 'create', model:[post:post])
        }
    }
}