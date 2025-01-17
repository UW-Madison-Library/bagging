package com.github.jscancella.exceptions;

import com.github.jscancella.hash.Hasher;

/**
 * Class to represent an error when the initializing a new {@link Hasher}
 */
public class HasherInitializationException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  public HasherInitializationException(final Exception exception){
    super(exception);
  }
}
