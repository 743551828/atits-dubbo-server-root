package cn.edu.ahau.news.manager.impl;

import cn.edu.ahau.news.dao.news.NewsTypesRepository;
import cn.edu.ahau.news.manager.INewsTypesManager;
import cn.edu.ahau.news.model.dto.NewsTypesDto;
import cn.edu.ahau.news.model.entity.news.NewsTypes;
import cn.edu.ahau.news.utils.dozer.IGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zhangys
 * @date 2020/4/28
 */
@Component
public class NewsTypesManagerImpl implements INewsTypesManager {

    @Autowired
    private NewsTypesRepository newsTypesRepository;

    @Autowired
    private IGenerator dozer;

    /**
     * 根据新闻的id获取新闻的名称
     *
     * @param id 新闻id
     * @return 新闻的名称
     */
    @Override
    public NewsTypesDto getNewsTypeNameById(Long id) {
        NewsTypes newsTypes = newsTypesRepository.findOne(id);
        return dozer.convert(newsTypes,NewsTypesDto.class);
    }

    /**
     * 新增一个新闻的种类
     *
     * @param newsTypesDto 新闻种类
     * @return true/false-保存成功/保存失败
     */
    @Override
    public boolean saveNewsType(NewsTypesDto newsTypesDto) {
        NewsTypes newsTypes = dozer.convert(newsTypesDto,NewsTypes.class);
        newsTypesRepository.save(newsTypes);
        return true;
    }

    /**
     * 获取所有的新闻种类
     *
     * @return List<NewsTypesDto> 所有的新闻种类
     */
    @Override
    public List<NewsTypesDto> findAllNewsTypes() {
        List<NewsTypes> newsTypesList = newsTypesRepository.findAll();
        return dozer.convert(newsTypesList,NewsTypesDto.class);
    }
}
