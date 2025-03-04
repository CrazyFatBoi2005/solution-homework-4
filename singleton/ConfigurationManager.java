package solutionhw4;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private Map<String, String> configData;

    private ConfigurationManager(){
        configData = new HashMap<>();
        loadConfigData();
    }

    private void loadConfigData(){
        configData.put("maxPlayers", "100");
        configData.put("defaultLanguage", "ru");
        configData.put("gameDifficulty", "medium");
    }

    public static ConfigurationManager getInstance(){
        if(instance == null){
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getValue(String key){
        return configData.getOrDefault(key, "Not found");
    }

    public void printConfig(){
        System.out.println("Config Data:");
        configData.forEach((key, value) -> System.out.printf("%s: %s\n", key, value));
    }
}
