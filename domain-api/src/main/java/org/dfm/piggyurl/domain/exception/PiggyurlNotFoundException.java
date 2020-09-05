package org.dfm.piggyurl.domain.exception;

public class PiggyurlNotFoundException extends RuntimeException {

  public PiggyurlNotFoundException(Long id) {
    super("Piggyurl with code " + id + " does not exist");
  }
}

