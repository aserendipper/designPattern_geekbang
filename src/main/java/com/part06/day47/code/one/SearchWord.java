package com.part06.day47.code.one;

/**
 * @author aserendipper
 * @date 2023/8/7
 * @desc
 */
public class SearchWord {
    
    private String keyword;
    private long lastUpdateTime;
    private long count;
    
    public SearchWord(String keyword, long lastUpdateTime, long count) {
        this.keyword = keyword;
        this.lastUpdateTime = lastUpdateTime;
        this.count = count;
    }
    
    public String getKeyword() {
        return keyword;
    }
    
    public long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public long getCount() {
        return count;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setLastUpdateTime(long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
