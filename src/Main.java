public class Main {
    public static void main(String[] args) {
        Integer i = 0;
        while (i < 100) {
            if (i % 4 != 0) {
                i++;
                continue;
            }
            System.out.print((i++) + "  ");
        }
        System.out.println();
        do{
            i--;
            if(i%4==0) {
                System.out.print(i + "  ");
            }
        }while(i>=0);
        System.out.println();
        for(;i<100;i++){
            if(i%4!=0){
                System.out.print(i + "  ");
            }
        }
    }
}
