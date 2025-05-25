/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.*;

/**
 *
 * @author Chris
 */
public class Account {
    private String username;
    private String password;
    private String[] questionsAnswered;
    private int questionsCorrect;
    private int questionsWrong;
    private int elo;
    
    /**
     * Constructs a new Account with default statistics.
     * 
     * @param username the user's username
     * @param password the user's password
     */
    public Account(String username, String password){ 
        this.username = username;
        this.password = password;
        questionsCorrect = 0;
        questionsWrong = 0;
        elo = 0;
    }
    
    /**
     * Constructs an Account with full data (typically from file).
     * 
     * @param username           the user's username
     * @param password           the user's password
     * @param questionsAnswered  array of question IDs the user has answered
     * @param questionsCorrect   number of correctly answered questions
     * @param questionsWrong     number of incorrectly answered questions
     * @param elo                the user's ELO score
     */
    public Account( 
            String username,
            String password,
            String[] questionsAnswered,
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
    
    /**
     * Increases the user's ELO score.
     * 
     * @param points the number of ELO points to add
     */
    public void addElo(int points){ 
        elo += points;
    }
    
    /**
     * Decreases the user's ELO score without going below zero.
     * 
     * @param points the number of ELO points to remove
     */
    public void removeElo(int points){
        if((elo - points) < 0) {
            elo = 0;
        } else {
            elo += points;
        }
    }
    
    /**
     * Returns the username.
     * 
     * @return the user's username
     */
    public String getUsername(){
        return username;
    }
    
    /**
     * Returns the password.
     * 
     * @return the user's password
     */
    public String getPassword(){
        return password;
    }
    
    /**
     * Returns the number of correct answers.
     * 
     * @return number of correctly answered questions
     */
    public int getQuestionsCorrect(){
        return questionsCorrect;
    }
    
    /**
     * Returns the number of wrong answers.
     * 
     * @return number of incorrectly answered questions
     */
    public int getQuestionsWrong(){
        return questionsWrong;
    }
    
    /**
     * Increase the user's wrong questions;
     */
    public void addQuestionsWrong(){
        questionsWrong++;
    }
    
     /**
     * Increase the user's correct questions;
     */
    public void addQuestionsCorrect(){
        questionsCorrect++;
    }
    
    /**
     * Returns an array of answered question identifiers.
     * 
     * @return array of questions answered
     */
    public String[] getQuestionsAnswered(){
        return questionsAnswered;
    }
    
    
    /**
     * Returns the current ELO score.
     * 
     * @return user's ELO rating
     */
    public int getELO(){
        return elo;
    }
    
    /**
     * Saves the account data to "usersData.txt" and "questionsAnswered.txt".
     * Appends a new line to each file with the user's data.
     */
    public void addToDatabase() {
        // Append to users.txt (no header)
        try {
            FileWriter userFileWriter = new FileWriter("usersData.txt", true);
            PrintWriter userPrintWriter = new PrintWriter(userFileWriter);

            userPrintWriter.println(username + ";" + password + ";" + questionsCorrect + ";" + questionsWrong + ";" + elo);

            userPrintWriter.close(); // Closes both PrintWriter and FileWriter
            System.out.println("Account added to users.txt.");
        } catch (IOException e) {
            System.out.println("Error writing to users.txt: " + e.getMessage());
        }

        // Append to questionsAnswered.txt (just username;)
        try {
            FileWriter qaFileWriter = new FileWriter("questionsAnswered.txt", true);
            PrintWriter qaPrintWriter = new PrintWriter(qaFileWriter);

            qaPrintWriter.println(username + ";");

            qaPrintWriter.close();
            System.out.println("Username added to questionsAnswered.txt.");
        } catch (IOException e) {
            System.out.println("Error writing to questionsAnswered.txt: " + e.getMessage());
        }
    }
    
    /**
     * Returns a string representation of the Account.
     * 
     * @return summary of account including username and ELO
     */
    @Override
    public String toString(){
        return "Username: " + username + "; ELO: " + elo;
    }

}
