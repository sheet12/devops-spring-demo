package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
       /* Student student = (Student) context.getBean("student");
        System.out.println(student);

        Student student1 = (Student) context.getBean("student1");
        System.out.println(student1);

        Student student2 = context.getBean("student2",Student.class);
        System.out.println(student2);*/

        /*Employee employee = context.getBean("employee",Employee.class);
        System.out.println(employee);

        Customer customer= context.getBean("customer", Customer.class);
        System.out.println(customer);*/

        /*Users user = context.getBean("user", Users.class);
        System.out.println(user);*/

        /*Product product = context.getBean("product", Product.class);
        System.out.println(product);*/

        Calculator calculator= context.getBean("calculator", Calculator.class);
        calculator.sum();
    }
}
