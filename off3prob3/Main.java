package off3prob3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Company> allComp=new ArrayList <>();
    static List<ProjectManager> allManager=new ArrayList <>();
    static List<Developer> allDev=new ArrayList <>();

    static Company findCompany(String name)
    {   Company rc=null;
        for(Company c:allComp)
        {
            if(c.name.equalsIgnoreCase(name))
                rc=c;

        }
        return rc;
    }

    static ProjectManager findmanager(Company comp,String projectName)
    {   ProjectManager rc=null;
        for(ProjectManager c:comp.proMan)
        {
            if(c.currPro.equalsIgnoreCase(projectName))
                rc=c;

        }
        return rc;
    }

    public static void main(String[] args) {

        Company company;
        Developer developer = null;
        ProjectManager projectManager = null;
        Scanner scanner=new Scanner(System.in);
        int choice=-1;

        while(choice!=0) {

            System.out.println("options:-");
            System.out.println("1. create Company");
            System.out.println("2. create Project manager");
            System.out.println("3. create Developer");
            System.out.println("4. show details");
            System.out.println("5. show Hierarchy");
             System.out.println("6. remove ");
            System.out.println("0. exit");
            choice = scanner.nextInt();


            if (choice == 1) {
                System.out.println("Enter name");
                String input = scanner.next();
                company = new Company(input);
                allComp.add(company);
                System.out.println("done 1");
            }

            if (choice == 2) {
                System.out.println("Enter name");
                String name = scanner.next();
                System.out.println("Want to add in which company?");
                String compname = scanner.next();
                System.out.println("Assign a project for him/her");
                String proName = scanner.next();
                company = findCompany(compname);
                if(company==null) System.out.println("No such company exists");
                if(company!=null)
                {projectManager = new ProjectManager(name, proName, company);
                allManager.add(projectManager);
                System.out.println("done 2");}

            }

            if (choice == 3) {
                System.out.println("Enter name");
                String name = scanner.next();
                System.out.println("Want to add in which company?");
                String compname = scanner.next();
                System.out.println("Want to add in which project?");
                String proName = scanner.next();
                company = findCompany(compname);
                if(company==null) System.out.println("No such company exists");
                if(company!=null)
                projectManager = findmanager(company, proName);//gives a project name
                if(projectManager==null) System.out.println("No such project exists");
                if(company!=null&&projectManager!=null)
                { developer = new Developer(name, company, projectManager);
                allDev.add(developer);
                System.out.println("done 3");}

            }

            if(choice==4)
            {
                System.out.println("You want to know details of a ");
                System.out.println("1.Company");
                System.out.println("2. Project manager");
                System.out.println("3. Developer");
                int op=scanner.nextInt();
                System.out.println("Enter name ");
                String in=scanner.next();
                if(op==1)
                {
                    Company cmp=findCompany(in);
                    //cmp.showHierarchy(0);
                    if(cmp==null) System.out.println("No such company");
                    else
                    cmp.showDetails();

                }
                if(op==2)
                {   boolean flag=false;
                    for(ProjectManager p:allManager)
                    {
                        if(in.equalsIgnoreCase(p.name))
                        {
                            projectManager=p;
                            projectManager.showDetails();
                            flag=true;
                        }


                    }
                    if(!flag) System.out.println("No such person exits as project manager");

                }

                if(op==3)
                {   boolean flag=false;
                    for(Developer p:allDev)
                    {
                        if(in.equalsIgnoreCase(p.name))
                        {
                            developer=p;
                            developer.showDetails();
                            flag=true;
                        }


                    }
                    if(!flag)System.out.println("No such person exits as developer");

                }
            }

            if(choice==5)
            {
                System.out.println("You want to know hierarchy of a ");
                System.out.println("1.Company");
                System.out.println("2. Project manager");
                int op=scanner.nextInt();
                System.out.println("Enter name ");
                String in=scanner.next();
                if(op==1)
                {
                    Company cmp=findCompany(in);
                    if(cmp==null) System.out.println("No such company exists");
                    else
                    cmp.showHierarchy(0);
                    //cmp.showDetails();
                }
                if(op==2)
                {    boolean flag=false;
                    for(ProjectManager p:allManager)
                    {
                        if(in.equalsIgnoreCase(p.name))
                        {
                            projectManager=p;
                            projectManager.showHierarchy(0);
                            flag=true;
                        }


                    }
                    if(!flag) System.out.println("No such person exits as project manager");

                }
            }

            if(choice==6)
            {
                System.out.println("You want to remove a ");
                System.out.println("1.Company");
                System.out.println("2. Project manager");
                System.out.println("3. Developer");
                int op=scanner.nextInt();
                System.out.println("Enter name ");
                String in=scanner.next();
                if(op==1)
                {
                    Company cmp=findCompany(in);
                    //cmp.showHierarchy(0);
                    if(cmp==null) System.out.println("No such company exists");
                    else{
                    cmp.removeComponentFromHere(cmp);
                    allComp.remove(cmp);}
                }
                if(op==2)
                {  boolean flag=false;
                    for(ProjectManager p:allManager)
                    {
                        if(in.equalsIgnoreCase(p.name))
                        {
                            projectManager=p;
                            flag=true;
                            projectManager.removeComponentFromHere(projectManager);
                            //allManager.remove(projectManager);
                        }


                    }
                    if(!flag) System.out.println("No such person exits as project manager");
                    else allManager.remove(projectManager);

                }

                if(op==3)
                {    boolean flag=false;
                    for(Developer p:allDev)
                    {
                        if(in.equalsIgnoreCase(p.name))
                        {
                            developer=p;

                            developer.removeComponentFromHere(developer);
                            //allDev.remove(p);
                            flag=true;
                        }


                    }
                    if(!flag) System.out.println("No such person exits as developer");
                    else allDev.remove(developer);

                }
            }

        }
    }

}