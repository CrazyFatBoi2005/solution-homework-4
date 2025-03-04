package solutionhw4.singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    // single instance
    private static ConfigurationManager instance;

    // configData contains all config information
    private Map<String, String> configData;

    // private constructor for single instance
    private ConfigurationManager(){
        configData = new HashMap<>();
        loadConfigData();
    }

    // put information in configData
    private void loadConfigData(){
        configData.put("maxPlayers", "100");
        configData.put("defaultLanguage", "ru");
        configData.put("gameDifficulty", "medium");
    }

    // function that returns instance and create it if no instance created before
    public static ConfigurationManager getInstance(){
        if(instance == null){
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // returns value of configData["key"]
    public String getValue(String key){
        return configData.getOrDefault(key, "Not found");
    }

    // print all configData
    public void printConfig(){
        System.out.println("Config Data:");
        configData.forEach((key, value) -> System.out.printf("%s: %s\n", key, value));
    }
}
