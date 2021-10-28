package it.unical.demacs.ProvaIngSw_213571;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class MyListUtil {
	
   public List<Integer> sort(List<Integer> list, int order){
	
	   if( order == 0 ) {
		   
		   int n = list.size();
		   
		   boolean scambio = true;
		   
		   while( scambio ) {
			   
			   scambio = false;
			   
			   for( int i = 0; i<n-1; i++ ) {
			   
				   if( list.get(i) > list.get(i+1) ) {
					   scambio = true;
					   int temp = list.get(i);
					   list.set( i , list.get(i+1) );
					   list.set(i+1, temp );
				   }
			   }
			   
		   }
		   
		   //list.sort(null);
	   }
	   else if( order == 1 ) {
		   
		   int n = list.size();
		   
		   boolean scambio = true;
		   
		   while( scambio ) {
			   
			   scambio = false;
			   
			   for( int i = 0; i<n-1; i++ ) {
			   
				   if( list.get(i) < list.get(i+1) ) {
					   scambio = true;
					   int temp = list.get(i);
					   list.set( i , list.get(i+1) );
					   list.set(i+1, temp );
				   }
			   }
			   
		   }
	   
		  /*
		   list.sort( new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2)*-1;
				
			}
	   	  }); */
		  
	   }
	   
	   System.out.println(list);
	   
	   return list;  
   }
   
   /*
   public static void main(String[] args) {
	
	   List<Integer> l = new ArrayList<Integer>();
	   
	   l.add(3);
	   l.add(1);
	   l.add(25);
	   l.add(5);
	   
	   System.out.println( sort( l,0 ));
	   System.out.println( sort( l,1 ));
   }*/

}
