
package lab1;
import java.util.Scanner;

public class Lab1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     
        tabl_operatos();//Выведение меню
        int size = 0;
        short array[] =null;
        int select;// Переменная для функции stwitch
        do
        {
           select = input.nextInt();
          switch(select)
          { 
            case 0:
                array = size_array(array);              
                break;
            case 1:
                mas_in(array,size);
                break;
            case 2:
                mas_left(array,size);
                break;
            case 3:
                mas_right(array,size);
                break;
            case 4:
                mas_div(array,size);
                break;
            case 5: 
                mas_nechet(array,size);
                break;
            case 6:
                break;
            default:
                System.out.println("Error");
          }
         
        }while(select != 6);
    }
    static void mas_in(short array[],int size)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите элементы массива");
        for(int index = 0; index < array.length; index++)
        {
            array[index] =input.nextShort();
        }
    
    }
    static void mas_left(short array[],int size){
        System.out.println("Массив слева направо");
        for(int index = 0; index < array.length; index++)
        {
            System.out.println(array[index] + " ");
        }
    }
    static void mas_right(short array[],int size){
        System.out.println("Массив справа налево");
        for(int index = array.length - 1; index !=-1; index--){
           System.out.println(array[index] + " ");
        }
    }
    static void mas_div(short array[],int size)
    {
        Scanner in = new Scanner(System.in);
        int z = 0;
        int k = 0;
        System.out.println("Введите делитель");
        int div = in.nextInt();
        for(int index = 0;index < array.length ; index++)
        {
           for(short c = 1;c < array[index];c++)
           {
               if(array[index]/c == 0)
               {
                  k++;
               }
           }
           if(k < div)
           {
               z++;
           }    
        }
        System.out.println("Количество элементов массива,у которых количество делителей меньше заданного значения = " + z);
    }
    static void mas_nechet(short array[],int size)
    {
        System.out.println("Массмв только с чётными элементами");
        for(int index = 0; index < array.length; index++)
        {
            
            int k = 0;
           int c = array[index];
           while(c!=0){
               k = c%10;
               c = c/10; 
               
           }
           if(k%2 ==0)
           {
               
           }
           else{
               array[index] = 0;
           } 
             
            
        }
        for(int index = 0; index< array.length;index++){
            System.out.println(array[index] + " ");
        }
    }
    static void tabl_operatos()
    {
        System.out.println("Выберите действие: \n"
                + "0 - Введите размерность массива \n"
                + "1 - Введите эементы массива \n"
                + "2 - Массив слева направо \n"
                + "3 - Массив справа налево \n"
                + "4 - Количество делителей меньше заданного значения \n"
                + "5 = Массмв только с чётными элементами \n"
                + "6 = Выход \n");
    }
    static short[] size_array(short array[])
    {
        int size;
        System.out.println("Введите размерность массива");
        Scanner input = new Scanner(System.in);
        size = input.nextInt();
        if(size > 0)
        {
            array = new short[size];//Размерность масства
        }
        else
        {
            System.out.println("Введено неверное значение");
        }
        return array;
    }
}  

