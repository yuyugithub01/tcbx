package com.gxyan.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 *  @author liyu
 * @date 2025/1/2 
 */
@Getter
@Setter
public class SeriesTree {
    private Integer value;
    private String label;
    private List<SeriesTree> children;
}
