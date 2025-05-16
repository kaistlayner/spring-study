package com.example.board.mapper;

import com.example.board.dto.PostRequestDto;
import com.example.board.dto.PostResponseDto;
import com.example.board.entity.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PostMapper {
    @Mapping(target = "id", ignore = true)
    Post postRequestDtoToPost(PostRequestDto postRequestDto);
    PostResponseDto postToPostResponseDto(Post post);
    List<PostResponseDto> postsToPostResponseDto(List<Post> posts);
}
