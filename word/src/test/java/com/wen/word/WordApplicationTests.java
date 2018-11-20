package com.wen.word;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.wen.word.entity.WordEntity;
import com.wen.word.service.WordService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WordApplicationTests {
    @Autowired
    private WordService wordService;

    @Test
    public void contextLoads() {
    }
    @Test
    public void test(){
        List<WordEntity>  wordEntities = wordService.selectList(new EntityWrapper<>());
        for (WordEntity word: wordEntities
             ) {
            System.out.println(word.getName());

        }
    }

}
