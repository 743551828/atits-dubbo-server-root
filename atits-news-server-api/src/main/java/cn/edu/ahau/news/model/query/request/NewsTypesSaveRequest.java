package cn.edu.ahau.news.model.query.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;


import java.io.Serializable;

/**
 * @author zhangys
 * @date 2020/4/28
 */
@ApiModel("新闻种类新增Request")
public class NewsTypesSaveRequest implements Serializable {

    @ApiParam("新闻种类的名字")
    private String name;

    @ApiParam("新闻种类的描述")
    private String description;

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
}
