package com.rangers.jdbctemplate.dao;

import com.rangers.jdbctemplate.model.PaperDeal;
import java.util.List;

public interface IPaperDealDao {
  List<PaperDeal> getPaperDeals();

  PaperDeal getPaperDeal(Integer cdSite, Integer cdDeal);
}
