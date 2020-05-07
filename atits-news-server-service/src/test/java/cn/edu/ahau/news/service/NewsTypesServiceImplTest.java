package cn.edu.ahau.news.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsTypesServiceImplTest {

    @Autowired
    private NewsTypesServiceImpl newsTypesService;

    @Test
    public void getNewsTypeNameById() {
        System.out.println(newsTypesService.getNewsTypeNameById(1));
    }

    @Test
    public void saveNewsType() {
    }

    @Test
    public void findAllNewsTypes() {
    }
}
