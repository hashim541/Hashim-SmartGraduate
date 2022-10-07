import java.util.Scanner;
public class day1_ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r=new Scanner(System.in);
		System.out.println("enter the year : ");
		int year =r.nextInt();
		System.out.println("enter the month : ");
		int month =r.nextInt();
		switch(month) {
		case 1:
			System.out.println("JANUARY - 31 DAYS");
			break;
		case 2:
			if(year%4==0) {
				System.out.println("FEBRAURY - 29 DAYS \n"+year+" IS A LEAP YEAR");
				break;
			}else {
				System.out.println("FEBRAURY - 29 DAYS");
				break;
			}
		case 3:
			System.out.println("MARCH - 31 DAYS");
			break;
		case 4:
			System.out.println("APRIL - 30 DAYS");
			break;
		case 5:
			System.out.println("MAY - 31 DAYS");
			break;
		case 6:
			System.out.println("JUNE - 30 DAYS");
			break;
		case 7:
			System.out.println("JULY - 31 DAYS");
			break;
		case 8:
			System.out.println("AUGUST - 31 DAYS");
			break;
		case 9:
			System.out.println("SEPTEMBER - 30 DAYS");
			break;
		case 10:
			System.out.println("OCTOBER - 31 DAYS");
			break;
		case 11:
			System.out.println("NOVEMBER - 30 DAYS");
			break;
		case 12:
			System.out.println("DECEMBER - 31 DAYS");
			break;
		
		}

	}

}
