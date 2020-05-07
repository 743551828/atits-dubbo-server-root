package cn.edu.ahau.web.controller.news;

import cn.edu.ahau.base.response.ResponseData;
import cn.edu.ahau.base.response.ResponseUtil;
import cn.edu.ahau.news.model.query.request.NewsTypesSaveRequest;
import cn.edu.ahau.news.model.vo.NewsTypesVo;
import cn.edu.ahau.news.service.INewsTypesService;
import com.alibaba.dubbo.config.annotation.Reference;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 新闻 controller
 *
 * @author zhangys
 * @date 2020/4/21
 */
@Api(tags = {"新闻种类"})
@RestController
@RequestMapping("/news/newsTypes")
public class NewsTypesController {

    @Reference
    INewsTypesService newsTypesService;

    @GetMapping(value = "/newsTypeName/{id}")
    public ResponseData getNewsNameById(@PathVariable(value = "id") Long id){
        NewsTypesVo newsTypesVo = newsTypesService.getNewsTypeNameById(id);
        return ResponseUtil.success(newsTypesVo);
    }

    @ApiOperation("新增一个新闻的种类")
    @PostMapping("/v1/saveNewsType")
    public ResponseData saveNewsType(NewsTypesSaveRequest newsTypesSaveRequest) {
        newsTypesService.saveNewsType(newsTypesSaveRequest);
        return ResponseUtil.success(true);
    }

    @ApiOperation("获取所有的新闻种类")
    @GetMapping("/v1/findAllNewsTypes")
    public ResponseData findAllNewsTypes(){
        List<NewsTypesVo> newsTypesVoList = newsTypesService.findAllNewsTypes();
        return ResponseUtil.success(newsTypesVoList);
    }

}
