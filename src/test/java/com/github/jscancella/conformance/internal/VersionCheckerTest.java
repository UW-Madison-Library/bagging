package com.github.jscancella.conformance.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.github.jscancella.conformance.BagitWarning;
import com.github.jscancella.domain.Version;

public class VersionCheckerTest {

  @Test
  public void testCheckOldVersion(){
    Set<BagitWarning> warnings = new HashSet<>();
    VersionChecker.checkVersion(new Version(0, 95), warnings, Collections.emptyList());
    
    Assertions.assertTrue(warnings.contains(BagitWarning.OLD_BAGIT_VERSION));
  }
  
  @Test
  public void testLinterIgnoreOldVersion(){
    Set<BagitWarning> warnings = new HashSet<>();
    VersionChecker.checkVersion(new Version(0, 95), warnings, Arrays.asList(BagitWarning.OLD_BAGIT_VERSION));
    
    Assertions.assertFalse(warnings.contains(BagitWarning.OLD_BAGIT_VERSION));
  }
}
