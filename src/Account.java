/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class Account {
    private String username;
    private String password;
    private ArrayList<Question> questionsAnswered;
    private int questionsCorrect;
    private int questionsWrong;
    private int elo;
    
    public Account(String username, String password){
        this.username = username;
        this.password = password;
        elo = 0;
    }
    
    public Account(
            String username, 
            String password, 
            ArrayList<Question> questionsAnswered,
            int questionsCorrect,
            int questionsWrong,
            int elo
    ){
        this.username = username;
        this.password = password;
        this.questionsAnswered = questionsAnswered;
        this.questionsCorrect = questionsCorrect;
        this.questionsWrong = questionsWrong;
        this.elo = elo;
    }
    
    public void addElo(int points){
        elo += points;
    }
    
    public void removeElo(int points){
        if((elo - points) < 0) {
            elo = 0;
        } else {
            elo += points;
        }
    }
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public int getQuestionsCorrect(){
        return questionsCorrect;
    }
    
    public int getQuestionsWrong(){
        return questionsWrong;
    }
    
    @Override
    public String toString(){
        return "Username: " + username + "; ELO: " + elo;
    }

}
