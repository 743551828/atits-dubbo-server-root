package cn.edu.ahau.news.manager;

import cn.edu.ahau.news.model.dto.NewsTypesDto;

import java.util.List;

/**
 * @author zhangys
 * @date 2020/4/28
 */
public interface INewsTypesManager {

    /**
     * 根据新闻的id获取新闻的名称
     *
     * @param id 新闻id
     * @return 新闻的名称
     */
    NewsTypesDto getNewsTypeNameById(Long id);

    /**
     * 新增一个新闻的种类
     *
     * @param newsTypesDto 新闻种类
     * @return true/false-保存成功/保存失败
     */
    boolean saveNewsType(NewsTypesDto newsTypesDto);

    /**
     * 获取所有的新闻种类
     *
     * @return List<NewsTypesDto> 所有的新闻种类
     */
    List<NewsTypesDto> findAllNewsTypes();
}
