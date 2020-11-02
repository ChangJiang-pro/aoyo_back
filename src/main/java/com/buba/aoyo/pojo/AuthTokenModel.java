package com.buba.aoyo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthTokenModel {

    private String accessToken;//token

    private Long accessExpire;//过期时间
}