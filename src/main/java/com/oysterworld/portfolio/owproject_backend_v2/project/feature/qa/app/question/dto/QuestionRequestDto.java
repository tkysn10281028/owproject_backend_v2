package com.oysterworld.portfolio.owproject_backend_v2.project.feature.qa.app.question.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionRequestDto {
    private String userId;
    private String title;
    private String content;
}
