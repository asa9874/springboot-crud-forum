package com.example.demo;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.model.*;
import com.example.repository.*;;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void testJpa() {        
        Question q1 = new Question();
        q1.setSubject("사과는 무엇인가요?");
        q1.setContent("사과는 대체 뭘까....");
        q1.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q1);  // 첫번째 질문 저장

        Question q2 = new Question();
        q2.setSubject("무기는 뭘까?");
        q2.setContent("방패도 무기일까?");
        q2.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q2);  // 두번째 질문 저장
    }
}