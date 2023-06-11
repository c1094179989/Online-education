package com.xuecheng.content.api;

import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dao.QueryParamsDto;
import com.xuecheng.content.model.enums.QueryParamTypeEnum;
import com.xuecheng.content.model.po.CourseBase;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xuecheng.base.model.PageParams;

/**
 * @author cgl
 * @version V1.0
 * @className CourseBaseInfoController
 * @description 通用信息查询接口
 * @date 2023/06/11 10:45
 **/
@RestController
public class CommonBaseInfoController {

    /**
     * 根据查询条件查询列表
     * @param pageParams
     * @param queryParamsDto
     * @param <T>
     * @return
     */
    @RequestMapping("/common/list")
    public <T> T queryCommonBaseInfoList(PageParams pageParams, @RequestBody(required = false)QueryParamsDto queryParamsDto){
        QueryParamTypeEnum type = queryParamsDto.getType();
        switch (type){
            case COURSE:
                PageResult<CourseBase> courseBasePageResult = new PageResult<CourseBase>();
                return (T) courseBasePageResult;
            default:
                return (T)PageResult.getDefaultPageResult();
        }
    }

}
