package cn.com.cxcy.service;

import cn.com.cxcy.bean.UserAddress;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    /**
     * 调用远程接口，指定接口，关闭自启动检查
     */
    @DubboReference(interfaceClass = UserService.class, check = false)
    UserService userService;


    @Override
    public List<UserAddress> initOrder(String userId) {
        return userService.getUserAddressList(userId);
    }
}

