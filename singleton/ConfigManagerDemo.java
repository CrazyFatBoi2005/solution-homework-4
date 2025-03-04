package solutionhw4.singleton;
public class ConfigManagerDemo {
    public static void main(String[] args) {
        //initialize configManager and use all public methods
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        System.out.println("Max Players: " + configManager.getValue("maxPlayers"));
        configManager.printConfig();
    }

}
