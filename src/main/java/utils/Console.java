/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 * this is a simple quality of life upgrade for the active console logger
 * it is suggested to name the consoleUser after the class in which the object was initialized
 * @author maxhaggkvist
 */
public class Console {

    String consoleUser;

    public Console() {
        this.consoleUser = "";
    }

    public Console(String name) {
        this.consoleUser = "";
        this.consoleUser = name;
    }

    public void log(String message) {
        if (consoleUser.isEmpty()) {
            System.out.println(message);
        } else {
            System.out.println(this.consoleUser + ": " + message);
        }
    }

}
