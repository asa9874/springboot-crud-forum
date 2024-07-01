package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Question;
import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Question findBySubject(String subject);
    Question findBySubjectAndContent(String subject, String content);
    List<Question> findBySubjectLike(String subject);
}