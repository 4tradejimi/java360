package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Scanner;

import static balloon.Solution.readAndWriteFromFile;

@WebServlet(urlPatterns = "/odradi")
public class MyServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, FileNotFoundException {
        PrintWriter out = resp.getWriter();

        String absPathToINPUT = "C:\\Users\\adavidovic\\Desktop\\in.txt";
        String absPathToOUTPUT = "C:\\Users\\adavidovic\\Desktop\\out.txt";
        try {

            readAndWriteFromFile(absPathToINPUT, absPathToOUTPUT);
            File k = new File(absPathToOUTPUT);
            File u = new File(absPathToINPUT);
            Scanner sc = new Scanner(k);
            out.println("output:");
            while (sc.hasNextLine())
                out.println(sc.nextLine());
            out.println("-----------------");
            sc.close();
            Scanner sc1 = new Scanner(u);
            out.println("input:");
            while (sc1.hasNextLine())
                out.println(sc1.nextLine());
            out.println("+++++++++++++++++++");
            sc1.close();

        }catch (FileNotFoundException e){
            out.print("Greska los path za fajl");
        }

    }


}
