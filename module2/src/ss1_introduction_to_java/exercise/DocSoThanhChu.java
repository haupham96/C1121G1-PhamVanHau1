package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhập số ");
        int so = scan.nextInt();
        if (so >= 0 && so < 10) {
            switch (so) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        } else if (so >= 10 && so < 20) {
            int ones = so - 10;
            switch (ones) {
                case 0:
                    System.out.println("Ten");
                    break;
                case 1:
                    System.out.println("Eleven");
                    break;
                case 2:
                    System.out.println("Twelve");
                    break;
                case 3:
                    System.out.println("Thirteen");
                    break;
                case 4:
                    System.out.println("Fourteen");
                    break;
                case 5:
                    System.out.println("Fivteen");
                    break;
                case 6:
                    System.out.println("Sixteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("Eighteen");
                    break;
                case 9:
                    System.out.println("Nineteen");
                    break;
            }
        } else if (so < 100) {
            int tens = so / 10;
            switch (tens) {
                case 2:
                    int ones = so - 20;
                    switch (ones) {
                        case 0:
                            System.out.println("Twenty");
                            break;
                        case 1:
                            System.out.println("TwentyOne");
                            break;
                        case 2:
                            System.out.println("TwelveTwo");
                            break;
                        case 3:
                            System.out.println("TwentyThree");
                            break;
                        case 4:
                            System.out.println("TwentyFour");
                            break;
                        case 5:
                            System.out.println("TwentyFive");
                            break;
                        case 6:
                            System.out.println("TwentySix");
                            break;
                        case 7:
                            System.out.println("TwentySeven");
                            break;
                        case 8:
                            System.out.println("TwentyEight");
                            break;
                        case 9:
                            System.out.println("TwentyNine");
                            break;
                    }
                case 3:
                    ones = so - 30;
                    switch (ones) {
                        case 0:
                            System.out.println("Thirty");
                            break;
                        case 1:
                            System.out.println("ThirtyOne");
                            break;
                        case 2:
                            System.out.println("ThirtyTwo");
                            break;
                        case 3:
                            System.out.println("ThirtyThree");
                            break;
                        case 4:
                            System.out.println("ThirtyFour");
                            break;
                        case 5:
                            System.out.println("ThirtyFive");
                            break;
                        case 6:
                            System.out.println("ThirtySix");
                            break;
                        case 7:
                            System.out.println("ThirtySeven");
                            break;
                        case 8:
                            System.out.println("ThirtyEight");
                            break;
                        case 9:
                            System.out.println("ThirtyNine");
                            break;
                    }
                case 4:
                    ones = so - 40;
                    switch (ones) {
                        case 0:
                            System.out.println("Forty");
                            break;
                        case 1:
                            System.out.println("FortyOne");
                            break;
                        case 2:
                            System.out.println("FortyTwo");
                            break;
                        case 3:
                            System.out.println("FortyThree");
                            break;
                        case 4:
                            System.out.println("FortyFour");
                            break;
                        case 5:
                            System.out.println("FortyFive");
                            break;
                        case 6:
                            System.out.println("FortySix");
                            break;
                        case 7:
                            System.out.println("FortySeven");
                            break;
                        case 8:
                            System.out.println("FortyEight");
                            break;
                        case 9:
                            System.out.println("FortyNine");
                            break;
                    }
                case 5:
                    ones = so - 50;
                    switch (ones) {
                        case 0:
                            System.out.println("Fifty");
                            break;
                        case 1:
                            System.out.println("FiftyOne");
                            break;
                        case 2:
                            System.out.println("FiftyTwo");
                            break;
                        case 3:
                            System.out.println("FiftyThree");
                            break;
                        case 4:
                            System.out.println("FiftyFour");
                            break;
                        case 5:
                            System.out.println("FiftyFive");
                            break;
                        case 6:
                            System.out.println("FiftySix");
                            break;
                        case 7:
                            System.out.println("FiftySeven");
                            break;
                        case 8:
                            System.out.println("FiftyEight");
                            break;
                        case 9:
                            System.out.println("FiftyNine");
                            break;
                    }
                case 6:
                    ones = so - 60;
                    switch (ones) {
                        case 0:
                            System.out.println("Sixty");
                            break;
                        case 1:
                            System.out.println("SixtyOne");
                            break;
                        case 2:
                            System.out.println("SixtyTwo");
                            break;
                        case 3:
                            System.out.println("SixtyThree");
                            break;
                        case 4:
                            System.out.println("SixtyFour");
                            break;
                        case 5:
                            System.out.println("SixtyFive");
                            break;
                        case 6:
                            System.out.println("SixtySix");
                            break;
                        case 7:
                            System.out.println("SixtySeven");
                            break;
                        case 8:
                            System.out.println("SixtyEight");
                            break;
                        case 9:
                            System.out.println("SixtyNine");
                            break;
                    }
                case 7:
                    ones = so - 70;
                    switch (ones) {
                        case 0:
                            System.out.println("Seventy");
                            break;
                        case 1:
                            System.out.println("SeventyOne");
                            break;
                        case 2:
                            System.out.println("SeventyTwo");
                            break;
                        case 3:
                            System.out.println("SeventyThree");
                            break;
                        case 4:
                            System.out.println("SeventyFour");
                            break;
                        case 5:
                            System.out.println("SeventyFive");
                            break;
                        case 6:
                            System.out.println("SeventySix");
                            break;
                        case 7:
                            System.out.println("SeventySeven");
                            break;
                        case 8:
                            System.out.println("SeventyEight");
                            break;
                        case 9:
                            System.out.println("SeventyNine");
                            break;
                    }
                case 8:
                    ones = so - 80;
                    switch (ones) {
                        case 0:
                            System.out.println("Eighty");
                            break;
                        case 1:
                            System.out.println("EightyOne");
                            break;
                        case 2:
                            System.out.println("EightyTwo");
                            break;
                        case 3:
                            System.out.println("EightyThree");
                            break;
                        case 4:
                            System.out.println("EightyFour");
                            break;
                        case 5:
                            System.out.println("EightyFive");
                            break;
                        case 6:
                            System.out.println("EightySix");
                            break;
                        case 7:
                            System.out.println("EightySeven");
                            break;
                        case 8:
                            System.out.println("EightyEight");
                            break;
                        case 9:
                            System.out.println("EightyNine");
                            break;
                    }
                case 9:
                    ones = so - 90;
                    switch (ones) {
                        case 0:
                            System.out.println("Ninety");
                            break;
                        case 1:
                            System.out.println("NinetyOne");
                            break;
                        case 2:
                            System.out.println("NinetyTwo");
                            break;
                        case 3:
                            System.out.println("NinetyThree");
                            break;
                        case 4:
                            System.out.println("NinetyFour");
                            break;
                        case 5:
                            System.out.println("NinetyFive");
                            break;
                        case 6:
                            System.out.println("NinetySix");
                            break;
                        case 7:
                            System.out.println("NinetySeven");
                            break;
                        case 8:
                            System.out.println("NinetyEight");
                            break;
                        case 9:
                            System.out.println("NinetyNine");
                            break;
                    }
            }
        } else if (so < 500) {
            int hundred = so / 100;
            String stringHundred = "hundred";
            switch (hundred) {
                case 1:
                    stringHundred = "One Hundred";
                    int tens = (so - 100);
                    if(tens<10){
                        switch (tens){
                            case 0 :
                                System.out.println(stringHundred);
                                break;
                            case 1 :
                                System.out.println(stringHundred+" And "+"One");
                                break;
                            case 2 :
                                System.out.println(stringHundred+" And "+"Two");
                                break;
                            case 3 :
                                System.out.println(stringHundred+" And "+"Three");
                                break;
                            case 4 :
                                System.out.println(stringHundred+" And "+"Four");
                                break;
                            case 5 :
                                System.out.println(stringHundred+" And "+"Five");
                                break;
                            case 6 :
                                System.out.println(stringHundred+" And "+"Six");
                                break;
                            case 7 :
                                System.out.println(stringHundred+" And "+"Seven");
                                break;
                            case 8 :
                                System.out.println(stringHundred+" And "+"Eight");
                                break;
                            case 9 :
                                System.out.println(stringHundred+" And "+"Nine");
                                break;
                        }
                    }
            }

        }

    }
}



