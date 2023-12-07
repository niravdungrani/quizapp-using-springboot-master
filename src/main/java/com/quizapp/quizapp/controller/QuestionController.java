package com.quizapp.quizapp.controller;

import com.quizapp.quizapp.Question;
import com.quizapp.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("question")
@RestController
public class QuestionController {
    @Autowired
    QuestionService questionService;
    @GetMapping("allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public List<Question> getQuestionByCategory(@PathVariable String category){
        return questionService.getQuestionByCategory(category);
    }

    @PostMapping("add")
    public List<Question> addQuestion(@RequestBody List<Question> question){
        return questionService.addQuestion(question);
    }

    @DeleteMapping("deleteQuestionById/{id}")
    public String deleteQuestionById(@PathVariable Integer id){
        return questionService.deleteQuestionById(id);
    }

    @PutMapping("updateQuestion")
    public List<Question> updateQuestion(@RequestBody List<Question> question){
        return questionService.updateQuestion(question);
    }

}
