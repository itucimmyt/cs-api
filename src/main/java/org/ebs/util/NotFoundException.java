package org.ebs.util;

public class NotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public NotFoundException(String m) {
      super(m);
    }
  }