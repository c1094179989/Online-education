package com.xuecheng.content.api;

import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dao.QueryParamDto;
import com.xuecheng.content.model.enums.QueryParamTypeEnum;
import com.xuecheng.content.model.po.CourseBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xuecheng.base.model.PageParams;

/**
 * @author cgl
 * @version V1.0
 * @className CourseBaseInfoController
 * @description 通用信息管理接口
 * @date 2023/06/11 10:45
 **/
@Api(value = "通用信息管理接口",tags = "通用信息管理接口")
@RestController
public class CommonBaseInfoController {

    /**
     *  根据查询条件查询列表
     * @param pageParams
     * @param queryParamDto
     * @param <T>
     * @return
     */
    @ApiOperation("通用信息查询接口")
    @PostMapping("/common/list")
    public <T> T queryCommonBaseInfoList(PageParams pageParams, @RequestBody(required = false) QueryParamDto queryParamDto){
        QueryParamTypeEnum type = queryParamDto.getType();
        switch (type){
            case COURSE:
                PageResult<CourseBase> courseBasePageResult = new PageResult<CourseBase>();
                return (T) courseBasePageResult;
            default:
                return (T)PageResult.getDefaultPageResult();
        }
    }

}
