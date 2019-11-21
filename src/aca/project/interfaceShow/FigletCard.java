package aca.project.interfaceShow;

public class FigletCard {
    private static final int STRING_COUNT = 11;

    private static String[] cardBack = {
            "################",
            "#||||||||||||||#",
            "#|############|#",
            "#|############|#",
            "#|############|#",
            "#|############|#",
            "#|############|#",
            "#|############|#",
            "#|############|#",
            "#||||||||||||||#",
            "################"
    };

    private static String[] cardJ = {
            "################",
            "#.J............#",
            "#.........##...#",
            "#.........##...#",
            "#.........##...#",
            "#.........##...#",
            "#...##....##...#",
            "#...##....##...#",
            "#....######....#",
            "#............J.#",
            "################"
    };

    private static String[] cardQ = {
            "################",
            "#.Q............#",
            "#....#######...#",
            "#...##.....##..#",
            "#...##.....##..#",
            "#...##.....##..#",
            "#...##..##.##..#",
            "#...##....##...#",
            "#....#####.##..#",
            "#............Q.#",
            "################"
    };

    private static String[] cardK = {
            "################",
            "#.K............#",
            "#...##....##...#",
            "#...##...##....#",
            "#...##..##.....#",
            "#...#####......#",
            "#...##..##.....#",
            "#...##...##....#",
            "#...##....##...#",
            "#............K.#",
            "################"
    };


    private static String[] card2 = {
            "################",
            "#.2............#",
            "#....#######...#",
            "#...##.....##..#",
            "#..........##..#",
            "#....#######...#",
            "#...##.........#",
            "#...##.........#",
            "#...#########..#",
            "#............2.#",
            "################"
    };

    private static String[] card3 = {
            "################",
            "#.3............#",
            "#....#######...#",
            "#...##.....##..#",
            "#..........##..#",
            "#....#######...#",
            "#..........##..#",
            "#...##.....##..#",
            "#....#######...#",
            "#............3.#",
            "################"
    };

    private static String[] card4 = {
            "################",
            "#.4............#",
            "#...##.........#",
            "#...##....##...#",
            "#...##....##...#",
            "#...##....##...#",
            "#...#########..#",
            "#.........##...#",
            "#.........##...#",
            "#............4.#",
            "################"
    };

    private static String[] card5 = {
            "################",
            "#.5............#",
            "#...########...#",
            "#...##.........#",
            "#...##.........#",
            "#...#######....#",
            "#.........##...#",
            "#...##....##...#",
            "#....######....#",
            "#............5.#",
            "################"
    };

    private static String[] card6 = {
            "################",
            "#.6............#",
            "#....#######...#",
            "#...##.....##..#",
            "#...##.........#",
            "#...########...#",
            "#...##.....##..#",
            "#...##.....##..#",
            "#....#######...#",
            "#............6.#",
            "################"
    };

    private static String[] card7 = {
            "################",
            "#.7............#",
            "#...########...#",
            "#...##....##...#",
            "#.......##.....#",
            "#......##......#",
            "#.....##.......#",
            "#.....##.......#",
            "#.....##.......#",
            "#............7.#",
            "################"
    };

    private static String[] card8 = {
            "################",
            "#.8............#",
            "#....#######...#",
            "#...##.....##..#",
            "#...##.....##..#",
            "#....#######...#",
            "#...##.....##..#",
            "#...##.....##..#",
            "#....#######...#",
            "#............8.#",
            "################"
    };

    private static String[] card9 = {
            "################",
            "#.9............#",
            "#....#######...#",
            "#...##.....##..#",
            "#...##.....##..#",
            "#....########..#",
            "#..........##..#",
            "#...##.....##..#",
            "#....#######...#",
            "#............9.#",
            "################"
    };

    private static String[] card10 = {
            "################",
            "#.10...........#",
            "#...#......#...#",
            "#..##.....#.#..#",
            "#...#....#...#.#",
            "#...#....#...#.#",
            "#...#....#...#.#",
            "#...#.....#.#..#",
            "#.#####....#...#",
            "#...........10.#",
            "################"
    };

    private static String[] cardA = {
            "################",
            "#.A............#",
            "#......###.....#",
            "#.....##.##....#",
            "#....##...##...#",
            "#...##.....##..#",
            "#...#########..#",
            "#...##.....##..#",
            "#...##.....##..#",
            "#............A.#",
            "################"
    };

    public static String[] getCardJ() {
        return cardJ;
    }

    public static String[] getCardQ() {
        return cardQ;
    }

    public static String[] getCardK() {
        return cardK;
    }

    public static String[] getCard2() {
        return card2;
    }

    public static String[] getCard3() {
        return card3;
    }

    public static String[] getCard4() {
        return card4;
    }

    public static String[] getCard5() {
        return card5;
    }

    public static String[] getCard6() {
        return card6;
    }

    public static String[] getCard7() {
        return card7;
    }

    public static String[] getCard8() {
        return card8;
    }

    public static String[] getCard9() {
        return card9;
    }

    public static String[] getCard10() {
        return card10;
    }

    public static String[] getCardA() {
        return cardA;
    }

    static String[] getCardBack() {
        return cardBack;
    }

    static int getSTRING_COUNT() {
        return STRING_COUNT;
    }
}
