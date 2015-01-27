<html>
<head>
    <title>Post List</title>
    <meta http-equiv="CONTENT-TYPE" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="${param.layout ?: 'main'}"/>
</head>

<body>
    <div class="nav">
        <span class="menuButton">
            <g:link class="create" action="create">new Post</g:link>
        </span>
    </div>
    <div class="blog">
        <h1>${grailsApplication.config.blog.title ?: 'No Title'}</h1>
        <g:render plugin="blog" template="post" var="post" collection="${postList?.reverse()}"/>
    </div>
</body>
</html>