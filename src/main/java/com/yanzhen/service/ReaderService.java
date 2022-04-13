package com.yanzhen.service;

import com.github.pagehelper.PageInfo;
import com.yanzhen.po.ReaderCard;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReaderService {

    /**
     * 查询读者信息 分页
     */
    PageInfo<ReaderCard> queryReaderAll(ReaderCard readerCard,int page,int limit);

    /**
     * 添加
     */
    void addReaderInfoSubmit(ReaderCard readerCard);

    /**
     * 查询读者信息根据id
     */
    ReaderCard queryReaderById(Integer id);

    /**
     * 修改
     */
    void updateReaderInfoSubmit(ReaderCard readerCard);

    /**
     * 删除
     */
    void deleteReaderByIds(List<String> ids);

    ReaderCard queryUserInfoByNameAndPassword( String username, String password);
}
