package com.gxyan.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 库存表单
 *  @author liyu
 * @date 2025/1/6 
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StoreList {
    private Long id;

    private String brandName;

    private String seriesName;

    private Integer brandId;

    private Integer seriesId;

    private String type;

    private String color;

    private BigDecimal price;

    private BigDecimal salePrice;

    private Integer repertory;

    private Date createTime;

    private String status;
}
