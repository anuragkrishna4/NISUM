interface Interface1{
    void methodA();  
}
interface Interface2{
    void methodB();  
}
class InterfaceImpliment implements Interface1, Interface2{
    public void methodA(){
        System.out.println("Method A");
    }
    public void methodB(){
        System.out.println("Method B");
    }
    public static void main(String[] args) {
        InterfaceImpliment obj = new InterfaceImpliment();
        obj.methodA();
        obj.methodB();
    }
    
}
