package com.baiyi.caesar.bo.jenkins;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @Author baiyi
 * @Date 2020/8/8 9:40 上午
 * @Version 1.0
 */
@Data
@Builder
public class CiJobBuildArtifactBO {

    private Integer id;
    private Integer buildId;
    private Integer ciJobId;
    private String jobName;
    private String artifactDisplayPath;
    private String artifactFileName;
    private String artifactRelativePath;
    private Long artifactSize;
    private String storagePath;
    private Date updateTime;
    private Date createTime;

}
