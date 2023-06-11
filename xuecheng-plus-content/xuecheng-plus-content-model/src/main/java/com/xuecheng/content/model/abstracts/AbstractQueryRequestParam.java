package com.xuecheng.content.model.abstracts;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.xuecheng.content.model.dao.QueryCourseParamDto;

/**
 * @author cgl
 * @version V1.0
 * @className AbstractQueryRequestParam
 * @description 根据查询类型构造查询条件抽象类
 * @date 2023/06/11 12:16
 **/
@JsonSubTypes({
        // 枚举了多态类型（value对应子类）类型的标识符值（name对应参数type的值对应的实体接受类
        @JsonSubTypes.Type(value = QueryCourseParamDto.class, name = "COURSE"),
        @JsonSubTypes.Type(value = QueryCourseParamDto.class, name = "STUDENT")
})
public abstract class AbstractQueryRequestParam {
}