package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Customer a = new Customer("Dimitri","12.30");
        Customer b = new Customer("James","13.00");
        Customer c = new Customer("Jack","11.00");
        Customer d = new Customer("Todd","15.00");
        Customer e = new Customer("Mike","14.00");
        Customer f = new Customer("Jeff","20.00");
        Customer g = new Customer("Paul","17.00");
        Customer h = new Customer("Gill","09.00");
        Customer i = new Customer("Shaun","08.00");
        Customer j = new Customer("Shelly","07.00");
        Customer k = new Customer("Tim","10.00");
        Customer l = new Customer("Raena","03.00");
        Customer m = new Customer("Dineashia","12.00");
        Customer n = new Customer("Greg","17.00");
        Customer o = new Customer("Carl","05.00");
        Customer p = new Customer("Nolan","09.30");
        Customer q = new Customer("Tyler","15.30");
        Customer r = new Customer("Mark","13.00");
        Customer s = new Customer("Sam","12.15");
        Customer t = new Customer("Jeff","11.00");

        CustomerQueue cust = new CustomerQueue();

        cust.enqueue(a);
        cust.enqueue(b);
        cust.enqueue(c);
        cust.enqueue(d);
        cust.enqueue(e);
        cust.enqueue(f);
        cust.enqueue(g);
        cust.enqueue(h);
        cust.enqueue(i);
        cust.enqueue(j);
        cust.enqueue(k);
        cust.enqueue(l);
        cust.enqueue(m);
        cust.enqueue(n);
        cust.enqueue(o);
        cust.enqueue(p);
        cust.enqueue(q);
        cust.enqueue(r);
        cust.enqueue(s);
        cust.enqueue(t);

        while(!cust.isEmpty()){
            Customer customer = cust.dequeue();
            System.out.println(customer);
        }

    }
}
