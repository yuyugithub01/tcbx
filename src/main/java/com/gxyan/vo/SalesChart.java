package com.gxyan.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 *  @author liyu
 * @date 2025/1/14
 */
@Data
public class SalesChart {
    private String date;

    private BigDecimal income;

    private BigDecimal expenditure;

    private BigDecimal profit;
}
