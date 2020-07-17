import java.util.Arrays;

public class Sahmate {
    public static void main(String[] args) {
      String [][] desk = new String[8][8];
      for (int i=0; i<desk.length; i++){
          for (int j=0; j<desk.length; j++){
              if (i%2 ==0) {
                    desk[i][j] = j%2 == 0 ? "W":"B";
              }else{
                    desk[i][j] = j%2 == 0 ? "B":"W";
              }
            }
        }
        for (int i=0; i<8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(desk[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(desk));
    }
}
