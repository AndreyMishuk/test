
package net.service.testjson.json;

import com.google.gson.Gson;
import java.util.Date;
import net.service.testjson.date.FormatDate;
import net.service.testjson.entity.Pojo;

public class CreateJSON {
    
    public static void main(String[] args) {
        
        Pojo pojo = new Pojo();
        pojo.setDate(new FormatDate(new Date()).getFormatDate());
        pojo.setExercise(13);
        pojo.setType(1);
        pojo.setResult("7");
        pojo.setComment("Was cool");
        pojo.random = 123;
        
        Gson gson = new Gson();
        
        String json = gson.toJson(pojo);
        
        Pojo read = gson.fromJson(json, Pojo.class);
        
        System.out.println(read.getDate() + read.getResult() +  read.getComment());
    }
    
}
