package com.ruoyi.test.service;

import com.ruoyi.business.domain.UserQuestion;
import com.ruoyi.test.entity.UserFeedback;

import java.util.List;

public interface UserFeedbackService {
    int insertUserFeedback(UserFeedback feedback);
    List<UserFeedback> selectUserFeedbackList(UserFeedback query);
}
