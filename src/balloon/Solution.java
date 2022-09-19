package balloon;

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
}
