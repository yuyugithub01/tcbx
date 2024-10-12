package com.gxyan.vo;

import lombok.Data;

/**
 *  @author liyu
 * @date 2025/1/7
 */
@Data
public class OrderQuery {
    private int page = 1;

    private int limit = 5;

    private Long orderId;

    private String customerName;

    private String employeeName;

    private String status;

    private String orderBy;
}
