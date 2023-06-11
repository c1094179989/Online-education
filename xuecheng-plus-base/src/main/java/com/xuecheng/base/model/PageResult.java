package com.xuecheng.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author cgl
 * @version V1.0
 * @className PageResult
 * @description 分页查询返回结果
 * @date 2023/06/10 18:14
 **/
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PageResult<T> implements Serializable{
    /**
     * 数据列表
     */
    private List<T> items;

    /**
     * 总记录数
     */
    private Long counts;

    /**
     * 当前页码
     */
    private Long page;

    /**
     * 每页记录数
     */
    private Long pageSize;

    public static PageResult getDefaultPageResult(){
        return  new PageResult(new ArrayList(),0L,1L,0L);
    }
}
