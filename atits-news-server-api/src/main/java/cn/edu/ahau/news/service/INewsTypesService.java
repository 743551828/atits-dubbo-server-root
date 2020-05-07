package cn.edu.ahau.news.service;

import cn.edu.ahau.news.model.query.request.NewsTypesSaveRequest;
import cn.edu.ahau.news.model.vo.NewsTypesVo;

import java.util.List;

/**
 * 新闻种类 服务
 *
 * @author zhangys
 * @date 2020/4/21
 */
public interface INewsTypesService {

    /**
     *  根据资讯的id获取资讯
     *
     * @param id
     * @return
     */
    NewsTypesVo getNewsTypeNameById(Long id);

    /**
     * 新增一个新闻的种类
     *
     * @param newsTypesSaveRequest 新闻种类
     * @return true/false-保存成功/保存失败
     */
    boolean saveNewsType(NewsTypesSaveRequest newsTypesSaveRequest);

    /**
     * 获取所有的新闻种类
     *
     * @return List<NewsTypesVo> 所有的新闻种类
     */
    List<NewsTypesVo> findAllNewsTypes();


}
