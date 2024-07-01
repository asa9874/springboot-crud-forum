package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.repository.*;
import com.example.model.*;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<Question> getList() {
        return this.questionRepository.findAll();
    }
}