/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Stikb
 */
public class Account {
    
    private String name;
    private boolean dailyQuestionUsed;
    private static int score = 0;
    private int ranking;
    
    public Account(String name){
        this.name = name;
        this.dailyQuestionUsed = false;
        this.ranking = 0;
    }
    
    public Account(String name, int ranking){
        this.name = name;
        this.dailyQuestionUsed = false;
        this.ranking = ranking;
    }
    
    public void setRanking(int ranking){
        this.ranking = ranking;
    }
    
    public void useDaily(){
        dailyQuestionUsed = true;
    }
    
    public String getName(){
        return name;
    }
    public int getRanking(){
        return ranking;
    }
    
    public void addScore(){
        score++;
    }
    
    @Override
    public String toString(){
        return "User: " + name + " Score: " + score + " Ranking: " + ranking;
    }

}
