import java.util.Scanner;

final class MAIN {
    void main() {
        Scanner input = new Scanner(System.in);
        //Problem 1
        System.out.println("Aliyev Sardorbek");
        System.out.println("Fergana city, Tumaris 19");
        System.out.println("Fergana");
        System.out.println(170100);
        System.out.println("UZBEKISTAN");

        //Problem 2
        String str;
        str = input.nextLine();
        System.out.println("Hello "+str);

        //Problem 3
        float width=4.5f;
        float height=7.9f;
        System.out.print("Area: "+height*width+"\n");
        System.out.print("Perimeter: "+2*(height+width)+"\n");

        //Problem 4
        double radius, length;
        double Pi=3.14;
        System.out.print("Enter the radius of a cylinder: "); radius=input.nextDouble();
        System.out.print("Enter the length of a cylinder: "); length=input.nextDouble();
        System.out.print("Area= " + radius*radius*Pi+"\n");
        System.out.print("Volume:"+radius*radius*Pi*length+"\n");

        //Problem 5
        double height, length;
        System.out.print("Enter the height of a Equilateral triangle: "); height=input.nextDouble();
        System.out.print("Enter the length of a Equilateral triangle: "); length=input.nextDouble();
        double area=((Math.sqrt(3))*length*length)/4;
        System.out.print("Area: " +area+"\n");
        System.out.print("Volume: "+area*height+"\n");

        //Problem 6
        double cost;
        System.out.print("Enter the price of the meal: "); cost=input.nextDouble();
        double tax=cost*0.10, tip=cost*0.18, grand=cost+tip+tax;
        System.out.printf("Tax = %.2f%n", tax);
        System.out.printf("Tip = %.2f%n", tip);
        System.out.printf("Grand = %.2f%n", grand);

        //Problem 7
        double distance, miles, price;
        System.out.print("Enter the driving distance: "); distance=input.nextDouble();
        System.out.print("Enter miles per gallon:: "); miles=input.nextDouble();
        System.out.print("Enter price per gallon:: "); price=input.nextDouble();
        double cost=distance*price/miles;
        System.out.printf("The cost of driving is %.2f%n", cost);

        //Problem 8
        System.out.print("Enter a number: "); int num = input.nextInt();
        int sum = 0;
        int temp = num;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum of digits = " + sum);

        //Problem 9
        System.out.print("Enter first integer: "); int a = input.nextInt();
        System.out.print("Enter second integer: "); int b = input.nextInt();
        System.out.print("Enter third integer: "); int c = input.nextInt();

        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int middle = (a + b + c) - min - max;

        System.out.println("Sorted order: " + min + " " + middle + " " + max);

    }
}