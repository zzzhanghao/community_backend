package com.example.community.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.community.model.dto.RegisterDTO;
import com.example.community.model.entity.UmsUser;
import com.example.community.model.dto.LoginDTO;


public interface IUmsUserService extends IService<UmsUser> {
    /**
     * 注册功能
     *
     * @param dto
     * @return 注册对象
     */
    UmsUser executeRegister(RegisterDTO dto);


    /**
     * 获取用户信息
     *
     * @param username
     * @return dbUser
     */
    UmsUser getUserByUsername(String username);
    /**
     * 用户登录
     *
     * @param dto
     * @return 生成的JWT的token
     */
    String executeLogin(LoginDTO dto);
}
