package com.sun.algorithm.entity.util;

/**
 * @author sunkai
 * @since 2021/3/22 2:56 下午
 */
public class PageBean<T> {

    private int pageNum;

    private int pageSize;

    private int totalNum;

    private T data;

    private int startIndex;

    public PageBean(int pageNum, int pageSize){
        if (pageNum < 1){
            pageNum = 1;
        }
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.startIndex = (pageNum-1) * pageSize ;
    }


    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }
}
