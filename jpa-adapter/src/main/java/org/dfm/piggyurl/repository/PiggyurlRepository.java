package org.dfm.piggyurl.repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.dfm.piggyurl.domain.model.Piggyurl;
import org.dfm.piggyurl.domain.port.ObtainPiggyurl;
import org.dfm.piggyurl.repository.dao.PiggyurlDao;
import org.dfm.piggyurl.repository.entity.PiggyurlEntity;

public class PiggyurlRepository implements ObtainPiggyurl {

  private PiggyurlDao piggyurlDao;

  public PiggyurlRepository(PiggyurlDao piggyurlDao) {
    this.piggyurlDao = piggyurlDao;
  }

  @Override
  public List<Piggyurl> getAllPiggyurls() {
    return piggyurlDao.findAll().stream().map(PiggyurlEntity::toModel).collect(Collectors.toList());
  }

  @Override
  public Optional<Piggyurl> getPiggyurlByCode(Long code) {
    Optional<PiggyurlEntity> piggyurlEntity = piggyurlDao.findByCode(code);
    return piggyurlEntity.map(PiggyurlEntity::toModel);
  }
}
