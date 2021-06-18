import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class age_wishes_of_user {
	public static void main(String[] args) {
		DateFormat get_date = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		String curr_date = get_date.format(date);
		Scanner my_scanner = new Scanner(System.in);
		System.out.println("Enter Your Date Of Birth: ");
		System.out.print("Your Born Year : ");
		int year = my_scanner.nextInt();
		System.out.print("Your Born Month : ");
		int month = my_scanner.nextInt();
		System.out.print("Your Born Day : ");
		String day = my_scanner.next();
		if ((month > 0 && month <= 12) && (Integer.parseInt(day) > 0 && Integer.parseInt(day) <= 31)) {
			String str_mon = (month < 10) ? ("0" + String.valueOf(month)) : String.valueOf(month);
			String user_dob = year + "/" + str_mon + "/" + day;
			String date_split[] = curr_date.split("/");
			String curr_year = date_split[0];
			String curr_month = date_split[1];
			String curr_day = date_split[2];
			int user_age = Integer.parseInt(curr_year) - year;
			int user_age_mon = (Integer.parseInt(str_mon) > Integer.parseInt(curr_month))
					? Integer.parseInt(str_mon) - Integer.parseInt(curr_month)
					: Integer.parseInt(curr_month) - Integer.parseInt(str_mon);
			String msg = ((user_age > 1) ? (user_age + " Years and ") : (user_age + " Year and "))
					.concat((user_age_mon > 1) ? (user_age_mon + " Months Old") : (user_age_mon + " Month Old"));
			if (curr_date.equals(user_dob)) {
				System.out.println("Welcome to the World..! Little One =)");
			} else if ((curr_month.equals(str_mon) && curr_day.equals(day)) && (user_age < 100 && user_age > 0)) {
				System.out.println("Happy Birthday Beautiful..!!! :-)" + " You are " + msg);
			} else if (year == 0 || month == 0 || Integer.parseInt(day) == 0 || user_age < 0) {
				System.out.println("Error User Not yet Born");
			} else if (user_age > 100 || user_age < 0) {
				System.out.printf("Error user is too old enough %d years, You r centenarian.. /_\\", user_age);
			} else {
				System.out.println("You are " + msg);
			}
		} else {
			System.out.println("Error, Something gone wrong!!! Try Again");
		}
	}
}

