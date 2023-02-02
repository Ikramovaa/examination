import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     /*   Date now =new Date();

        System.out.println(now);*/
        /*String message="Hello World";
        System.out.println(message.length());*/
    /*String message ="Hello world is my mother is";
        System.out.println(message.replace("is","was"));*/
       /* int []numbers= new int[5];
        numbers[0]=1;
        numbers[1]=2;
        System.out.println(Arrays.toString(numbers));*/
        /*
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[0]);*/
        /*int []numbers={5,3,1,0,8,2,9,4,7,6};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));*/
       /* int x=1;
        int y=1;
        System.out.println(x!=y);*/
       /* int temperatur=23;
        boolean isWarm=temperatur>20&&temperatur<30;
        System.out.println(isWarm);*/
       /* int temp=18;
        if(temp>30){
            System.out.println("it's hot day");
            System.out.println("Drink a water");}
        else if (temp>20&&temp<=30) {
            System.out.println("It's warm day");}
        else {
            System.out.println("It's cold day");

        }*/
        /*int income=120_000;
        boolean hasHighIncome=(income>100_000);
        System.out.println(hasHighIncome);*/
      /*  int income =20_000;
        String className =income>100_000?"First class":"Economy";
        System.out.println(className);*/
      /*  String role="admin";
        switch (role){
            case "admin":
                System.out.println("you are admin");
                break;
            case "moderator":
                System.out.println("you are moderator");
                break;
            default:
                System.out.println("you are guest");

        }*/
       /* Scanner scanner=new Scanner(System.in);
        System.out.println("Number:");
        int number = scanner.nextInt();
        if(number%3==0&&number%5==0){
            System.out.println("FizzBuzz");}
        else if (number%5==0){
        System.out.println("Fizz")
        ;}
        else if (number%3==0){
        System.out.println("Buzz");
        }
        else {
            System.out.println(number);
        }*/
       /* for(int i=0;i<5;i++){
            System.out.println("Hello World "+i);
        }*/
       /* for(int i=5;i>0;i--){
            System.out.println("Hello World "+i);
        }*/
        /* String[]fruits={"Mango","Apple","Orange"};
        for(int i=0; i< fruits.length;i++){
             System.out.println(fruits[i]);
         }for(String fruit:fruits)
            System.out.println(fruit);*/
      /*  String aboutLucky= "I'm was unlucky before.Now I'm was lucky.So you too was lucky";
        System.out.println(aboutLucky.replace("was","is"));*/
      /*  int a=5;
        System.out.println(a++);
        int b=5;
        System.out.println(++b);
        int c= 5;
        System.out.println(c--);
        int d= 5;
        System.out.println(--d);*/
        /*Random random=new Random();
        int a= random.nextInt(100);
        System.out.println("random number"+a);*/
       /* int a=5,b=0;
        while (a>b){
            System.out.println(++b);
        }*/
       /* int a=4,b=0;
        while (a>b){
            System.out.println(b++);
        }*/
       /* int a=4, b=5;
        while (a>b){
            System.out.println(b++);
        }*/
       /* int a=4,b=6;
        while (a<b){
            a=a+b;
        }*/
       /* int a=2,b=12;
        while (a<b){
            a=a+3;
            System.out.println(a);
        }*/
       /* int a=24,b=12;
        while (a>b){
            a=a-3;
            System.out.println(a);
        }*/
       /* Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        while(a<b){
            a++;
            System.out.println(a);
            System.out.println(Math.pow(a,b));
*/
      /*  Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b =8;
        while (a>0){
            a--;
           if(a%2==1){
            System.out.println(a);
        }}*/
       /* int a=0;
        while (a<10){
            System.out.println("Hello world "+a);
            a++;
        }*/
       /* int a=9;
        for(int i=1;i<10;i++){
            System.out.println("9*"+i +"= "+i*a);
        }*/

     /*   for(int i=10;i>1;i--){
            System.out.println(i*i);
        }*/
       /* for(int i=1;i<=10;i+=3){
            System.out.println(i*i);
        }*/
       /* int x=1;
        for(int i =4;i>=1;i--){
            x=x+1;
            System.out.println(x);
        }*/
       /* int x=1;
        for(int i=4;i>=2;i--){
            x=x+1;
            System.out.println(x);
        }*/
       /* int x=1;
        for (int i=10;i>=1;i++){
            x=x+1;
            System.out.println(x);
        }*/
        /*int x=1;
        for(int i=10;i<=1;i++){
            x=x+1;
            System.out.println(x);
        }*/
       /* int sum =0;
        for(int i=0;i<100;i++){
            sum=sum+i;
            System.out.println(sum);
        }*/
      /*  for(int i=1;i>=1;i++){
            System.out.println("infintite loop1");
        }*/
     /*   for (;;){
            System.out.println("infinite loop2");
        }*/
       /* for(int i=1;i<=2;i++){
            for (int j=1;j<=3;j++){
                System.out.println(j+"*");
            }
        }*/
        /*for(int i=1;i<6;i++){
            System.out.println("*");
            for (int j=0;j<0+i;j++){
                System.out.print("*");
            }*/
       /* Random random=new Random();
        int []massive=new int[5];
        for (int i=0;i< massive.length;i++){
            massive[i]=random.nextInt(1,10);
            System.out.println(massive[i]);
        }*/
        Random random=new Random();
        int[] massive=new int[10];
        int sum=0;
        for (int i=0;i< massive.length;i++){
            massive[i]= random.nextInt(10);
            sum=sum+massive[i];
            System.out.println(sum);

        }
    }}
