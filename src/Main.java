public class Main{
    public static void main(String[] args) {
        Integer i=0;
        while(i<100){
            i++;
            if(i%2==0){
                continue;
            }
            System.out.println(i-1);
        }
    }
}
