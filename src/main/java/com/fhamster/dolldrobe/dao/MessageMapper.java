package com.fhamster.dolldrobe.dao;

import com.fhamster.dolldrobe.model.Message;
import com.fhamster.dolldrobe.model.MessageExample;
import com.fhamster.dolldrobe.model.MessageKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageMapper {
    int countByExample(MessageExample example);

    int deleteByExample(MessageExample example);

    int deleteByPrimaryKey(MessageKey key);

    int insert(Message record);

    int insertSelective(Message record);

    List<Message> selectByExample(MessageExample example);

    Message selectByPrimaryKey(MessageKey key);

    int updateByExampleSelective(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByExample(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}