/*  
 *
 *  	WAP in which students should enter marks of 5 different subjects.If all subjects having
 *   	above passing marks add them and provide to switch case to print grades(first class,
 *   	second class). If student get fail in any subject program should print "You failed in 
 *   	exam."
 *
 */

import java.io.*;


class Q1_Exam_Grades{

		public static void main(String[] args) throws IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the marks of Subjects : ");
			
			System.out.println("Marathi : ");
			int mar = Integer.parseInt(br.readLine());

			System.out.println("Hindi : ");
			int hin = Integer.parseInt(br.readLine());

			System.out.println("English : ");
			int eng = Integer.parseInt(br.readLine());

			System.out.println("SST : ");
			int sst = Integer.parseInt(br.readLine());

			System.out.println("Science : ");
			int sci = Integer.parseInt(br.readLine());

			double avg = 0;

			if( mar<35 || hin<35 || eng<35 || sst<35 || sci<35)
				System.out.println("You failed in exam.");
			else{

				avg = ((mar + hin + eng + sst + sci)/5);
			}

			System.out.println("Avg is  : " + avg);


			char ch;

			if( avg > 75 )
				ch = 'A';
			else if( avg > 60 )
				ch = 'B';
			else if( avg > 50 )
				ch = 'C';
			else if( avg >= 35 ) 
				ch = 'D';
			else 
				ch = 'F';

			switch(ch){


				case 'A': System.out.println("You scored Distinction");
					  break;


				case 'B': System.out.println("You scored First Class");
					  break;

					  
				case 'C': System.out.println("You scored Second Class");
					  break;

					  
				case 'D': System.out.println("You scored Third Class");
					  break;

					  
				case 'F': System.out.println("You failed in Exam");
					  break;

					  
   }
   }
   }


