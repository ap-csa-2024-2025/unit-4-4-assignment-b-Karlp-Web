import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Put your solutions below
  }

  public static int countSub(String word, String target)
  {
    return 0;
  }

  public static int countProperContains(String word, String target)
  {
    int count = 0;
    int N = target.length();

    for (int i = 0; i < word.length() - (N-1); i++ )
    {
      String sub = word.substring(i, i+N);
      boolean beginOrSpaceBefore;
      boolean endOrSpaceAfter;
      
      int endOfTarget = i + 

      boolean properlyContained = beginOrSpaceBefore && endOrSpaceAfter;
      if (sub.equals(target) && properlyContained)
      {
        count++;
      }
    }
    return count;
  }

  public static String deleteSub(String word, String target)
  {
    return null;
  }
}
