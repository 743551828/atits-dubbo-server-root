package cn.edu.ahau.news.service;

/**
 * 用户 服务
 *
 * @author zhangys
 * @date 2020/4/21
 */
public interface INewsService {

    /**
     *  根据资讯的id获取资讯
     *
     * @param id
     * @return
     */
    String getNewsNameById(Integer id);

}
