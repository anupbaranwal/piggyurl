package org.dfm.piggyurl.repository.dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.dfm.piggyurl.repository.entity.PiggyurlEntity;

@Repository
public interface PiggyurlDao extends JpaRepository<PiggyurlEntity, Long> {

  Optional<PiggyurlEntity> findByCode(Long code);
}
