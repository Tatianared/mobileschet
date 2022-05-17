public class Main {
    public static void main(String[] args) {
        int schet = 100;
        int oplata = 1100;

        int bonus;
        if (oplata >= 1000) {
            bonus = oplata / 100;
        } else {
            bonus = 0;
        }
        int itogo = schet + oplata + bonus;
        System.out.println(itogo);
        System.out.println(bonus);


    }
}

