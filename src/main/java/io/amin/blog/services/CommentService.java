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
		return commentRepository.findByBlogPostId(blogPostId);
	}

	public List<Comment> getAllUserComments(int userId) {
		return commentRepository.findByAuthorId(userId);
	}

	public Comment getBlogPostComment(int blogPostId, int commentId) {
		// TODO check comment IDs
		return commentRepository.findById(commentId).orElseThrow();
	}

	public Comment updateBlogPostComment(int blogPostId, int commentId, Comment comment) {
		// TODO check comment IDs
		return commentRepository.save(comment);
	}

	public Comment createBlogPostComment(int blogPostId, Comment comment) {
		// TODO check comment IDs
		return commentRepository.save(comment);
	}

	public Comment deleteBlogPostComment(int blogPostId, int commentId) {
		// TODO check comment IDs
		Comment comment = commentRepository.findById(commentId).orElseThrow();
		commentRepository.deleteById(commentId);
		return comment;
	}

}