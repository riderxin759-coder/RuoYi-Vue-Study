package com.ruoyi.test.service.impl;

import com.ruoyi.test.entity.UserFeedback;
import com.ruoyi.test.mapper.UserFeedbackMapper;
import com.ruoyi.test.service.UserFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserFeedbackServiceImpl implements UserFeedbackService {
   @Autowired
   UserFeedbackMapper userFeedbackMapper;


    @Override
    public int insertUserFeedback(UserFeedback feedback) {
        return userFeedbackMapper.insertUserFeedback(feedback);
    }

    @Override
    public List<UserFeedback> selectUserFeedbackList(UserFeedback query) {
        return userFeedbackMapper.selectUserFeedbackList(query) ;
    }
}

