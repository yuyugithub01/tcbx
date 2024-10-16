package com.gxyan.vo;

import lombok.Data;

/**
 *  @author liyu
 * @date 2025/1/10
 */
@Data
public class DetailsQuery {
    private int page = 1;

    private int limit = 5;

    private String id;

    private Long orderId;

    private Long customerId;

    private Long carId;

    private String employeeName;

    private String status;

    private String orderBy;
}
