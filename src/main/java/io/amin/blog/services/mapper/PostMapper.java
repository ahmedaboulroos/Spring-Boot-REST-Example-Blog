package io.amin.blog.services.mapper;

import io.amin.blog.models.Post;
import io.amin.blog.repositories.UserRepository;
import io.amin.blog.services.dto.PostDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PostMapper {

    private final UserRepository userRepository;

    public PostMapper(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public PostDto toDto(Post post) {
        PostDto postDto = new PostDto();
        postDto.setId(post.getId());
        postDto.setTitle(post.getTitle());
        postDto.setContent(post.getContent());
        postDto.setTimestamp(post.getTimestamp());
        postDto.setAuthorId(post.getAuthor().getId());
        return postDto;
    }

    public List<PostDto> toDtoList(List<Post> posts) {
        List<PostDto> postDtoList = new ArrayList<>();
        for (Post post : posts) {
            postDtoList.add(toDto(post));
        }
        return postDtoList;
    }

    public Post toModel(PostDto postDto) {
        Post post = new Post();
        post.setId(postDto.getId());
        post.setTitle(postDto.getTitle());
        post.setContent(postDto.getContent());
        post.setTimestamp(postDto.getTimestamp());
        post.setAuthor(userRepository.findById(postDto.getAuthorId()).orElseThrow());
        return post;
    }

}
