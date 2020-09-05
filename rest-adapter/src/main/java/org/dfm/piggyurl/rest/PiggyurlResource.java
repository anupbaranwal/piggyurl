package org.dfm.piggyurl.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.dfm.piggyurl.domain.model.Piggyurl;
import org.dfm.piggyurl.domain.model.PiggyurlInfo;
import org.dfm.piggyurl.domain.port.RequestPiggyurl;

@RestController
@RequestMapping("/api/v1/piggyurls")
public class PiggyurlResource {

  private RequestPiggyurl requestPiggyurl;

  public PiggyurlResource(RequestPiggyurl requestPiggyurl) {
    this.requestPiggyurl = requestPiggyurl;
  }

  @GetMapping
  public ResponseEntity<PiggyurlInfo> getPiggyurls() {
    return ResponseEntity.ok(requestPiggyurl.getPiggyurls());
  }

  @GetMapping("/{code}")
  public ResponseEntity<Piggyurl> getPiggyurlByCode(@PathVariable Long code) {
    return ResponseEntity.ok(requestPiggyurl.getPiggyurlByCode(code));
  }
}
