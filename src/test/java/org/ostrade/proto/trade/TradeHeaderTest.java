package org.ostrade.proto.trade;

import org.junit.jupiter.api.Test;

public class TradeHeaderTest {

    @Test
    void tradeHeaderBuild() {
        TradeHeader tradeHeader = TradeHeader.newBuilder()
                .addTradeIds(TradeId.newBuilder().setSource("test1").setValue("12345").build())
                .build();
    }

}
