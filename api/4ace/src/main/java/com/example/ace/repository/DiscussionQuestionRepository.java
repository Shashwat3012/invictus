package com.example.ace.repository;

import com.example.ace.entity.DiscussionQuestions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscussionQuestionRepository extends JpaRepository<DiscussionQuestions, Long> {
}
