public class LotteryTicket {

    public static void main(String[] args) {

        int[][] lotteryCard = { {11, 50, 22},
                                {55, 23, 45},
                                {9, 5, 4}
        };

        int[][] lotteryCard2 = new int[3][3];

        //[row][column]
        lotteryCard2[0][0] = 11;
        lotteryCard2[0][1] = 50;
        lotteryCard2[0][2] = 22;
        lotteryCard2[1][0] = 55;
        lotteryCard2[1][1] = 23;
        lotteryCard2[1][2] = 45;
        lotteryCard2[2][0] = 9;
        lotteryCard2[2][1] = 5;
        lotteryCard2[2][2] = 4;

        System.out.println(lotteryCard[0][0]);

        System.out.println("----------------");

        for (int i = 0; i < 3; i++) {
            System.out.println(lotteryCard[i][i]);
        }

        System.out.println("----------------");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(lotteryCard[i][j]);
            }
        }
    }
}
