package org.dfm.piggyurl.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.dfm.piggyurl.domain.model.Piggyurl;

@Table(name = "T_PIGGYURL")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PiggyurlEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_T_PIGGYURL")
  @Column(name = "TECH_ID")
  private Long techId;

  @Column(name = "CODE")
  private Long code;

  @Column(name = "DESCRIPTION")
  private String description;

  public Piggyurl toModel() {
    return Piggyurl.builder().code(code).description(description).build();
  }
}
