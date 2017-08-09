package com.demo.springbootdemo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springbootdemo.dao.IScoreDao;
import com.demo.springbootdemo.entity.Score;

@RestController
@RequestMapping("/score")
public class ScoreController {
	  private static final Logger logger = LoggerFactory.getLogger(ScoreController.class);

	    @Autowired
	    private IScoreDao scoreService;

	    @RequestMapping("/scoreList")
	    public List<Score> getScoreList(){
	        logger.info("从数据库读取Score集合");
	        // 测试更新数据库
	        logger.info("更新的行数：" + scoreService.updateScoreById(88.8f, 2));
	        scoreService.delete(23);//如果该id不存在 会报错

	        return scoreService.getList();
	    }
}
