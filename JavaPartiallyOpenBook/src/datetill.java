package javapartialyopenbook2;

public class datetill {

	public static  String[] strMonths = {
			"January", "February", "March", "April", "May", "June",
			"July", "August", "September", "October", "November", "December"
		};

		public static int[] daysInMonths = {
			31, 28, 31, 30, 31, 30, 31 , 31, 30, 31, 30, 31
		};

		public static String[] daysInWeek = {
			"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
		};


		public static void main(String[] args) {
			System.out.println(isLeapYear(1900));
			System.out.println(isLeapYear(2000));
			System.out.println(isLeapYear(2011));
			System.out.println(isLeapYear(2012));

			System.out.println();

			System.out.println(isValidDate(2012, 2, 29));
			System.out.println(isValidDate(2011, 2, 29));
			System.out.println(isValidDate(2099, 12, 31));
			System.out.println(isValidDate(2099, 12, 32));

			System.out.println();

			System.out.println(getDayOfWeek(1982, 4, 24));
			System.out.println(getDayOfWeek(2000, 1, 1));
			System.out.println(getDayOfWeek(2054, 6, 19));
			System.out.println(getDayOfWeek(2012, 2, 17));

			System.out.println();

			System.out.println(printDate(2012, 2, 14));
		}

		public static boolean isLeapYear(int year) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				return true;
			}

			return false;
		}

		public static boolean isValidDate(int year, int month, int date) {
			if (year < 1 || year > 9999) {
				return false;
			} 

			if (month < 1 || month > 12) {
				return false;
			}

			int lastDayOfMonth = daysInMonths[month - 1];
			if (isLeapYear(year) && month == 2) {
				lastDayOfMonth++;
			}

			if (date < 1 || date > lastDayOfMonth) {
				return false;
			} 

			return true;
		}

		public static int getDayOfWeek(int year, int month, int date) {
			int dayOfWeek;

			int centuryNum;
			int century = year / 100;
			int yearNumber = year % 100;

			if (century % 4 == 0) {
				centuryNum = 6;
			} else if ((century + 1) % 4 == 0) {
				centuryNum = 0;
			} else if ((century + 2) % 4 == 0) {
				centuryNum = 2;
			} else {
				centuryNum = 4;
			}

			int[] monthTable = {0,3,3,6,1,4,6,2,5,0,3,5};
			int monthTableValue = monthTable[month - 1];

			if (isLeapYear(year)) {
				if (month == 1) {
					monthTableValue = 6;
				} else if (month == 2) {
					monthTableValue = 2;
				}
			}

			dayOfWeek = (centuryNum + yearNumber + (yearNumber / 4) + monthTableValue + date) % 7;
			return dayOfWeek;
		}

		public static String printDate(int year, int month, int date) {
			String dateStr;
			String dayOfWeek = daysInWeek[getDayOfWeek(year, month, date)];
			String monthOfYear = strMonths[month - 1];

			dateStr = dayOfWeek + " " + date + " " + monthOfYear + " " + year;

			return dateStr; 
		}

}
