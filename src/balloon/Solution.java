package balloon;

import java.io.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static int solution(String s){
        int res = 0;
        String k = s.toUpperCase();
        StringBuilder text =  new StringBuilder();
        text.append(k);
        StringBuilder balon =  new StringBuilder();
        balon.append("BALLOON");
        int chek1 = text.length()/balon.length();
        boolean chek2 = true;
        while(chek1>0 && chek2) {
            for(int i=0; i < balon.length();i++) {
                for(int j=0; j<text.length();j++) {
                    if(balon.charAt(i) == text.charAt(j) && (!Character.toString(balon.charAt(i)).equals("-") || !Character.toString(text.charAt(j)).equals("-") )) {
                        balon.replace(i, i+1, "-");
                        text.replace(j, j+1, "");
                    }
                }
            }
            if(balon.toString().equals("-------")) {
                balon.replace(0, 7, "BALLOON");
                res++;
            }else {
                chek2 = false;
            }
        }
        return res;
    }

    public static int solution2(String s){
        int b=0,a=0,l=0,o=0,n=0;
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
           if(c == 'B'){
               b++;
           } else if (c == 'A') {
               a++;
           } else if (c =='L') {
               l++;
           } else if (c == 'O') {
               o++;
           } else if (c == 'N') {
               n++;
           }
        }
        return Math.min(Math.min(b, a), Math.min(Math.min(l/2, o/2), n));
    }


    public static void readAndWriteFromFile(String in, String out){

        try {
            URL path = Solution.class.getResource(in);
            File file = new File(path.getFile());
            File file1 = new File(out);
            PrintWriter writer = new PrintWriter(new FileWriter(file1,true));
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()) {
                writer.println(solution(sc.nextLine()));
            }
            writer.close();
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("nema fajla");
        } catch (IOException e) {
            System.out.println("greska prilikom upisa");
        }catch (NullPointerException e){
            System.out.println("bad path");
        }
    }







}
