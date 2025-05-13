class StaticControlFlow
{
    static int a =100;
    static 
    {
        System.out.println("First static block");    
    }
    public  static void display()
    {
        System.out.println("Number="+a);
    }
    static
    {
        System.out.println("Second Static Block");
    }
    public static void main(String[] args) 
    {
        System.out.println("Main Method");
        System.out.println("Number="+(a+100));
        display();
    }
}