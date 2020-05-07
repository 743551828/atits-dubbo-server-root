package cn.edu.ahau.news.service;

import cn.edu.ahau.base.utils.DateUtil;
import cn.edu.ahau.news.manager.INewsTypesManager;
import cn.edu.ahau.news.model.dto.NewsTypesDto;
import cn.edu.ahau.news.model.query.request.NewsTypesSaveRequest;
import cn.edu.ahau.news.model.vo.NewsTypesVo;
import cn.edu.ahau.news.utils.dozer.IGenerator;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 新闻 服务
 *
 * @author zhangys
 * @date 2020/4/21
 */
@Service
public class NewsTypesServiceImpl implements INewsTypesService{

    @Autowired
    private IGenerator dozer;

    @Autowired
    private INewsTypesManager newsTypesManager;

    /**
     * 根据新闻的id获取新闻的名称
     * 
     * @param id 新闻id
     * @return 新闻的名称
     */    
    @Override
    public NewsTypesVo getNewsTypeNameById(Long id) {
        NewsTypesDto newsTypesDto = newsTypesManager.getNewsTypeNameById(id);
        return dozer.convert(newsTypesDto,NewsTypesVo.class);
    }

    /**
     * 新增一个新闻的种类
     *
     * @param newsTypesSaveRequest 新闻种类
     * @return true/false-保存成功/保存失败
     */
    @Override
    public boolean saveNewsType(NewsTypesSaveRequest newsTypesSaveRequest) {
        NewsTypesDto newsTypesDto = dozer.convert(newsTypesSaveRequest,NewsTypesDto.class);
        newsTypesDto.setDate(DateUtil.getStringForNowYMDHMS());
        newsTypesManager.saveNewsType(newsTypesDto);
        return true;
    }

    /**
     * 获取所有的新闻种类
     *
     * @return List<NewsTypesVo> 所有的新闻种类
     */
    @Override
    public List<NewsTypesVo> findAllNewsTypes() {
        List<NewsTypesDto> newsTypesDtoList = newsTypesManager.findAllNewsTypes();
        return dozer.convert(newsTypesDtoList,NewsTypesVo.class);
    }
}
