package com.ruoyi.web.controller.test;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.test.entity.UserFeedback;
import com.ruoyi.test.service.UserFeedbackService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("用户问题")
@RestController
@RequestMapping("/user/feedback")
public class UserFeedbackController extends BaseController {
    @Autowired
    private UserFeedbackService userFeedbackService;


    @ApiOperation("用户反馈")
    @Log(title = "用户反馈", businessType = BusinessType.INSERT)
    @PostMapping
public AjaxResult add(@RequestBody UserFeedback q) {
    return toAjax(userFeedbackService.insertUserFeedback(q));
}

    @ApiOperation("反馈信息")
    @GetMapping("/list")
   public TableDataInfo list(UserFeedback query) {
        startPage();
        List<UserFeedback> list = userFeedbackService.selectUserFeedbackList(query);
        return getDataTable(list);
    }
}
