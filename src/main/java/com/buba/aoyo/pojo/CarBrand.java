package com.buba.aoyo.pojo;

import lombok.Data;

@Data
public class CarBrand {
    private Integer carBrandId;
    private String carBrandInitials;
    private String carBrandName;
    private String carBrandUrl;
    private Integer deleteFlag;
    private Integer carBrandParentId;
    private String carBrandPyFirstLetter;
}
