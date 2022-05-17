public class Main {
        public static void main(String[] args) {
            int schet = 100;
            int oplata = 1100;

            int bonus;
            if (oplata >= 1000) {
                bonus = oplata/100;
            } else {
                bonus = 0;
            }
            int itogo = schet+oplata+bonus;
            System.out.println(itogo);
            System.out.println(bonus);


            // Объявляете переменные для входных данных и
            // параметров программы: начального счёта,
            // суммы пополнения и тп

            // Условным оператором проверяете превысила ли
            // сумма пополнения порог и для этих двух разных
            // сценариев рассчитываете сумму бонуса и выводите
            // на экран.
        }
    }

