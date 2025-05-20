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
    private String id;
    private int eloGain;
    private int eloLose;
    
    public Question(String question, String id, int eloGain, int eloLose){
        this.question = question;
        this.id = id;
        this.eloGain = eloGain;
        this.eloLose = eloLose;
    }
    
    public String getQuestion(){
        return question;
    }  
    
    public String getId(){
        return id;
    }  
}
