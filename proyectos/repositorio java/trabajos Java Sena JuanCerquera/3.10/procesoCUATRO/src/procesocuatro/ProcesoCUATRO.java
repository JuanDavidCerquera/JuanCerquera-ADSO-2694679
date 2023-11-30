/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procesocuatro;

import java.util.Scanner;

/**
 *
 * @author Ambiente 209-1
 */
public class ProcesoCUATRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // pepe tiene 5 manzanas y cada vez que se sube al arbol puede bajar una manzana
        // cuantas manzanas tendria si le dejan subirse 10 veces al arbol
        int manzanas = 5;
        int manzanasfor = 5;
        int subida = 10;

        while (subida != 0) {
            manzanas++;
            subida--;
        }
        System.out.println("pepe tiene " + manzanas + "mazanas (esto es con el while)");
        for (int subidas = 10; subidas != 0; subidas--) {
            manzanasfor++;
        }
        System.out.println("pepe tiene " + manzanas + "mazanas (esto es con el for)");

        // Juan tiene 2 pcs, y cada vez que el primer pc a terminado una tarea, el
        // segundo pc, puede haber realizado3. necesito saber cuantas tareas realizaron
        // los pcs en una hora. teniendo el cuenta que el primer pc puede hacer 10
        // tareas por hora.
        int trabpc1 = 0;
        int trabpc2 = 0;
        for (int a = 0; a < 10; a++) {
            trabpc1++;
            for (int b = 0; b < 3; b++) {
                trabpc2++;
            }
        }
        System.out.println("tabajos pc 1 :" + trabpc1 + " | trabajo pc 2 : " + trabpc2);
        // diego tiene 8millones y desea invertirlo en un cdt a un 13% de efectivo anual
        // el desea invertirlo mes a mes durante cinco años al completar cada mes
        // retira lo invertido mas los interesse ganados, le suma 3 millones y los
        // vuelve a invertir para
        // el otro mes cuanto dinero tendra en un año
        // porcentaje mensual es 1.0833333
        // plata
        double porc = 13 / 12, porcplata;
        int mestotl = 0;
        // = (100 * 20) / 100;

        double plata = 8, cient = 0, decimas = 0;

        int millon = 0;
        for (int años = 0; años < 5; años++) {
            System.out.println("año :" + (años + 1));
            for (int mes = 0; mes < 12; mes++) {
                mestotl++;
                porcplata = (plata * porc) / 100;
                plata = plata + porcplata + 3;
                cient = plata * 1000000;
                millon = (int) cient;
                decimas = (cient - millon) * 10;

                System.out.println("al mes " + mestotl + " tiene " + millon + "," + (int) decimas);
            }
        }

        // /*
        // Calcular el promedio de masa de aire de los neumáticos de n vehículos que
        // están en compostura en un servicio de alineación y balanceo. Los vehículos
        // pueden ser motocicletas o automóviles.
        // */
        // double volumen, presion, temperatura, masa, masa2;
        // int vehiculos;

        // Scanner scan = new Scanner(System.in);
        // System.out.println(" TIPO DE VEHICULOS");
        // System.out.println(" 1.MOTO");
        // System.out.println(" 2.CARRO");

        // System.out.println("");
        // masa = 0;
        // masa2 = 0;
        // do {
        // System.out.println("SELECCIONE SU VEHICULO");

        // vehiculos=scan.nextInt();
        // switch (vehiculos) {
        // case 1:
        // System.out.println(" MOTOS");
        // System.out.println("INGRESE PRECION");
        // presion = scan.nextDouble();
        // System.out.println("INGRESE VOLUMEN");
        // volumen = scan.nextDouble();
        // System.out.println("INGRESE TEMPERATURA");
        // temperatura = scan.nextDouble();
        // masa = (presion * volumen) / (0.37 * (temperatura + 460));
        // System.out.println("la masa es " + masa);
        // break;

        // case 2:
        // System.out.println(" CARROS");
        // System.out.println("INGRESE PRECION");
        // presion = scan.nextDouble();
        // System.out.println("INGRESE VOLUMEN");
        // volumen = scan.nextDouble();
        // System.out.println("INGRESE TEMPERATURA");
        // temperatura = scan.nextDouble();
        // masa = (presion * volumen) / (0.37 * (temperatura + 460));
        // System.out.println("la masa es " + masa);
        // break;
        // default:
        // System.out.println("NO TENEMOS ESE TIPO DE VEHICULO");
        // }

        // masa2= (masa2+masa)/2;
        // System.out.println("EL PROMEDIO ES " + masa2 );
        // System.out.println("");
        // } while (vehiculos == 1 || vehiculos == 2 );
    }

}
