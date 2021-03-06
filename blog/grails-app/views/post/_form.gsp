<%@ page import="com.blog.Post" %>

<div class="fieldcontain" ${hasErrors(bean: postInstance, field: 'title', 'error')}>
	<label for="title">
		<g:message code="post.title.label" default="Title"></g:message>
	</label>
	<g:textField name="title" value="${postInstance?.title}"></g:textField>
</div>

<div class="fieldcontain" ${hasErrors(bean: postInstance, field: 'body', 'error')}>
	<ckeditor:editor name="body" height="300" width="500">
		${postInstance?.body}
	</ckeditor:editor>
</div>