package org.ostrade.proto.trade;

import org.junit.jupiter.api.Test;
import org.ostrade.proto.field.SecurityType;
import org.ostrade.proto.field.Side;

public class TradeTest {

    @Test
    void trade() {
        Trade trade = Trade.newBuilder()
                .setTradeId(System.currentTimeMillis())
                .setSide(Side.BUY)
                .setSecurityType(SecurityType.FUTURE)
                .build();


    }

}
