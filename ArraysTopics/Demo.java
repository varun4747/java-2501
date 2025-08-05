package ArraysTopics;

public class Demo {

    public static void main(String[] args) {
        // datatype[] arrayName = new datatype[size];
        int []num=new int[10];
         
        // num[0]=10;
        // num[1]=20;     //first scenario
        // num[2]=30;
        // num[9]=100;

        // System.out.println("Array length: " + num.length);
        // System.out.println(num[4]);



        int[] num1 = {1,2,3,4,5}; // second scenario
        int sum=0;
        int avg=0;   
        for(int i=0;i<num1.length;i++){
            // System.out.println(num1[i]);
            sum=sum+num1[i];
            avg=sum/num1[i];


            System.out.println(sum);
            System.out.println(avg);

        }
        


    }
}



