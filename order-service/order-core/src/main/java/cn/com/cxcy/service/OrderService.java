package cn.com.cxcy.service;

import cn.com.cxcy.bean.UserAddress;

import java.util.List;

public interface OrderService {

    /**
     * 初始化订单
     * @param userId
     */
    public List<UserAddress> initOrder(String userId);

}
