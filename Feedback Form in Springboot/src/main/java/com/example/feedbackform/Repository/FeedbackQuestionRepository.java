package com.example.feedbackform.Repository;

import com.example.feedbackform.Entity.FeedbackQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackQuestionRepository extends JpaRepository<FeedbackQuestion, Long> {
}