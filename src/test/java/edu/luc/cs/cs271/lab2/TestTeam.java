package edu.luc.cs.cs271.lab2;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestTeam {
  
  Team makeTeamFixture(final String name, final String headcoach, final int funding) {
    return new Team(name, headcoach, funding);
  }

  @Test
  public void testConstructorValidName() {
    try {
      new Team(null, "Klinsmann", 500);
      fail("should have thrown IllegalArgumentException");
    } catch (final Throwable ex) {
      // if we landed here, we're good!
    }
  }
  
  // Done testConstructorValidHeadcoach
  @Test
  public void testConstructorValidHeadcoach() {
    try {
      new Team("USA", null, 500);
      fail("should have thrown IllegalArgumentException");
    } catch (final Throwable ex) {

    }
  }
  // TODO testConstructorValidFunding
  public void testConstructorValidFunding() {
    try {
      new Team("USA", "Klinsmann", 0);
      fail("should have thrown IllegalArgumentException");
    } catch (final Throwable ex) {

    }
  }

  @Test
  public void testGetName() {
    final String name = "USA";
    final Team t = makeTeamFixture(name, "Klinsmann", 500);
    assertEquals(name, t.getName());
  }
  
  // Done testGetHeadcoach
  @Test
  public void testGetHeadcoach() {
    final String name = "Klinsmann";
    final Team t = makeTeamFixture("USA",name, 500);
    assertEquals(name, t.getHeadcoach());
  }
  // done testGetFunding
  @Test
  public void testGetFunding() {
    final int fund = 500;
    final Team t = makeTeamFixture("USA", "Klinsmann", fund);
    assertEquals(fund, t.getFunding());
  }
}