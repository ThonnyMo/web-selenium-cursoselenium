package com.javabasics;

public class ArrayStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//   ARREGLO UNIDIMENSIONAL
		
//		String []nombres = new String[4];
//		
//		nombres[0] = "Ricardo";
//		nombres[1] = "Ivan";
//		nombres[2] = "Pepe";
//		nombres[3] = "Juan";
//		
//		System.out.println(nombres[3]);
//		
		
		
		
		//  ARREGLO BIDIMENSIONAL
		
		String [][]persona = new String[4][4];
		
		persona[0][0] = "Ana";
		persona[0][1] = "Tester Jr";
		persona[1][0] = "Brayan";
		persona[1][1] = "Sr Tester";
		persona[2][0] = "Carlos";
		persona[2][1] = "Sr Tester";
		persona[3][0] = "Cristian";
		persona[3][1] = "Sr Tester";
		
		System.out.println("El nombre es: " + persona[2][0] + " y su Rol es: " + persona[2][1]);
		
		
	}

}
