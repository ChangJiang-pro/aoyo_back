package com.buba.aoyo.service;

import com.buba.aoyo.pojo.AoyoCustom;
import com.buba.aoyo.pojo.AuthTokenModel;
import com.buba.aoyo.response.BaseResponse;

public interface UserService {
    AuthTokenModel authUserAndCreateToken(String mobile, String code) throws Exception;

    BaseResponse validateToken(String accessToken);

    AoyoCustom selCustom(String mobile,String code);
}
