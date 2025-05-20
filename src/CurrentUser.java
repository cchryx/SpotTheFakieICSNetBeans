/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author chris
 */
public class CurrentUser extends Account {
    private Question currentQuestion;
    
    public CurrentUser(
            String username, 
            String password, 
            ArrayList<Question> questionsAnswered,
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
        
        this.genQuestion();
    }
    
    public Question getQuestion() {
        return currentQuestion;
    }
    
    public void genQuestion() {
        
    }
}
