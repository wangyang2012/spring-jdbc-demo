package com.rangers.jdbctemplate.service;

import com.rangers.jdbctemplate.model.PaperDeal;
import com.rangers.jdbctemplate.dao.IPaperDealDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaperDealServiceImpl implements IPaperDealService {

  @Autowired
  private IPaperDealDao paperDealDao;

  @Override
  public List<PaperDeal> getPaperDeals() {
    return paperDealDao.getPaperDeals();
  }

  @Override
  public PaperDeal getPaperDeal(Integer cdSite, Integer cdDeal) {
    return paperDealDao.getPaperDeal(cdSite, cdDeal);
  }
}
