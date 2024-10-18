package com.gxyan.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 *  @author liyu
 * @date 2025/1/7
 */
@Data
public class Details {
    private String id;

    private Long carId;

    private Integer brandId;

    private Integer seriesId;

    private String brandName;

    private String seriesName;

    private String type;

    private String color;

    private BigDecimal salePrice;

    private Integer carNumber;
}
