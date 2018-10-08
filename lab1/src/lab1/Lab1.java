
package lab1;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Lab1 
{

    
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
                array = size_array_random(array);
                break;
            case 2:
                mas_in(array,size);
                break;
            case 3:
                mas_left(array,size);
                break;
            case 4:
                mas_right(array,size);
                break;
            case 5:
                mas_div(array,size);
                break;
            case 6: 
                mas_nechet(array,size);
                break;
            case 7:
                break;
            default:
                System.out.println("Error");
          }
         
        }while(select != 7);
    }
    
    static short[] size_array(short array[])//Выдиление размерности массмва
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
    
    static short[] size_array_random(short array[])//Выделение rand зависимости
    {       
        Random rand = new Random();
        int size = rand.nextInt(10);
        array = new short[size];
        System.out.println(size +"-Размерность массива");
        return array;
    }

    static void mas_in(short array[],int size)//Введение элементов в массив
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите элементы массива");
        for(int index = 0; index < array.length; index++)
        {
            array[index] =input.nextShort();
        }
        System.out.println(Arrays.toString(array));
    }
    
    static void mas_left(short array[],int size)//Массив слева направо
    {
        System.out.println(Arrays.toString(array));
    }
    
    static void mas_right(short array[],int size)//Инверсивный вывод массива 
    {
        System.out.println("Массив справа налево");
        int index2 = 0;
        int size2 = array.length;
        short[] array2 = new short[size2];
        for(int index = array.length - 1; index !=-1; index--){
           array2[index2] = array[index];
           index2 ++;
        }
        System.out.println(Arrays.toString(array2));
    }
    
    static void mas_div(short array[],int size)//Количество элементов,.делители которых меньше заданного значения
    {
        Scanner in = new Scanner(System.in);
        int temp = 0;//Колчитесво элементов,делители которых меньше заданного значения
        int dividers = 0;
        System.out.println("Введите делитель");
        int div = in.nextInt();// Введение делителя
        for(int index = 0;index < array.length ; index++)
        {
           for(short c = 1;c < array[index];c++)
           {
               if(array[index]/c == 0)
               {
                  dividers++;//На
               }
           }
           if(dividers < div)
           {
               temp++;
           }    
        }
        System.out.println("Количество элементов,.делители которых меньше заданного значения = " + temp);
    }
    
    static void mas_nechet(short array[],int size)//Только чётные элементы
    {
        System.out.println("Массмв только с чётными элементами");
        for(int index = 0; index < array.length; index++)
        {
            
            int k = 0;//Остаток от деления
           int c = array[index];//принимает значения массива
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
        System.out.println(Arrays.toString(array));
    }
    
    static void tabl_operatos()//Вывод интерфейса
    {
        System.out.println("Выберите действие: \n"
                + "0 - Введите размерность массива \n"
                + "1 - Рандомная размерность \n"
                + "2 - Введите эементы массива \n"
                + "3 - Массив слева направо \n"
                + "4 - Массив справа налево \n"
                + "5 - Количество делителей меньше заданного значения \n"
                + "6 = Массмв только с чётными элементами \n"
                + "7 = Выход \n");
    }
}  

