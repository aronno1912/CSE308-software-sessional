package prob3;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static BaseComponent root;
    private static BaseComponent curr;
    private static String input;
    private static int choice;


    public static void instantiate() {
        String currProj;
        System.out.print("\n"+"enter name: ");
        input = scanner.nextLine();
        if(choice == 1)
        {
            curr = new CompositeComponent(input, "Company", null,"");
            curr.addEntity(curr);
            root=curr;

        }
        else if(choice == 2)
        {
            System.out.println("Assign a project ");
            currProj=scanner.nextLine();
            curr = new CompositeComponent(input, "Project Manager", curr,currProj);
            curr.getParent().addEntity(curr);
        }
        else if(choice == 3)
        {
            System.out.println("Assign a project ");
            currProj=scanner.nextLine();
            curr = new Leaf(input, "Project Manager", curr,currProj);
            curr.getParent().addEntity(curr);
        }
        else
        {

        }

        return ;
    }

    public static void main(String[] args) {

  while(true)
  {
      System.out.println("options:-");
      System.out.println("1. create Company");
      System.out.println("2. create Project manager");
      System.out.println("3. create Developer");
      System.out.println("4. show Hierarchy");
      System.out.println("5. show details");
     // System.out.println("6. remove current");
      System.out.println("0. exit");
      choice = scanner.nextInt();
      if (choice==0)break;
      input = scanner.nextLine();
      switch (choice)
      {
          case 0: break;
          case 1:
          case 2:
          case 3: {   instantiate();
              break;
          }
          case 4:
          {   System.out.println("\n"+curr.getList(0)+"\n");
              break;
          }
          case 5:
          {   curr.showDetails();
              break;
          }
          case 7:
          {
              if(curr.getChildCount() == 0) {
                  System.out.println("\n"+"-- goto operation failed --"+"\n");
              } else {
                  int i, childCount = curr.getChildCount();  // NOTICE

                  System.out.println("\n"+"goto:-");

                  for(i=0; i<childCount; i++) {
                      System.out.println(">> "+curr.getChild(i).getName()+" ("+curr.getChild(i).getRole()+")");
                  }

                  System.out.print("\n"+"destination(type name): ");
                  input = scanner.nextLine();

                  for(i=0; i<childCount; i++) {
                      if(curr.getChild(i).getName().equalsIgnoreCase(input)) {
                          curr = curr.getChild(i);
                          break;
                      }
                  }

                  if(i == childCount) {
                      System.out.println("\n"+"no such directory found, try again..."+"\n");
                  } else {
                      System.out.println("");
                  }
              }
              break;
          }
          case 8:
          {
              try {
                  curr = curr.getParent();
              }
              catch (NullPointerException e)
              {break;}

              System.out.println("");
              break;

          }

      }
  }

    }
}
