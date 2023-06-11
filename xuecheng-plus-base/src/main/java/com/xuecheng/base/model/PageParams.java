package com.xuecheng.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @author cgl
 * @version V1.0
 * @className PageParams
 * @description 分页查询分页参数
 * @date 2023/06/10 17:51
 **/
@Data
@AllArgsConstructor
@ToString
public class PageParams {
    /**
     * 当前页码
     */
    private Long pageNo = 1L;
    /**
     * 每页显示记录数
     */
    private Long pageSize = 30L;
}
