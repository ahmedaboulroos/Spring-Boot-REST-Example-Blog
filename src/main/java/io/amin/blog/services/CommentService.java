package io.amin.blog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.amin.blog.models.Comment;
import io.amin.blog.repositories.CommentRepository;

@Service
public class CommentService {
    
    @Autowired
    private CommentRepository commentRepository;

	public List<Comment> getBlogPostComments(int blogPostId) {
		return null;
	}

	public Comment getBlogPostComment(int blogPostId, int commentId) {
		return null;
	}

	public Comment updateBlogPostComment(int blogPostId, int commentId, Comment comment) {
		return null;
	}

	public Comment createBlogPostComment(int blogPostId, Comment comment) {
		return null;
	}

	public Comment deleteBlogPostComment(int blogPostId, int commentId) {
		return null;
	}

}