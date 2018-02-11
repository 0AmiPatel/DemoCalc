public class DemoC{
    static int a= 9;   //static variable
     static int b= 6;   //static  variable
    static int total;

    //static method

    public static  void addition(){
        total = a + b;
        System.out.println( "Addition :" + total);

    }

    // instatnce method
    public void multiplication () {
        total = a * b;
        System.out.println("multiplication:" + total);


    }


    //main method
    public static void main (String[] args){
            addition();
            //instance method can not be called directly in main method

        DemoC demoC = new DemoC();
        demoC.multiplication();


    }



}
