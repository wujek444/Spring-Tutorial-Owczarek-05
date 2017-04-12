package pl.wojcik.jakub.springtutorial;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
//		Locale locale = Locale.getDefault(); //zrobione w Springu
//		Calendar calendar = GregorianCalendar.getInstance(locale); //zrobione w Springu
//		DateFormat formatter = SimpleDateFormat.getInstance(); //zrobione w Springu
//		System.out.println(formatter.format(calendar.getTime()));
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Calendar calendar = context.getBean("calendar", Calendar.class); //od razu wskazuję na klasę (nie trzeba rzutować)
//		Calendar calendar = (Calendar) context.getBean("calendar"); //można też podać samo id beana i rzutować
		SimpleDateFormat formatter = context.getBean("formatter", SimpleDateFormat.class);
		System.out.println(formatter.format(calendar.getTime()));
	}

}
