/*Given a side of a square, your task is to calculate its area.
        Input
        The first line of the input contains the side of the square.

        Constraints:
        1 <= side <=100*/
import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
      int side =sc.nextInt();
      int area = side * side;
      System.out.println(area);
  }

}