
package lab1;
import java.util.Scanner;
import java.util.Arrays;

public class Lab1 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = in.nextInt();
        proverka_otrecateli(n);
        tabl_operatos();//Выведение меню
        short mas[] = new short[n];
        int op;// Переменная для функции stwitch
        do{
           op = in.nextInt();
          switch(op)
          { 
             case 1:
                   mas_in(mas);
                   break;
             case 2:
                   mas_left(mas);
                   break;
             case 3:
                   mas_right(mas);
                   break;
             case 4:
                   mas_div(mas);
                   break;
             case 5: 
                   mas_nechet(mas);
                   break;
             case 6:
                   System.exit(0);
                   break;
            default:
                System.out.println(op +" Данный символ не поддерживается");
          }
         
        }while(op != 6);
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
    static void tabl_operatos(){
        System.out.println("Выберите действие(нажатие клавиш: 1,2,3,4,5,6) \n"
                +"1 = Введите эементы массива \n"
                + "2 = Массив слева направо \n"
                + "3 = Массив справа налево \n"
                + "4 = Количество элементов массива,у которых количество делителей меньше заданного значения \n"
                + "5 = Массмв только с чётными элементами \n"
                + "6 = Выход \n");
    }
    static void  proverka_otrecateli(int n){
        if (n <= 0)
        {
            System.out.println(" Размерность не может быть отрицательной");
            System.exit(0);
        }
        
    }
}  

