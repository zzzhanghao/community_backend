package com.example.community.controller;
// 公告板接口实现

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.community.model.entity.BmsBillboard;
import com.example.community.common.api.ApiResult;
import com.example.community.service.IBmsBillboardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/billboard")
public class BmsBillboardController extends BaseController{
    @Resource
    private IBmsBillboardService bmsBillboardService;
    @GetMapping("/show")
    public ApiResult<BmsBillboard> getNotices(){

        List<BmsBillboard> list = bmsBillboardService.list(new
                LambdaQueryWrapper<BmsBillboard>().eq(BmsBillboard::isShow,true));
        return ApiResult.success(list.get(list.size()- 1));
    }


}
