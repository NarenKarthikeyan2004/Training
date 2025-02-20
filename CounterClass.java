class CounterClass{
    static int count=1;
    CounterClass() 
    {
        System.out.println("Object Created! Current count = " + count);
        count++;
    }

    public static void main(String[] args) 
    {
        CounterClass a=new CounterClass();
        CounterClass b=new CounterClass();
        CounterClass c=new CounterClass();
    }
}
