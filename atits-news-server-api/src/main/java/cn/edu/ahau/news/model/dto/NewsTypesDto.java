package cn.edu.ahau.news.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;

import java.util.Date;

/**
 * @author zhangys
 * @date 2020/4/28
 */
@ApiModel("新闻种类Dto")
public class NewsTypesDto {

    private Long id;

    @ApiParam("新闻种类的名字")
    private String name;

    @ApiParam("新闻种类的描述")
    private String description;

    @ApiParam("新闻种类添加的日期")
    private String date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
