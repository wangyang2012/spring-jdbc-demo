package com.rangers.jdbctemplate.model;

public class PaperDeal {

  private Integer CdSite;
  private Integer CdDeal;
  private Integer CdTicket;
  private String CdInstrument;

  public Integer getCdSite() {
    return CdSite;
  }

  public void setCdSite(Integer cdSite) {
    CdSite = cdSite;
  }

  public Integer getCdDeal() {
    return CdDeal;
  }

  public void setCdDeal(Integer cdDeal) {
    CdDeal = cdDeal;
  }

  public Integer getCdTicket() {
    return CdTicket;
  }

  public void setCdTicket(Integer cdTicket) {
    CdTicket = cdTicket;
  }

  public String getCdInstrument() {
    return CdInstrument;
  }

  public void setCdInstrument(String cdInstrument) {
    CdInstrument = cdInstrument;
  }
}
