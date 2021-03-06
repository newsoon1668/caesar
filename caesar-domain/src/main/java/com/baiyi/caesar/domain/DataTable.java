package com.baiyi.caesar.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;


@ApiModel
@Data
public class DataTable<T> {

    @ApiModelProperty(value = "分页数据")
    private List<T> data;

    @ApiModelProperty(value = "当前页码")
    private int nowPage;

    @ApiModelProperty(value = "总记录数")
    private long totalNum;

    public DataTable(List<T> data, long totalNum) {
        this.data = data;
        this.totalNum = totalNum;
    }
}
