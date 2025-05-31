package com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.app.answer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnswerRequestDto {
    private String questionId;
    private String userId;
    private String content;
}
