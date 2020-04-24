package cn.edu.ahau.news.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * 新闻 服务
 *
 * @author zhangys
 * @date 2020/4/21
 */
@Service
public class NewsServiceImpl implements INewsService{


    /**
     * 根据新闻的id获取新闻的名称
     * 
     * @param id 新闻id
     * @return 新闻的名称
     */    
    @Override
    public String getNewsNameById(Integer id) {
        return "成功："+ id;
    }
}
