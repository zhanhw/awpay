package com.aw.payment.service;

import com.aw.payment.model.MchPayConfigContext;
import com.aw.payment.model.UnifiedPayRequest;
import com.aw.payment.model.PayOrder;
import com.aw.payment.model.UnifiedPayResponse;

/**
 * 支付
 *
 * @author aw
 * @date 2021/7/14 21:24
 */
public interface PaymentService {

    /**
     * 是否支持该支付方式
     *
     * @param unifiedPayRequest
     * @return
     */
    boolean supports(UnifiedPayRequest unifiedPayRequest);

    /**
     * 预检查参数
     *
     * @param unifiedPayRequest
     * @param payOrder
     */
    void preCheck(UnifiedPayRequest unifiedPayRequest, PayOrder payOrder);

    /**
     * 支付
     *
     * @param unifiedPayRequest
     * @param payOrder
     * @param mchPayConfigContext
     * @return
     */
    UnifiedPayResponse executePay(UnifiedPayRequest unifiedPayRequest, PayOrder payOrder, MchPayConfigContext mchPayConfigContext);

}
