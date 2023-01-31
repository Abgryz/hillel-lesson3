package ua.ithillel.lesson3.game;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Word word = new Word(words[new Random().nextInt(24)]);
        word.start();
    }
}
