package com.binance.api.client.domain.event;

import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.market.OrderBookEntry;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * Depth delta event for a symbol.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DepthWithLevelEvent {

  private String lastUpdateId;

  /**
   * Bid depth delta.
   */
  private List<OrderBookEntry> bids;

  /**
   * Ask depth delta.
   */
  private List<OrderBookEntry> asks;


  public String getLastUpdateId() {
    return lastUpdateId;
  }

  public void setLastUpdateId(String lastUpdateId) {
    this.lastUpdateId = lastUpdateId;
  }

  public List<OrderBookEntry> getBids() {
    return bids;
  }

  public void setBids(List<OrderBookEntry> bids) {
    this.bids = bids;
  }

  public List<OrderBookEntry> getAsks() {
    return asks;
  }

  public void setAsks(List<OrderBookEntry> asks) {
    this.asks = asks;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
        .append("lastUpdateId", lastUpdateId)
        .append("bids", bids)
        .append("asks", asks)
        .toString();
  }
}
