package lk.ijse.dep.pos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServlet;

@SpringBootApplication
public class AppInitializer extends HttpServlet {
    public static void main(String[] args) {
        SpringApplication.run(AppInitializer.class,args);
    }
}
