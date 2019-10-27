package kz.project.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import kz.project.web.config.ServiceLocator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@WebServlet("/WelcomeController")
public class WelcomeController extends HttpServlet {

    private final Logger logger = LoggerFactory.getLogger(WelcomeController.class);
    protected ServiceLocator serviceLocator;

    public WelcomeController() {
        super();


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        String s = "Hello world";

        out.print(s);

    }

    @GetMapping("/")
    public String index(Model model) {
        logger.debug("GO TO ME...");
        model.addAttribute("msg", getMessage());
        model.addAttribute("today", new Date());
        return "index";

    }

    private String getMessage() {
        return "Hello World";
    }

}
