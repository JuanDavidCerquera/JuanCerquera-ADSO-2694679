package View;

import java.util.Scanner;

import Class_.CLass1_3_10;
import Class_.CLass1_3_11;
import Class_.CLass1_3_3;
import Class_.CLass1_3_4;
import Class_.CLass1_3_5;
import Class_.CLass1_3_6;
import Class_.CLass1_3_7;
import Class_.CLass1_3_8;
import Class_.CLass1_3_9;
import Class_.Class1_3_2;

public class App {
    public static void main(String[] args) throws Exception {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        Class1_3_2 num2 = new Class1_3_2();
        CLass1_3_3 num3 = new CLass1_3_3();
        CLass1_3_4 num4 = new CLass1_3_4();
        CLass1_3_5 num5 = new CLass1_3_5();
        CLass1_3_6 num6 = new CLass1_3_6();
        CLass1_3_7 num7 = new CLass1_3_7();
        CLass1_3_8 num8 = new CLass1_3_8();
        CLass1_3_9 num9 = new CLass1_3_9();
        CLass1_3_10 num10 = new CLass1_3_10();
        CLass1_3_11 num11 = new CLass1_3_11();

        System.out.println("bien venido/a a mi programa");
        System.out.println("Elige la opcion deseada\n" + //
                "1.  terminar el programa \n" + //
                "2.  Class1_3_2 \n" + //
                "3.  CLass1_3_3 \n" + //
                "4.  CLass1_3_4 \n" + //
                "5.  CLass1_3_5 \n" + //
                "6.  CLass1_3_6 \n" + //
                "7.  CLass1_3_7 \n" + //
                "8.  CLass1_3_8 \n" + //
                "9.  CLass1_3_9 \n" + //
                "10. CLass1_3_10\n" + //
                "11. CLass1_3_11");
        do {
            System.out.println("elija una opcion");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("usted a elegido terminar el programa");
                    break;
                case 2:
                    num2.Lectura();
                    num2.Condicional();
                    break;
                case 3:
                    num3.Lectura();
                    num3.Condicional();
                    break;
                case 4:
                    num4.Lectura();
                    num4.Condicional();
                    break;
                case 5:
                    num5.Lectura();
                    num5.Condicional();
                    break;
                case 6:
                    num6.Lectura();
                    num6.Condicional();
                    break;
                case 7:
                    num7.Lectura();
                    num7.Condicional();
                    break;
                case 8:
                    num8.Lectura();
                    num8.Condicional();
                    break;
                case 9:
                    num9.Lectura();
                    num9.Condicional();
                    break;
                case 10:
                    num10.Lectura();
                    num10.Condicional();
                    break;
                case 11:
                    num11.Lectura();
                    num11.Condicional();
                    break;
                default:
                    System.out.println("opcion no valida");
                    System.out.println("vuelve a intentar");
            }
        } while (opcion != 1);
        sc.close();
    }
}
