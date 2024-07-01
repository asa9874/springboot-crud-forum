package com.example.demo;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.model.*;
import com.example.repository.*;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import java.util.Optional;


@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    //생성테스트
    @Test
    void testCreateQuestion() {        
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

    


    //조회테스트들
    @Test
    void testFindall(){
        List<Question> all = this.questionRepository.findAll();
        assertEquals(2, all.size());

        Question q = all.get(0);
        assertEquals("사과는 무엇인가요?", q.getSubject());
    }

    @Test
    void testFindId(){
        Optional<Question> oq = this.questionRepository.findById(1);
        if(oq.isPresent()) {
            Question q = oq.get();
            assertEquals("사과는 무엇인가요?", q.getSubject());
        }
    }

    @Test
    void testFindSubject(){
        Question q = this.questionRepository.findBySubject("사과는 무엇인가요?");
        assertEquals(1, q.getId());
    }

    @Test
    void testfindSubjectAndContent(){
        Question q = this.questionRepository.findBySubjectAndContent("사과는 무엇인가요?", "사과는 대체 뭘까....");
        assertEquals(1, q.getId());
    }

    @Test
    void testfindSubjectLike(){
        List<Question> qList = this.questionRepository.findBySubjectLike("사과%");
        Question q = qList.get(0);
        assertEquals("사과는 무엇인가요?", q.getSubject());
    }



    //수정테스트
    @Test 
    void testModifyQuestion(){
        Optional<Question> oq = this.questionRepository.findById(1);
        assertTrue(oq.isPresent());
        Question q = oq.get();
        q.setSubject("수정된 사과");
        this.questionRepository.save(q);
    }


    //삭제테스트
    @Test
    void testRemoveQuestion(){
        assertEquals(2, this.questionRepository.count());
        Optional<Question> oq = this.questionRepository.findById(1);
        assertTrue(oq.isPresent());
        Question q = oq.get();
        this.questionRepository.delete(q);
        assertEquals(1, this.questionRepository.count());
    }
}