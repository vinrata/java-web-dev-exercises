package org.launchcode.java.studios.coutingcharacters;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args){
        HashMap<Character, Integer> hashes = new HashMap<>();
        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        Integer charCounter = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("enter size: ");
        myString = input.nextLine();
        String[] stringArray= myString.split("\\W+");
        String result = new String();
        for(int i = 0; i < stringArray.length;i++){
            result = result+ stringArray[i];
        }
        result = result.toUpperCase(Locale.ROOT);

        char[] characterInString = result.toCharArray();

        for (int i = 0; i < characterInString.length; i++) {

            if(!hashes.containsKey(characterInString[i])){
                System.out.println("new entry!");
                hashes.put(characterInString[i], charCounter);
            } else {
                hashes.put(characterInString[i], hashes.get(characterInString[i]) + 1);
            }
            System.out.println("...added " + characterInString[i]);
        }

        System.out.println(hashes);
    }
}
