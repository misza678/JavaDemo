package ch2;

public class ex2 {

    public static void main(String[] args) {
        int number=0;

        for(int i=1;i<=100;i++){
            if(i % 3==0){
                System.out.println(i);
            }
        }

        for(int i=1;i<=100;i++){
            if(i % 3==0&& i % 4==0){
                number+=i;
            }
        }
        System.out.println("suma liczb podzielnych przez 3 i 4  wynosi: "+ number);
    }

}
