package com.gxyan.service;

import com.gxyan.common.ServerResponse;
import com.gxyan.pojo.Car;
import com.gxyan.vo.StoreQuery;

/**
 *  @author liyu
 * @date 2025/1/3
 */
public interface IStoreService {

    ServerResponse addBrand(String brandName);

    ServerResponse delBrand(Integer brandId);

    ServerResponse addSeries(Integer brandId, String seriesName);

    ServerResponse delSeries(Integer seriesId);

    ServerResponse addStore(Car car);

    ServerResponse getList(StoreQuery storeQuery);

    ServerResponse updateStore(Car car);
}
