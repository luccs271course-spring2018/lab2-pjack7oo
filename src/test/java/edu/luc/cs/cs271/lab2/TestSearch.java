package edu.luc.cs.cs271.lab2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class TestSearch {
  
  Team[] makeArrayFixture(final int size) {
    final Team[] array = new Team[size];
    for (int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      array[i] = new Team("Team " + s, "Coach " + s, i * 100 + 50);
    }
    return array;
  }
  final Team t1 = new Team("USA", "Klinsmann", 500);
  final Team t2 = new Team("Chile", "Pizzi", 600);
  final Team t3 = new Team("Germany", "Löw", 700);
  final Team[] array = {t1, t2, t3};
  // TODO makeListFixture
  List<Team> makeListFixture (final int size) {
    final List<Team> list = new ArrayList<Team>(size);
    for (int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      list.add(new Team("Team " + s, "Coach " + s, i * 100 + 50));
    }
    return list;
  }

  @Test
  public void testFindPositionArray0() {
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10s() {
    final Team[] arr = makeArrayFixture(10);
    assertTrue(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10f() {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamPosition(arr, "Team 11").isPresent());
  }
  
  // TODO: testFindPositionList0, 10s, 10f
  @Test
  public void testFindPositionList0() {
    final List<Team> arr = makeListFixture(0);
    assertFalse(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionList10s() {
    final List<Team> arr = makeListFixture(10);
    assertTrue(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionList10f() {
    final List<Team> arr = makeListFixture(10);
    assertFalse(Search.findTeamPosition(arr, "Team 11").isPresent());
  }
  // TODO: testFindMinFundingArray for several sizes and scenarios
  @Test
  public void testFindMinFundingArray300() {
   assertSame(0,Search.findTeamMinFunding(array,300).get());
  }

  @Test
  public void testFindMinFundingArray500() {
    assertSame(0,Search.findTeamMinFunding(array,500).get());
  }

  @Test
  public void testFindMinFundingArray501() {
    assertSame(1,Search.findTeamMinFunding(array,501).get());
  }

  @Test
  public void testFindMinFundingArray600() {
    assertSame(1,Search.findTeamMinFunding(array,600).get());
  }

  @Test
  public void testFindMinFundingArray601() {
    assertSame(2,Search.findTeamMinFunding(array,601).get());
  }

  @Test
  public void testFindMinFundingArray700() {
    assertSame(2,Search.findTeamMinFunding(array,700).get());
  }

  @Test
  public void testFindMinFundingArray701() {
    assertSame(Optional.empty(),Search.findTeamMinFunding(array,701));
  }

  // TODO: testFindMinFundingArrayFast for several sizes and scenarios

  @Test
  public void testFindMinFundingArrayFast300() {
    assertSame(0,Search.findTeamMinFundingFast(array, 300).get());
  }

  @Test
  public void testFindMinFundingArrayFast500() {
    assertSame(0,Search.findTeamMinFundingFast(array, 500).get());
  }

  @Test
  public void testFindMinFundingArrayFast501() {
    assertSame(1,Search.findTeamMinFundingFast(array, 501).get());
  }

  @Test
  public void testFindMinFundingArrayFast600() {
    assertSame(1,Search.findTeamMinFundingFast(array, 600).get());
  }

  @Test
  public void testFindMinFundingArrayFast601() {
    assertSame(2,Search.findTeamMinFundingFast(array, 601).get());
  }

  @Test
  public void testFindMinFundingArrayFast700() {
    assertSame(2,Search.findTeamMinFundingFast(array, 700).get());
  }

  @Test
  public void testFindMinFundingArrayFast701() {
    assertSame(Optional.empty(),Search.findTeamMinFundingFast(array, 701));
  }
}