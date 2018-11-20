package com.wen.word.controller;

import com.wen.word.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class WordController {
    @Autowired
    private WordService wordService;

    @RequestMapping("")
    public void test(){
    }
}
