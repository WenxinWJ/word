package com.wen.word.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.wen.word.dao.WordDao;
import com.wen.word.entity.WordEntity;
import com.wen.word.service.WordService;
import org.springframework.stereotype.Service;


@Service("wordService")
public class WordServiceImpl extends ServiceImpl<WordDao, WordEntity> implements WordService {

}
