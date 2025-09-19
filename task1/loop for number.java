public class task2 {
     public static void main(String[] args) {
       // 1*1 - 1 *2  - 1*3 - 1*4 - 1*5
       // 2*1 - 2 *2  - 2*3 - 2*4 - 2*5
       // 3*1 - 3 *2  - 3*3 - 3*4 - 3*5
       // 4*1 - 4 *2  - 4*3 - 4*4 - 4*5
    for (int i = 1; i <= 4; i++) {
        for (int x = 1; x <=5; x++) {
            System.out.print(i + "*" + x + "=" + (i*x) + " ");
        }
        System.out.println();
    }
     }

}
