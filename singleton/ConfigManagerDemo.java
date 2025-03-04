package solutionhw4;
public class ConfigManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        System.out.println("Max Players: " + configManager.getValue("maxPlayers"));
        configManager.printConfig();
    }

}
