package org.launchcode.java.demos.lsn1datatypes;

public class HelloMethods {

    public static void main(String[] args) {
        String message = Message.getMessage("ru");
        String message2 = Message.getMessage("sp");
        String message3 = Message.getMessage("fr");
        String message4 = Message.getMessage("fu");

        System.out.println(message);
        System.out.println(message2);
        System.out.println(message3);
        System.out.println(message4);

    }

}
