package org.example;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CommandPatternExample {

    public static void main(String[] args){
        // Create receiver
        Light light = new Light();

        //Create concrete commands and associate them with the receivers

        Command turnOnCommand = new TurnOnLightCommand(light);
        Command turnOffCommand = new TurnOffLightCommand(light);


        // Create invoker
        RemoteControl remote = new RemoteControl();


        // Configure the invoker with commands
        remote.setCommand(turnOnCommand);

        // Press the button to execute the command
        remote.pressButton();

        // Change the command and press the button again
        remote.setCommand(turnOffCommand);
        remote.pressButton();
    }
}