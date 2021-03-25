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

  // Cleaner answer
//  public int blackjack(int a, int b) {
//    int hand1 = (a <= 21) ? a : 0;
//    int hand2 = (a <= 21) ? b : 0;
//    return Math.max(hand1, hand2);
//  }


  public boolean makeBricks(int small, int big, int goal) {
    if (goal > big * 5 + small) {
      return false;
    }
    if (goal % 5 > small) {
      return false;
    }
    return true;
  }

}
