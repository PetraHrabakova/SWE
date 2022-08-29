package DiceGame;

public class TestGame
{
  public static void main(String[] args)
  {
    Die die1 = new Die();
    Die die2 = new Die();

    die1.roll();
    die2.roll();

    int value1 = die1.getFaceValue();
    int value2 = die2.getFaceValue();

    while (value1 + value2 != 7)
    {
      System.out.println("Oops, you lost. The total value was: " + (value1 + value2) + " \nLet's roll again");
      die1.roll();
      die2.roll();
      value1 = die1.getFaceValue();
      value2 = die2.getFaceValue();
    }
    System.out.println("Yay, you won, your values were: ");
    System.out.println("Die 1: " + value1);
    System.out.println("Die 2: " + value2);
  }
}
