package run;

import interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        System.out.println("Singleton scope: ");
        footballCoachScope(context);

        System.out.println("Prototype scope: ");
        myCoachScope(context);

        //close the context
        context.close();
    }
    public static void myCoachScope(ClassPathXmlApplicationContext context) {
        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach",Coach.class);

        Coach alphaCoach = context.getBean("myCoach",Coach.class);

        //check if they are the same

        boolean result = (theCoach == alphaCoach);

        // print out the results
        System.out.println("\nPointing to the same object: " + result);

        System.out.println("\nMemory location for theCoach: " + theCoach);

        System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");

    }
    public static void footballCoachScope(ClassPathXmlApplicationContext context) {
        //retrieve bean from spring container
        Coach theCoach = context.getBean("footballCoach",Coach.class);

        Coach alphaCoach = context.getBean("footballCoach",Coach.class);

        //check if they are the same

        boolean result = (theCoach == alphaCoach);

        // print out the results
        System.out.println("\nPointing to the same object: " + result);

        System.out.println("\nMemory location for theFootballCoach: " + theCoach);

        System.out.println("\nMemory location for alphaFootballCoach: " + alphaCoach + "\n");
    }
}

