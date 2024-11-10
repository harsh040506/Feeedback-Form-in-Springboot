package com.example.feedbackform.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String question1;
    private String question2;
    private String question3;
    private String question4;

    private String question5;
    private String question6;
    private String question7;

    private String question8;
    private String question9;
    private String question10;
    private String question11;

    private String question12;
    private String question13;
    private String question14;
}