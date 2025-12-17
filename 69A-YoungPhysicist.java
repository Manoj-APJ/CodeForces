import java.util.*;
public class Young_physicist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int x = 0;
        int y = 0;
        int z = 0;
        while(s-->0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            x=x+a;
            y=y+b;
            z=z+c;
        }


        if(x==0 && y==0 && z==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        scanner.close();
    }
}
        