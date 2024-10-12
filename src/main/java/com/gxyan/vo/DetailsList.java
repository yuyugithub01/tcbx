package com.gxyan.vo;

import lombok.Data;

import java.util.Date;

/**
 *  @author liyu
 * @date 2025/1/10
 */
@Data
public class DetailsList {
    private String id;

    private Long orderId;

    private Long customerId;

    private Long carId;

    private String employeeName;

    private Integer carNumber;

    private Date createTime;

    private Date updateTime;

    private String status;
}
