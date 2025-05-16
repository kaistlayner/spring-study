package com.example.board.service;

import com.example.board.dto.PostRequestDto;
import com.example.board.dto.PostResponseDto;
import com.example.board.entity.Post;
import com.example.board.mapper.PostMapper;
import com.example.board.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    private final PostMapper mapper;

    public PostResponseDto savePost(PostRequestDto postRequestDto) {
        Post post = mapper.postRequestDtoToPost(postRequestDto);
        Post savedPost = postRepository.save(post);
        return mapper.postToPostResponseDto(savedPost);
    }
}
