package edu.cnm.deepdive.codingbat;

public class Logic2 {

  public int blackjack(int a, int b) {
    int winner = 0;
    if (a <= 21 & a > b | b > 21) {
        winner = a;
        }
    if (b <= 21 & b > a | a > 21) {
      winner = b;
      }
    if (a > 21 & b > 21) {
      winner = 0;
    }
    return winner;
  }

  public boolean makeBricks(int small, int big, int goal) {
    return false; // TODO Compute & return value as specified in https://codingbat.com/prob/p183562.
  }

}
