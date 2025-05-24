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
    
    /**
     * Constructs a MultipleChoice question with all necessary parameters.
     *
     * @param question the question text
     * @param tip a helpful tip for the question
     * @param id a unique identifier for the question
     * @param answer the index (0–3) of the correct answer
     * @param choices an array of 4 answer choices
     * @param eloGain ELO points gained on correct answer
     * @param eloLose ELO points lost on wrong answer
     */
    public MultipleChoice(
            String question, 
            String tip,
            String id, 
            int answer, 
            String[] choices, 
            int eloGain, 
            int eloLose
    ){
        super(question, tip, id, eloGain, eloLose);
        this.answer = answer;
        this.choices = choices;
    }
    
    /**
     * Checks whether the user's answer is correct.
     *
     * @param choice the index (0–3) of the chosen answer
     * @return true if the choice matches the correct answer, false otherwise
     */
    public boolean checkAnswer(int choice) {
        return answer == choice;
    }
    
    /**
     * Returns the index of the correct answer.
     * 
     * @return correct answer index (0–3)
     */
    public int getAnswer() {
        return answer;
    }
    
    /**
     * Returns the array of possible answer choices.
     * 
     * @return array of answer choice strings
     */
    public String[] getChoices() {
        return choices;
    }

}
