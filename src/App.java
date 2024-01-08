import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int quadrado = 0;
        sc.close();

        for(int i = 0; i <= a; i++){
            if(i%2 == 0 && i > 0){
                quadrado = i * i;
                System.out.println(i +"^2" +" = " +quadrado);
            }
        }
    }
}
