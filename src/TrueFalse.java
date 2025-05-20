/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Stikb
 */
public class TrueFalse extends Question {
    private boolean answer;
    private String[] choices = new String[4];
    
    public TrueFalse(
            String question, 
            String id, 
            boolean answer, 
            String[] choices, 
            int eloGain, 
            int eloLose
    ){
        super(question, id, eloGain, eloLose);
        this.answer = answer;
    }
    
    public boolean checkAnswer(boolean choice) {
        return answer == choice;
    }
}
