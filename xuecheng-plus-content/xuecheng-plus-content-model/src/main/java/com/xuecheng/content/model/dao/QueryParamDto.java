package com.xuecheng.content.model.dao;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.xuecheng.content.model.abstracts.AbstractQueryRequestParam;
import com.xuecheng.content.model.enums.QueryParamTypeEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @author cgl
 * @version V1.0
 * @className QueryCourseParamsDto
 * @description 查询参数
 * @date 2023/06/10 18:00
 **/
@Data
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
// 作用于类/接口/属性，被用来开启多态类型处理
@JsonTypeInfo(
        // use:必选，使用哪一种类型识别码
        use = JsonTypeInfo.Id.NAME, // 使用指定名称作为识别码
        // 可选，指定识别码是如何被包含进去的
        // 可选，指定识别码的属性名称
        include = JsonTypeInfo.As.EXTERNAL_PROPERTY,
        property = "type",
        visible = true,
        defaultImpl = QueryParamDto.class
)
public class QueryParamDto extends AbstractQueryRequestParam {
    /**
     * 查询类型
     */
    @ApiModelProperty("查询类型——根据类型匹配不同查询条件")
    @JsonProperty("type")
    private QueryParamTypeEnum type;
}
