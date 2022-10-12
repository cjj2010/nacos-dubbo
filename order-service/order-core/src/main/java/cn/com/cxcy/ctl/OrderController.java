package cn.com.cxcy.ctl;

import cn.com.cxcy.bean.UserAddress;
import cn.com.cxcy.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/getOrder")
    public List<UserAddress> getOrder(@RequestParam("userId") String userId){
        return orderService.initOrder(userId);
    }
}

