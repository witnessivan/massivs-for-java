
package lab1;
import java.util.Scanner;
import java.util.Arrays;

public class Lab1 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = in.nextInt();
        short mas[] = new short[n];
        mas_in(mas);
        mas_left(mas);
        mas_right(mas);
        mas_div(mas);
        mas_nechet(mas);
        
    }
    
    
    
    
    static void mas_in(short mas[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите элементы массива");
        for(int i = 0; i < mas.length; i++){
            mas[i] =in.nextShort();
        }
    
    }
    static void mas_left(short mas[]){
        System.out.println("Массив слева направо");
        for(int i = 0; i < mas.length; i++){
            System.out.println(mas[i] + " ");
        }
    }
    static void mas_right(short mas[]){
        System.out.println("Массив справа налево");
        for(int i = mas.length - 1; i !=-1; i--){
           System.out.println(mas[i] + " ");
        }
    }
    static void mas_div(short mas[]){
        Scanner in = new Scanner(System.in);
        int z = 0;
        int k = 0;
        System.out.println("Введите делитель");
        int div = in.nextInt();
        for(int i = 0;i < mas.length ; i++){
           for(short c = 1;c < mas[i];c++){
               if(mas[i]/c == 0){
                  k++;
               }
           }
            if(k < div){
               z++;
            }    
        }
        System.out.println("Количество элементов массива,у которых количество делителей меньше заданного значения = " + z);
    }
    static void mas_nechet(short mas[]){
        System.out.println("Массмв только с чётными элементами");
        for(int i = 0; i < mas.length; i++){
            
            int k = 0;
           int c = mas[i];
           while(c!=0){
               k = c%10;
               c = c/10; 
               
           }
           if(k%2 ==0){
               mas[i] = mas[i];
           }
           else{
               mas[i] = 0;
           } 
             
            
        }
        for(int i = 0; i< mas.length;i++){
            System.out.println(mas[i] + " ");
        }
    }
}
