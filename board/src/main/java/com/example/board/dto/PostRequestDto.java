package com.example.board.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostRequestDto {
    @NotBlank(message = "제목은 필수 입력 항목입니다.")
    @Size(max = 30, message = "제목은 30자를 넘을 수 없습니다.")
    private String title;
    @NotBlank(message = "내용은 필수 입력 항목입니다.")
    @Size(max = 2000, message = "내용은 2000자를 넘을 수 없습니다.")
    private String content;
    @NotBlank(message = "작성자는 필수 입력 항목입니다.")
    @Size(max = 30, message = "작성자는 10자를 넘을 수 없습니다.")
    private String author;
}
