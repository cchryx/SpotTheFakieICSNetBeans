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
    
    public Account(String username, String password){
        this.username = username;
        this.password = password;
        questionsCorrect = 0;
        questionsWrong = 0;
        elo = 0;
    }
    
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
    
    @Override
    public String toString(){
        return "Username: " + username + "; ELO: " + elo;
    }

}
