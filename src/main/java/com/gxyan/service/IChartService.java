package com.gxyan.service;

import com.gxyan.common.ServerResponse;

import java.util.Date;

/**
 *  @author liyu
 * @date 2025/1/11
 */
public interface IChartService {

    ServerResponse getEmpChart(String date);

    ServerResponse getIndexChart();

    ServerResponse getSaleNum();

    ServerResponse getSalesChart(String start, String end);

    ServerResponse getIndexSales(Integer id);

    ServerResponse getEmpSalesChart(Integer id, String date);
}
