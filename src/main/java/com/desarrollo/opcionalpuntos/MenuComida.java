
package com.desarrollo.opcionalpuntos;

import java.util.Scanner;


public class MenuComida {
    public static void main(String[] args) {
int op, opH,opB;
//contadores
int contHS = 0, contHC = 0, contHJ = 0,contBC=0,contBS=0,contBF=0;
double precioH,precioB;
//acumuladores
double acumHS = 0, acumHC = 0, acumHJ = 0, acumBC=0, acumBS=0;
double acumBF=0; 
double totalHamburguesas,totalBebidas,totalByH;



Scanner sc = new Scanner(System.in);



do {
System.out.println("");
System.out.println("--MENÚ MCDONALS--");
System.out.println("1. Hamburguesas");
System.out.println("2. Bebidas");
System.out.println("3. Salir");
System.out.println("Escoja una opción: ");
op = sc.nextInt();
switch (op) {
case 1:
do {
System.out.println("");
System.out.println("--HAMBURGUESAS--");
System.out.println("1. Hamburguesa Whopper $1.50");
System.out.println("2. Hamburguesa Mcnifica $3");
System.out.println("3. Hamburguesa MCmonster $5");
System.out.println("4. Salir (Regresar menú principal)");
System.out.println("Escoja una opción: ");
opH = sc.nextInt();
switch (opH) {
case 1:
precioH = 1.50;
//contador
contHS = contHS + 1; //contHS++;
//acumulador
acumHS = acumHS + precioH;
System.out.println("HAS COMPRADO UNA HAMBURGUESA SIMPLE");
break;
case 2:

precioH = 3;
//cpntador
contHC++;
//acumulador
acumHC = acumHC + precioH;
System.out.println("HAS COMPRADO UNA HAMBURGUESA COMPLETA");
break;
case 3:
precioH = 5;
contHJ++;
//acumulador
acumHJ = acumHJ + precioH;
System.out.println("HAS COMPRADO UNA HAMBURGUESA JUMBO");
break;



}
} while (opH != 4);
break;
case 2:
        do {
System.out.println("");
System.out.println("--BEBIDAS--");
System.out.println("1. Coca-Cola personal $0.90");
System.out.println("2. Sprite personal $0.80");
System.out.println("3. Fanta personal $0.75");
System.out.println("4. Salir (Regresar menú principal)");
System.out.println("Escoja una opción: ");
opB=sc.nextInt();
switch (opB) {
case 1:
precioB = 0.90;
//contador
contBC = contBC + 1; //contHS++;
//acumulador
acumBC = acumBC + precioB;
System.out.println("HAS COMPRADO UNA COCA-COLA");
break;
case 2:

precioB = 0.80;
//cpntador
contBS++;
//acumulador
acumBS = acumBS + precioB;
System.out.println("HAS COMPRADO SPRITE");
break;
case 3:
precioB = 0.75;
contBF++;
//acumulador
acumBF = acumBF + precioB;
System.out.println("HAS COMPRADO UNA FANTA");
break;
}
} while (opB != 4);
break;
case 3:
System.out.println("GRACIAS POR UTILIZAR NUESTRO PROGRAMA");
break;
default:
System.out.println("OPCIÓN INVÁLIDA");
}
} while (op != 3);

totalHamburguesas=acumHS+acumHC+acumHJ;



System.out.println("");
System.out.println("--DETALLE COMPRA--");
System.out.println("Hamburguesas");
System.out.println("Simples: " + contHS + " Total: $" + acumHS);
System.out.println("Completas: " + contHC + " Total: $" + acumHC);
System.out.println("Jumbo: " + contHJ + " Total: $" + acumHJ);
System.out.println("");
System.out.println("----------------------------");
System.out.println("Total Pagar: $"+totalHamburguesas);
totalBebidas=acumBC+acumBS+acumBF;
System.out.println("");
System.out.println("--DETALLE COMPRA--");
System.out.println("Bebidas");
System.out.println("Coca-cola: " + contBC + " Total: $" + acumBC);
System.out.println("Sprite: " + contBS + " Total: $" + acumBS);
System.out.println("Fanta: " + contBF + " Total: $" + acumBF);
System.out.println("");
System.out.println("----------------------------");
System.out.println("Total Pagar: $"+totalBebidas);
totalByH=totalHamburguesas+totalBebidas;
        System.out.println("VALOR TOTAL: "+totalByH);
}
}
