/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Stikb
 */

public class Question {
    private String questionText;
    
    public Question(String questionText){
        this.questionText = questionText;
    }
    
    public String askQuestion(){
        return questionText;
    }
           
}
