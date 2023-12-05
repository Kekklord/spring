package com.dem.kek.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.util.Pair;

import java.util.List;

@Document("quiz")
public class Quiz {
    @Id
    private Integer id;
    private String question;
    private List<Pair<String, Integer>> choices;
    private Integer answer;

    public Quiz(Integer id, String question, List<Pair<String, Integer>> choices, Integer answer) {
        this.id = id;
        this.question = question;
        this.choices = choices;
        this.answer = answer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Pair<String, Integer>> getChoices() {
        return choices;
    }

    public void setChoices(List<Pair<String, Integer>> choices) {
        this.choices = choices;
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }
}
