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
    
    public TrueFalse(
            String question, 
            String tip,
            String id, 
            boolean answer, 
            int eloGain, 
            int eloLose
    ){
        super(question, tip, id, eloGain, eloLose);
        this.answer = answer;
    }
    
    public boolean checkAnswer(boolean choice) {
        return answer == choice;
    }
    
    public boolean getAnswer() {
        return answer;
    }
}
