/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Chris
 */
public class MultipleChoice extends Question {
    private int answer;
    private String[] choices = new String[4];
    
    public MultipleChoice(
            String question, 
            String id, 
            int answer, 
            String[] choices, 
            int eloGain, 
            int eloLose
    ){
        super(question, id, eloGain, eloLose);
        this.answer = answer;
        this.choices = choices;
    }
    
    public boolean checkAnswer(int choice) {
        return answer == choice;
    }
}
