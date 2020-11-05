package com.buba.aoyo.mapper;

import com.buba.aoyo.pojo.AoyoCustom;
import com.buba.aoyo.pojo.SysUser;
import org.apache.ibatis.annotations.Param;

public interface CustomMapper {
    AoyoCustom selCustom(@Param("mobile") String mobile);

    String authNickName(@Param("nickName") String nickName);

    int wxLoginRegisterCustom(@Param("custom")AoyoCustom custom);

    int wxLoginUpdateCustom(@Param("custom") AoyoCustom aoyoCustom);
}
