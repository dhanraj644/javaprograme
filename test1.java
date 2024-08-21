class info{
    int pid;
    char branch,year;
    info(int a, char b,char d)
    {
    pid=a;
    branch=b;
    year=d;
    }
    void display()
    {
        System.out.println("pid is"+pid);
        switch (branch)
        {
            case 'i':
                System.out.println("information technology");
                break;
            case 'e':
                System.out.println("electronic and communication");
                break;
            case 'c':
                System.out.println("Computer Science");
                break;
            default:
                System.out.println("Please enter valid branch");
        }
        switch (year)
        {
            case 'f':
                System.out.println("FE");
                break;
            case 's':
                System.out.println("SE");
                break;
            case 't':
                System.out.println("TE");
                break;
            default:
                System.out.println("Please enter valid year");
        }
    }
}
class Fe extends info
{
int c,cpp;

    Fe(int a, char b,char d ,int k, int j)
    {
        super(a,b,d);
        c=k;
        cpp=j;
    }
    void fdisplay()
    {
    display();
        System.out.println("c "+c);
        System.out.println("cpp"+cpp);
    }
}
class Se extends info
{
    int vb,html;
    Se(int a, char b,char d ,int k, int j)
    {
        super(a,b,d);
        vb=k;
        html=j;
    }
    void sdisplay()
    {
        display();
        System.out.println("vb"+vb);
        System.out.println("html"+html);
    }

}
class Te extends info{
    int java ,matlab;
    Te(int a, char b,char d ,int k, int j)
    {
    super(a,b,d);
    java=k;
    matlab=j;
    }
    void tdisplay()
    {
        display();
        System.out.println("java"+java);
        System.out.println("matlab"+matlab);
    }

}

public class test1 {

        public static void main (String args[])
        {
            Fe obj =new Fe(2,'j','i',56,2);
            obj.fdisplay();
            Se obj1=new Se(5,'i','d',95,5);
            obj1.sdisplay();
            Te obj2=new Te(9,'k','y',9,6);
            obj2.tdisplay();
        }
}
