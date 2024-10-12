package com.gxyan.service;

import com.gxyan.common.ServerResponse;
import com.gxyan.pojo.Employee;

/**
 *  @author liyu
 * @date 2024/12/25
 */
public interface IUserService {

    ServerResponse<Employee> login(Integer userId, String password);
}
