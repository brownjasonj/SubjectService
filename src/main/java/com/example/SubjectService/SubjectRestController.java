package com.example.SubjectService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jason on 12.07.17.
 */
@RestController
public class SubjectRestController {
    public @Value("${words}") String words;

    @RequestMapping("/")
    public @ResponseBody String getWord() {
        String[] wordArray = words.split(",");
        int i = (int)Math.round(Math.random() * (wordArray.length-1));
        return wordArray[i];
    }
}
