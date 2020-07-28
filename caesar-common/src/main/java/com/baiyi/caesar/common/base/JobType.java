package com.baiyi.caesar.common.base;

/**
 * @Author baiyi
 * @Date 2020/7/23 11:12 上午
 * @Version 1.0
 */
public enum JobType {

    IOS("IOS"),
    ANDROID("ANDROID"),
    SPRINGBOOT("SPRINGBOOT"),
    H5("H5")
    ;

    private String type;

    JobType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}