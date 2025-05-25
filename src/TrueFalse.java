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
    private static final int DEFAULT_ELO_GAIN = 5;
    private static final int DEFAULT_ELO_LOSE = 2;
    
    /**
     * Constructs a TrueFalse question with all necessary parameters.
     *
     * @param question the question text
     * @param tip a helpful hint for the question
     * @param id a unique identifier for the question
     * @param answer the correct answer (true or false)
     */
    public TrueFalse(
            String question, 
            String tip,
            String id, 
            boolean answer
    ){
        super(question, tip, id, DEFAULT_ELO_GAIN, DEFAULT_ELO_LOSE);
        this.answer = answer;
    }
    
    /**
     * Checks if the user's answer is correct.
     *
     * @param choice the user's answer (true or false)
     * @return true if the answer is correct, false otherwise
     */
    public boolean checkAnswer(boolean choice) {
        return answer == choice;
    }
    
    /**
     * Returns the correct answer to the question.
     *
     * @return true if the correct answer is "true", false otherwise
     */
    public boolean getAnswer() {
        return answer;
    }
}
