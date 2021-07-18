package com.aw.payment.service.order;

import com.aw.payment.service.AbstractPayOrderService;
import com.aw.payment.service.PayOrderService;
import org.springframework.stereotype.Service;

/**
 * 支付订单
 * B扫C 先保存订单 再支付
 * C扫B 保存订单 统一下单 支付
 *
 * @author aw
 * @date 2021/7/15 21:20
 */
@Service
public class PayOrderServiceImpl extends AbstractPayOrderService implements PayOrderService {


}
