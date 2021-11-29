package ru.gb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FirstServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(FirstServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().printf("hello world spring");
        resp.getWriter().printf("hello world spring");
        resp.getWriter().printf("hello world spring");

        Product[] products =  {
                new Product(1,"product 1",111),
                new Product(2,"product 2",222),
                new Product(3,"product 3",333),
                new Product(4,"product 4",444),
                new Product(5,"product 5",555),
                new Product(6,"product 6",666),
                new Product(7,"product 7",777),
                new Product(8,"product 8",888),
                new Product(9,"product 9",999),


        };
        for(Product product : products) {
            resp.getWriter().println(product);
        }


    }
}