package OOPS;

public class Main {
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_RESET = "\u001B[0m";
    public static void main(String[] args) {
        System.out.println(TEXT_BLUE + "********** Simple Calculator *************8"+ TEXT_RESET);
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubstractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());

        System.out.println(TEXT_BLUE +"******** Student Details ***********"+ TEXT_RESET);
        StudentDetails student1=new StudentDetails(1,"Sandeep","Konark");
        StudentDetails student2=new StudentDetails(2,"SP7","Odisha");
        student1.display();
        student2.display();
        System.out.println("Number of Objects created = "+StudentDetails.count);

        System.out.println(TEXT_BLUE +"******** Calculate Sum ***********"+ TEXT_RESET);
        CalculateSum Add=new CalculateSum();
        System.out.println("Sum of 10 & 20 = "+Add.sum(10,20));
        System.out.println("Sum of 30 & 40 & 50 = "+Add.sum(30,40,50));

        System.out.println(TEXT_BLUE +"******** Product Details ***********"+ TEXT_RESET);
        Product[] obj = new Product[10] ;
        obj[0] = new Product(1,"Dell Inspiron",71000);
        obj[1] = new Product(2,"Dell XPS",91000);
        obj[2] = new Product(3,"Dell Inspiron 7400",83000);
        obj[3] = new Product(4,"Dell Inspiron 5400",76000);
        obj[4] = new Product(5,"Dell Lattitude",100000);
        obj[5] = new Product(6,"Lenovo Yoga Slim 7",82000);
        obj[6] = new Product(7,"Lenovo Ideapad S540",79000);
        obj[7] = new Product(8,"Lenovo Thinkpad",72000);
        obj[8] = new Product(9,"Hp Pavilion 14",79000);
        obj[9] = new Product(10,"Hp Envy X360",80000);

        for(int i=0;i<10;i++){
            System.out.println(obj[i].display());
            System.out.println("-------------");
        }

        System.out.println(TEXT_BLUE +"******** Employee Details ***********"+ TEXT_RESET);
        Employee emp=new Employee();
        emp.setId(1);
        emp.setName("Sandeep");
        emp.setSalary(40000);
        System.out.println(emp);

        System.out.println(TEXT_BLUE +"******** Employee Details Parameterized Constructor ***********"+ TEXT_RESET);
        Employee2nd secondEmployee=new Employee2nd(10,"Sandeep");
        Employee2nd secondEmployee2=new Employee2nd(10,"Sandeep",50000);
        secondEmployee.display();
        secondEmployee2.display();

        System.out.println(TEXT_BLUE +"******** Product Swapping ***********"+ TEXT_RESET);
        Product laptop=new Product(100,"sony",8500);
        Product desktop=new Product(100,"sony",35000);
        int temp=laptop.getPrice();
        laptop.setPrice(desktop.getPrice());
        desktop.setPrice(temp);
        laptop.display();
        desktop.display();

        System.out.println(TEXT_BLUE +"******** Factorial Using Recursion ***********"+ TEXT_RESET);
        int num = 10;
        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);

        System.out.println(TEXT_BLUE +"******** GCD Using Recursion ***********"+ TEXT_RESET);
        int n1 = 366, n2 = 60;
        int hcf = hcf(n1, n2);
        System.out.printf("G.C.D of %d and %d is %d.", n1, n2, hcf);

        System.out.println(TEXT_BLUE +"\n******** Fibonancie Using Recursion ***********"+ TEXT_RESET);
        int n =10;
        for(int i=1; i<=n; i++){
            //call recursive function for the ith term
            System.out.print(fibonacci(i)+" ");
        }

        System.out.println(TEXT_BLUE +"\n******** Sum of N numbers Using Recursion ***********"+ TEXT_RESET);
        int number = 20;
        int sum = addNumbers(number);
        System.out.println("Sum = " + sum);




    }
    public static long multiplyNumbers(int num)
    {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }

    public static int hcf(int n1, int n2)
    {
        if (n2 != 0)
            return hcf(n2, n1 % n2);
        else
            return n1;
    }

    private static int fibonacci(int n){
        if(n==1){
            return 0;
        }
        else if(n == 2){
            return 1;
        } else {
            return fibonacci(n-2)+fibonacci(n-1);
        }

    }
    public static int addNumbers(int num) {
        if (num != 0)
            return num + addNumbers(num - 1);
        else
            return num;
    }

}
