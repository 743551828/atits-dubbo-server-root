package cn.edu.ahau.web.controller.news;

import cn.edu.ahau.base.response.ResponseData;
import cn.edu.ahau.base.response.ResponseUtil;
import cn.edu.ahau.news.service.INewsService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 新闻 controller
 *
 * @author zhangys
 * @date 2020/4/21
 */
@RestController
@RequestMapping("/news/news")
public class NewsController {

    @Reference
    INewsService iNewsService;

    @GetMapping(value = "/newsName/{id}")
    public ResponseData getNewsNameById(@PathVariable(value = "id") Integer id){
        return ResponseUtil.success(iNewsService.getNewsNameById(id));

    }
}
