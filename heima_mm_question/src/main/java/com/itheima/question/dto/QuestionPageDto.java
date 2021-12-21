package com.itheima.question.dto;

import lombok.Data;

@Data
public class QuestionPageDto {
    int currentPage;
    int pageSize;
    String  companyName;
    int state;
}
