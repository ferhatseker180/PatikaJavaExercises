package week1;

import java.util.Scanner;

public class FindHoroscope {
    public static void main(String[] args) {

        // Variables to which data received from the user are assigned
        int day, month;

        // Import Scanner, take day and month information
        Scanner input = new Scanner(System.in);
        System.out.print("Which Day Were You Born: ");
        day = input.nextInt();
        System.out.print("Which Month Were You Born: ");
        month = input.nextInt();

        // Checking whether the month number is entered correctly or incorrectly
        if (month > 0 && month <= 12) {
            // control of the months
            if (month == 1) {
                // Checking whether the day number is entered correctly or incorrectly
                if (day > 0 && day <= 31) {
                    if (day < 22) {
                        System.out.println("You are a capricorn");
                    } else {
                        System.out.println("You are a aquarius");
                    }
                } else {
                    System.out.println("Wrong Information");
                }

            } else if (month == 2) {
                if (day > 0 && day <= 29) {
                    if (day < 20) {
                        System.out.println("You are a aquarius");
                    } else {
                        System.out.println("You are a fishes");
                    }
                } else {
                    System.out.println("Wrong Information");
                }
            } else if (month == 3) {
                if (day > 0 && day <= 31) {
                    if (day < 21) {
                        System.out.println("You are a fishes");
                    } else {
                        System.out.println("You are a aries");
                    }
                } else {
                    System.out.println("Wrong Information");
                }

            } else if (month == 4) {
                if (day > 0 && day <= 30) {
                    if (day < 21) {
                        System.out.println("You are a aries");
                    } else {
                        System.out.println("You are a taurus");
                    }
                } else {
                    System.out.println("Wrong Information");
                }
            } else if (month == 5) {
                if (day > 0 && day <= 31) {
                    if (day < 22) {
                        System.out.println("You are a taurus");
                    } else {
                        System.out.println("You are a twins");
                    }
                } else {
                    System.out.println("Wrong Information");
                }
            } else if (month == 6) {
                if (day > 0 && day <= 30) {
                    if (day < 23) {
                        System.out.println("You are a twins");
                    } else {
                        System.out.println("You are a crab");
                    }
                } else {
                    System.out.println("Wrong Information");
                }
            } else if (month == 7) {
                if (day > 0 && day <= 31) {
                    if (day < 23) {
                        System.out.println("You are a crab");
                    } else {
                        System.out.println("You are a lion");
                    }
                } else {
                    System.out.println("Wrong Information");
                }
            } else if (month == 8) {
                if (day > 0 && day <= 31) {
                    if (day < 23) {
                        System.out.println("You are a lion");
                    } else {
                        System.out.println("You are a virgo");
                    }
                } else {
                    System.out.println("Wrong Information");
                }
            } else if (month == 9) {
                if (day > 0 && day <= 30) {
                    if (day < 23) {
                        System.out.println("You are a virgo");
                    } else {
                        System.out.println("You are a libra");
                    }
                } else {
                    System.out.println("Wrong Information");
                }
            } else if (month == 10) {
                if (day > 0 && day <= 31) {
                    if (day < 23) {
                        System.out.println("You are a libra");
                    } else {
                        System.out.println("You are a scorpion");
                    }
                } else {
                    System.out.println("Wrong Information");
                }
            } else if (month == 11) {
                if (day > 0 && day <= 30) {
                    if (day < 22) {
                        System.out.println("You are a scorpion");
                    } else {
                        System.out.println("You are a archer");
                    }
                } else {
                    System.out.println("Wrong Information");
                }

            } else if (month == 12) {
                if (day > 0 && day <= 31) {
                    if (day < 22) {
                        System.out.println("You are a archer");
                    } else {
                        System.out.println("You are a capricon");
                    }
                } else {
                    System.out.println("Wrong Information");
                }
            }

        } else {
            System.out.print("Wrong Information");
        }


    }
}
