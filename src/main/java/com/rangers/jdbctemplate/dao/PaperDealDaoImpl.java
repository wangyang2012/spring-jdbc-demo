package com.rangers.jdbctemplate.dao;

import com.rangers.jdbctemplate.model.PaperDeal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class PaperDealDaoImpl extends GeneralDao implements IPaperDealDao {

  @Override
  public List<PaperDeal> getPaperDeals() {
    String sql = "SELECT top 10 CdSite, CdDeal, CdTicket, CdInstrument FROM PaperDeal";
    List<PaperDeal> paperDeals = jdbcTemplate.query(sql, new PaperDealMapper());
    return paperDeals;
  }

  @Override
  public PaperDeal getPaperDeal(Integer cdSite, Integer cdDeal) {
    String sql ="SELECT top 10 CdSite, CdDeal, CdTicket, CdInstrument FROM PaperDeal where CdSite=:cdSite and CdDeal=:cdDeal";
    SqlParameterSource namedParameters = new MapSqlParameterSource()
                                            .addValue("cdSite", cdSite)
                                            .addValue("cdDeal", cdDeal);
    return jdbcTemplate.queryForObject(sql, namedParameters, new PaperDealMapper());
  }

  private static final class PaperDealMapper implements RowMapper<PaperDeal> {
    public PaperDeal mapRow(ResultSet rs, int rowNum) throws SQLException {
      PaperDeal paperDeal = new PaperDeal();
      paperDeal.setCdSite(rs.getInt("CdSite"));
      paperDeal.setCdDeal(rs.getInt("CdDeal"));
      paperDeal.setCdTicket(rs.getInt("CdTicket"));
      paperDeal.setCdInstrument(rs.getString("CdInstrument"));
      return paperDeal;
    }
  }
}
