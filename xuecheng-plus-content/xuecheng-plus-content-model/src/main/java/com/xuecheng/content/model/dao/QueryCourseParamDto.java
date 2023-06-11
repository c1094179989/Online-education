package com.xuecheng.content.model.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author cgl
 * @version V1.0
 * @className QueryCourseParamsDto
 * @description 课程信息查询条件
 * @date 2023/06/10 18:00
 **/
@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class QueryCourseParamDto extends QueryParamsDto {
    /**
     * 审核状态
     */
    private String auditStatus;
    /**
     * 课程名称
     */
    private String courseName;
    /**
     * 发布状态
     */
    private String publishStatus;

}
