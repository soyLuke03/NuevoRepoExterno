package com.calc.utils;

public class CollectionUtils {
	


	
	/**
	 * Este método se utiliza para mostrar por pantalla un array de <b>objs</b>.
	 * @param objs
	 * @return Devuelve un StringBuilder con el array.
	 */
	public static String printCol(Object[] objs) {
		
		StringBuilder sb = new StringBuilder();
		for (Object obj : objs) {
			sb.append(obj.toString()).append(System.lineSeparator());
		}
		return sb.toString();
	}
	
	/**
	 * Este método sirve para eliminar los <b>nulls</b> del array que recibe como parámetro
	 * @param col
	 * @return Devuelve el mismo array pero eliminando los Nulls.
	 */
	public static Object[] deleteNulls(Object[] col) {
		int cont=0;
		if (col!=null) {
			for (Object o : col) {
				cont += o !=null ? 1: 0;
				}
			}
		Object[] col2 = new Object[cont];
		
		cont=0;
		for (Object o : col) {
			if (o!=null){
				col2[cont++]=o;
			}
		}
		return col2;
	}
	
}
