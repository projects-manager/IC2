public class RockPaperScissor
 {
  public static void main(String[] args)
  {
   int computer =(int)(Math.random()*3);

   System.out.print(" The Computer is ");
   switch( computer )
   {
    case 0 : System.out.print("rock."); break;
    case 1 :  System.out.print("paper."); break;
    case 2 :  System.out.print("Scissor."); break;
                                                 }

    int me = Integer.parseInt(args[0]);

    System.out.print(" You are ");
    switch(me)
    {
     case 0 : System.out.print("rock."); break;
     case 1 :  System.out.print("paper."); break;
     case 2 :  System.out.print("Scissor."); break;
                                                   }

     if( computer == me )System.out.print(" It is a draw.");

     else if ( me == 0 && computer == 2)System.out.print(" You Win");
     else if ( me == 1 && computer == 0)System.out.print(" You Win");
     else if ( me == 2 && computer == 1)System.out.print(" You Win");
     else System.out.print(" You loose ");
                                                                         }
                                                                                     }