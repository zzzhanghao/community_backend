package com.example.community.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.community.model.entity.BmsTip;

public interface IBmsTipService extends IService<BmsTip> {
    BmsTip getRandomTip();
}
