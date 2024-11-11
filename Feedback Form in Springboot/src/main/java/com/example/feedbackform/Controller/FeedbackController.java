package com.example.feedbackform.Controller;

import com.example.feedbackform.Entity.Feedback;
import com.example.feedbackform.Repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FeedbackController {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @GetMapping("/feedback")
    public String showForm(Model model) {
        model.addAttribute("feedback", new Feedback());
        return "feedback-form";
    }

    @GetMapping("/thank-you")
    public String showThankForm(Model model) {
        model.addAttribute("feedback", new Feedback());
        return "feedback-recorded";
    }

    @PostMapping("/feedback")
    public String submitFeedback(Feedback feedback) {
        feedbackRepository.save(feedback);
        return "redirect:/thank-you";
    }
}
