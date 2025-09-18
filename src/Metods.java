import java.util.Random;
import java.util.Scanner;

public class Metods
{
    public int sumLastNums(int x)
    {
        int Summa;
        int last, penultimate;
        last = x % 10;
        penultimate = x/10%10;
        Summa = last + penultimate;
        return Summa;
    }
    public boolean isPositive(int x)
    {
        if (x > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public  boolean isUpperCase(char x)
    {
        return (x >= 'A' && x <= 'Z');
    }
    public boolean isDivisor(int a, int b)
    {
        if((a % b == 0 && b!= 0) || (b % a == 0 && a!=0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int lastNumSum(int a, int b)
    {
        return (a%10) + (b%10);
    }
    public double safeDiv(int x, int y)
    {
        double result;
        if(y!= 0)
        {
            result = x/y;
        }
        else
        {
            return 0;
        }
        return result;
    }
    public  String makeDecision(int x, int y)
    {
        if (x > y)
        {
            return (x + ">" + y);
        }
        if(x < y)
        {
            return (x + "<" + y);
        }
        else
        {
            return (x + "==" + y);
        }
    }
    public boolean sum3(int x, int y, int z)
    {
        if((x + y) == z)
        {
            return true;
        }
        else if((x + z) == y)
        {
            return true;
        }
        else if((y + z) == x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String age(int x)
    {
        int last = x % 10;
        if(last == 1 && x != 11)
        {
            return (x + " год");
        }
        if((last == 2 || last ==3 || last == 4) && x != 12 && x!= 13 && x!= 14)
        {
            return (x + " года");
        }
        else
        {
            return (x + " лет");
        }
    }
    public void printDay(String x)
    {

        switch (x)
        {
            case "понедельник":
            {
                System.out.println("понедельник");
            }
            case "вторник":
            {
                System.out.println("вторник");
            }
            case "среда":
            {
                System.out.println("среда");
            }
            case "четверг":
            {
                System.out.println("четверг");
            }
            case "пятница":
            {
                System.out.println("пятница");
            }
            case "суббота":
            {
                System.out.println("суббота");
            }
            case "воскресенье":
            {
                System.out.println("воскресенье");
                break;
            }
            default:
            {
                System.out.println("это не день недели!");
                break;
            }
        }

    }
    public String reverseListNums(int x)
    {
        String result = "";
        if(x > 0)
        {
            for(int i=x; i>=0; i--)
            {
                result += i + " ";
            }
        }
        else
        {
            for(int i=x; i<=0; i++)
            {
                result += i + " ";
            }
        }
        return result;
    }
    public int pow(int x, int y)
    {
        int result=1;
        for(int i = 0; i<y; i++)
        {
            result*= x;
        }
        if(y<0)
        {
            return 0;
        }
        return result;
    }
    public boolean equalNum(int x)
    {
        int last, penultimate;
        last = x%10;
        x=x/10;
        while(x>0)
        {
            penultimate = x%10;
            if(penultimate != last)
            {
                return false;
            }
            x = x/10;
        }
        return true;
    }
    public void leftTriangle(int x)
    {
        for(int i = 1; i<=x; i++)
        {
            for (int j = 1; j<= i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public void guessGame()
    {
        int x,y, count=0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        y = random.nextInt(0,9);
        do
        {
            System.out.println("Введите число от 1 до 9: ");
            x = scanner.nextInt();
            count++;
            if(x == y)
            {
                System.out.println("Вы угадали!");
            }
            if(x!=y)
            {
                System.out.println("Вы не угадали загаданное число, попробуйте снова ");
            }
        }while (x!=y);
        System.out.println("Число попыток: "+ count);
    }
    public int findLast(int[] arr, int x)
    {
       for(int i=arr.length-1; i>=1; i--)
       {
           if(arr[i] == x)
           {
               return i;
           }
       }
       return -1;
    }
    public int[] add (int[] arr, int x, int pos)
    {
        if(pos<0 || pos > arr.length)
        {
            System.out.println("Ошибка, индекс не может быть отрицательным или больше длины массива! ");
            return arr;
        }
        int[] add = new int[arr.length + 1];
        for (int i = 0; i < pos; i++)
        {
            add[i] = arr[i];
        }
        add[pos] = x;
        for(int i = pos; i < arr.length; i++)
        {
            add[i + 1] = arr[i];
        }
        return add;
    }
    public void reverse (int[] arr)
    {
        for(int i = arr.length-1; i>=0; i--)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    public int[] concat(int[] arr1, int[]arr2)
    {
        int[] concat = new int[arr1.length + arr2.length];
        for(int i = 0; i<arr1.length; i++)
        {
            concat[i] = arr1[i];
        }
        for(int i = 0; i<arr2.length; i++)
        {
            concat[i+arr1.length]= arr2[i];
        }
        return concat;
    }
    public int[] deleteNegative (int[] arr)
    {
        int count=0;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]>=0)
            {
                count++;
            }
        }
        int[] arr2 = new int[count];
        int j = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] >= 0)
            {
                arr2[j] = arr[i];
                j++;
            }
        }
        return arr2;
    }
}
