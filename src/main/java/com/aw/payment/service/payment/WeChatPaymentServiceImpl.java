package com.aw.payment.service.payment;

import com.aw.payment.service.AbstractPaymentService;
import com.aw.payment.model.MchPayConfigContext;
import com.aw.payment.model.PayOrder;
import com.aw.payment.model.UnifiedPayRequest;
import com.aw.payment.model.UnifiedPayResponse;

/**
 * 微信支付
 *
 * @author aw
 * @date 2021/7/18 21:16
 */
public class WeChatPaymentServiceImpl extends AbstractPaymentService {


    @Override
    public boolean supports(UnifiedPayRequest unifiedPayRequest) {
        return false;
    }

    @Override
    public void preCheck(UnifiedPayRequest unifiedPayRequest, PayOrder payOrder) {

    }

    @Override
    public UnifiedPayResponse executePay(UnifiedPayRequest unifiedPayRequest, PayOrder payOrder, MchPayConfigContext mchPayConfigContext) {
        return null;
    }
}
