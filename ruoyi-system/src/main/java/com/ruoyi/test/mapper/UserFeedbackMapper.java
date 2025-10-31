package com.ruoyi.test.mapper;
import com.ruoyi.test.entity.UserFeedback;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserFeedbackMapper  {
    int insertUserFeedback(UserFeedback userFeedback);
    List<UserFeedback> selectUserFeedbackList(UserFeedback query);
}
