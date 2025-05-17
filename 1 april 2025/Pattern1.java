import java.io.*;
import java.util.*;
public class Pattern1 {
    public static void main(String arg[]){

        // int b=5,h=10;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the base of the triangle:");
        // b=sc.nextInt(); 
        // System.out.println("Enter the height of the triangle:");
        // h=sc.nextInt();
        // System.out.println("Area of triangle is: "+((b*h)/2));


        // int l=5,w=10;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the lenght of the Rectangle:");
        // l=sc.nextInt(); 
        // System.out.println("Enter the width of the Rectangle:");
        // w=sc.nextInt();
        // System.out.println("Area of Rectangle is: "+(l*w));

        int c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        c=sc.nextInt();
        System.out.println("Center aligned triangle:");
        for(int i=1;i<=c;i++){ 
            for(int j=1;j<=c-i;j++){
                System.out.print(" ");
                }
            for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
        System.out.println();
}
     System.out.println("Right-aligned triangle:");
    for(int i=1;i<=c;i++){ 
    for(int j=1;j<=c-i;j++){
       System.out.print("  ");
    }
    for(int j=1;j<=i;j++){
    System.out.print(" *");
}
System.out.println();
}
    System.out.println("left-aligned triangle:");
    for(int i=1;i<=c;i++){ 
   
    for(int j=1;j<=i;j++){
            System.out.print("*");
        }
    System.out.println();
}
   System.out.println("Center aligned triangle:");
        for(int i=1;i<=c;i++){ 
            for(int j=1;j<=c-i;j++){
                System.out.print(" ");
                }
            for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
                }
        System.out.println();
}
    System.out.println("Right-aligned triangle:");
        for(int i=1;i<=c;i++){ 
            for(int j=1;j<=c-i;j++){
               System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                    System.out.print(i+"");
                }
                System.out.println();
        }
    System.out.println("left-aligned triangle:");
    for(int i=1;i<=c;i++){ 
   
    for(int j=1;j<=i;j++){
            System.out.print(i+"");
        }
    System.out.println();
}

System.out.println("Center aligned triangle:");
        for(int i=1;i<=c;i++){ 
            for(int j=1;j<=c-i;j++){
                System.out.print(" ");
                }
            for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
        System.out.println();
}
    System.out.println("Right-aligned triangle:");
        for(int i=1;i<=c;i++){ 
            for(int j=1;j<=c-i;j++){
               System.out.print(" ");
        }
    for(int j=1;j<=i;j++){
            System.out.print(j+"");
        }
        System.out.println();
}
    System.out.println("left-aligned triangle:");
    for(int i=1;i<=c;i++){ 
   
    for(int j=1;j<=i;j++){
            System.out.print(j+"");
        }
    System.out.println();
}
System.out.println("Center aligned triangle:");
        for(int i=1;i<=c;i++){ 
            for(int j=1;j<=c-i;j++){
                System.out.print(" ");
                }
            for(int j=1;j<=i;j++){
                    System.out.print("10");
                }
        System.out.println();
}
System.out.println("Right-aligned triangle:");
for(int i=1;i<=c;i++){ 
    for(int j=1;j<=c-i;j++){
       System.out.print("  ");
    }
    for(int j=1;j<=i;j++){
            System.out.print("10");
        }
        System.out.println();
}
    System.out.println("left-aligned triangle:");
    for(int i=1;i<=c;i++){ 
   
    for(int j=1;j<=i;j++){
            System.out.print("10");
            
        }
    System.out.println();
}
}
}