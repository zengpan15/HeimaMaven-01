package com.itheima.question.vo;

import com.itheima.question.pojo.Question;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionVo {
    private String id;
    private String companyName;
    private String catalogName;
    private String subject;
    private String type;
    private String difficulty;
    private String isClassic;
    private String state;
    private String reviewStatus;

    public static QuestionVo fromQuestion(Question question) {
        QuestionVo questionVo = new QuestionVo();
        questionVo.setId(question.getId());
        questionVo.setCompanyName(question.getCompanyName());
        questionVo.setCatalogName(question.getCatalogName());
        questionVo.setSubject(question.getSubject());
        questionVo.setType(question.getType());
        questionVo.setDifficulty(question.getDifficulty());
        questionVo.setIsClassic(question.getIsClassic());
        questionVo.setState(question.getState());
        questionVo.setReviewStatus(question.getReviewStatus());
        return questionVo;


    }
}
