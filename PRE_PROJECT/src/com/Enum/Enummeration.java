package com.Enum;
import java.util.Enumeration;
import java.util.Vector;

public class Enummeration {
			public static void main(String[] args) {
				Vector vec=new Vector();
				vec.add(10);
				vec.add("dcwsv");
				vec.add('a');
				vec.add(555);
				System.out.println();
				Enumeration e=vec.elements();
				while (e.hasMoreElements()) {
					System.out.println(e.nextElement());
					
				}
				
				// TODO Auto-generated method stub

			}

		}
