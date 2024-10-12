package com.gxyan.vo;

import lombok.Data;

/**
 *  @author liyu
 * @date 2025/1/6
 */
@Data
public class EmployeeQuery {
    private int page = 1;

    private int limit = 5;

    private Long id;

    private String name;

    private String phone;

    private String idCard;

    private String status;

    private String orderBy;
}
