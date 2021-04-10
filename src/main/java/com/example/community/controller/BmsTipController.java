package com.example.community.controller;

import com.example.community.common.api.ApiResult;
import com.example.community.model.entity.BmsTip;
import com.example.community.service.IBmsTipService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/tip")
public class BmsTipController extends BaseController {

    @Resource
    private IBmsTipService bmsTipService;

    @GetMapping("/today")
    public ApiResult<BmsTip> getRandomTip() {
        BmsTip tip = bmsTipService.getRandomTip();
        return ApiResult.success(tip);
    }
}
