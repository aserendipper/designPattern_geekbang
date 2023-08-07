package com.part06.day47.code.one;

import com.part06.day47.code.one.SearchWord;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author aserendipper
 * @date 2023/8/7
 * @desc
 */
public class Demo1 {
    private ConcurrentHashMap<String, SearchWord> currentKeywords = new ConcurrentHashMap<>();
    
    public void refresh() {
        HashMap<String, SearchWord> newKeywords = new HashMap<>();
        List<SearchWord> toBeUpdatedSearchWords = getSearchWords();
        for (SearchWord searchWord : toBeUpdatedSearchWords) {
            newKeywords.put(searchWord.getKeyword(), searchWord);
        }
        currentKeywords = new ConcurrentHashMap<>(newKeywords);
    }
    
    private List<SearchWord> getSearchWords() {
        // 从数据库中取出所有的数据
        return null;
    }
}
