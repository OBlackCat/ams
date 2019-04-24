package com.moon.common.tools.page;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.util.Collections;
import java.util.List;

/**
 * @No.:
 * @auther: Mr.Xu
 * @date: 2019-04-23 22:09
 * @param:
 * @return: ApiResult
 * @description: 分页查询数据返回体
 */
@Data
public class PageResult<T> {

    /** 当前页 */
    private int currentPage;

    /** 总数量 */
    private long totalCount;

    /** 数据集合 */
    private List<T> dataList;

    /**
     * 双重校验锁式单例
     */
    private volatile static PageResult PAGE_RESULT = null;

    private PageResult() {};

    public static PageResult getInstance() {
        if (PAGE_RESULT == null) {
            synchronized (PageResult.class) {
                if (PAGE_RESULT == null) {
                    PAGE_RESULT = new PageResult();
                }
            }
        }
        return PAGE_RESULT;
    }

    public static PageResult getPageResult(Page page) {
        PageResult result = getInstance();
        result.setCurrentPage(page.getPageable().getPageNumber());
        result.setTotalCount(page.getTotalElements());
        result.setDataList(page.isEmpty() ? Collections.EMPTY_LIST : page.getContent());
        return result;
    }
}
