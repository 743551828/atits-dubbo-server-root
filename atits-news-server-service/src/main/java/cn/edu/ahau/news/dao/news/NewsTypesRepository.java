package cn.edu.ahau.news.dao.news;

import cn.edu.ahau.news.model.entity.news.NewsTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author zhangys
 * @date 2020/4/29
 */
public interface NewsTypesRepository extends JpaRepository<NewsTypes,Long>, JpaSpecificationExecutor<NewsTypes> {




}
