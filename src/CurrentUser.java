/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author chris
 */
public class CurrentUser extends Account {
    private Question currentQuestion;
    
    public CurrentUser(
            String username, 
            String password, 
            String[] questionsAnswered,
            int questionsCorrect,
            int questionsWrong,
            int elo
    ) {
        super(
                username, 
                password, 
                questionsAnswered, 
                questionsCorrect, 
                questionsWrong, 
                elo
        );      
        
    }
    
    public Question getQuestion() {
        return currentQuestion;
    }
    
    public void genQuestion(ArrayList<Question> questions) {
        String[] answeredQuestions = this.getQuestionsAnswered();

        // Check if all questions are answered
        if (answeredQuestions.length >= questions.size()) {
            currentQuestion = null;
            return;
        }

        Random rand = new Random();
        Question randomQuestion;

        while (true) {
            // Pick a random question
            randomQuestion = questions.get(rand.nextInt(questions.size()));
            String id = randomQuestion.getId();

            // Check if it's already answered
            boolean isAnswered = false;
            for (String answeredId : answeredQuestions) {
                if (answeredId.equals(id)) {
                    isAnswered = true;
                    break;
                }
            }

            // If not answered, use it
            if (!isAnswered) {
                break;
            }
        }

        currentQuestion = randomQuestion;
    }
}
