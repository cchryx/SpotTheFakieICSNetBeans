/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Chris
 */

public class Question {
    private String question;
    private String tip;
    private String id;
    private int eloGain;
    private int eloLose;
    
    /**
     * Constructs a Question with the provided information.
     * 
     * @param question the text of the question
     * @param tip a helpful tip or hint
     * @param id a unique ID for the question
     * @param eloGain ELO points gained if answered correctly
     * @param eloLose ELO points lost if answered incorrectly
     */
    public Question(String question, String tip, String id, int eloGain, int eloLose){
        this.question = question;
        this.tip = tip;
        this.id = id;
        this.eloGain = eloGain;
        this.eloLose = eloLose;
    }
    
    /**
     * Returns the question text.
     * 
     * @return the question string
     */
    public String getQuestion(){
        return question;
    }  
    
    /**
     * Returns the question tip.
     * 
     * @return the question tip string
     */
    public String getTip(){
        return tip;
    }  
    
    /**
     * Returns the unique identifier of the question.
     * 
     * @return question ID
     */
    public String getId(){
        return id;
    }  
}
