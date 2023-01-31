package ua.ithillel.lesson3.game;

import java.util.Scanner;

public class Word {
    private final String name;
    private String openWord = "##########";

    public Word(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String getOpenWord() {
        return openWord;
    }

    private void setCharOpenWord(char ch, int index){
        char[] letters = openWord.toCharArray();
        letters[index] = ch;
        openWord = String.copyValueOf(letters);
    }
    private boolean compare(String input){
        for(int i = 0; i < name.length() && i < input.length(); i++){
            if(name.charAt(i) == input.charAt(i)){
                setCharOpenWord(name.charAt(i), i);
            }
        }
        if(openWord.startsWith(name)){
            System.out.println("You won!");
            return false;
        }
        else
        {
            System.out.println("Try once more! Your word is\n" + openWord);
            return true;
        }
    }

    public void start(){
        String input;
        do{
            System.out.println("Try to guess the word:");
            input = new Scanner(System.in).nextLine();
        }while (compare(input));
    }
}
