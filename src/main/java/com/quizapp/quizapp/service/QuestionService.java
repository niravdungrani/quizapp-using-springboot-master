package com.quizapp.quizapp.service;

import com.quizapp.quizapp.Question;
import com.quizapp.quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;
    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<Question> getQuestionByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public List<Question> addQuestion(List<Question> question) {
        return questionDao.saveAll(question);
    }

    public String deleteQuestionById(Integer id) {
        questionDao.deleteById(id);
        return "success";
    }

    public List<Question> updateQuestion(List<Question> question) {
        return questionDao.saveAll(question);
    }
}
