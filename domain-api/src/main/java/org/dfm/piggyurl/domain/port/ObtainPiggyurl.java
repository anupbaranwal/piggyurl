package org.dfm.piggyurl.domain.port;

import java.util.List;
import java.util.Optional;
import org.dfm.piggyurl.domain.model.Piggyurl;

public interface ObtainPiggyurl {

  default List<Piggyurl> getAllPiggyurls() {
    Piggyurl piggyurl = Piggyurl.builder().code(1L).description(
        "If you could read a leaf or tree\r\nyoud have no need of books.\r\n-- Alistair Cockburn (1987)")
        .build();
    return List.of(piggyurl);
  }

  default Optional<Piggyurl> getPiggyurlByCode(Long code) {
    return Optional.of(Piggyurl.builder().code(1L).description(
        "If you could read a leaf or tree\r\nyoud have no need of books.\r\n-- Alistair Cockburn (1987)")
        .build());
  }
}
