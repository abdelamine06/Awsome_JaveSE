package com.packageTest;

import java.util.HashMap;
import java.util.Map;

public class Maping {
    public static void main(String[] args){
        Map<String, String>  languages = new HashMap<>();
        if(languages.containsKey("java")){
            System.out.println("java is already exist");
        }else{
            languages.put("java", "A compiled high level, object oriented");
            System.out.println("java entry is created successufly");
        }

        languages.put("python", "interepeted, oriented object, high level");
        languages.put("algo", "algorthmic language");
        languages.put("Basic", "Beginger all purposes symbolic");
        //System.out.println(languages.get("java"));
        //languages.put("java", "Value is overiden !");
        //System.out.println(languages.get("java"));

        if(languages.containsKey("java")){
            System.out.println("java is already in the map");
        }else{
            System.out.println("");
        }

        languages.remove("java");
        languages.replace("algo", "algorthmic language", "new algorthmic language");
        System.out.println("================================================");
        for (String key : languages.keySet()){
            System.out.printf(key + ": " + languages.get(key)+ "\n");
        }
    }
}
