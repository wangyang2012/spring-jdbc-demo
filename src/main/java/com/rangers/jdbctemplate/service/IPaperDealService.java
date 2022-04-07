package com.rangers.jdbctemplate.service;

import com.rangers.jdbctemplate.model.PaperDeal;
import java.util.List;

public interface IPaperDealService {

  List<PaperDeal> getPaperDeals();

  PaperDeal getPaperDeal(Integer cdSite, Integer cdDeal);

}
