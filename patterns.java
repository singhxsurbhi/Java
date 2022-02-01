package com.company;

import org.w3c.dom.ls.LSOutput;

public class patterns {
    public static void main(String[] args) {
        System.out.println();
        pattern1(7);
        pattern2(7);
        pattern3(7);
        pattern4(7);
        pattern5(7);
        pattern6(7);
        pattern7(7);
        pattern8(7);
        pattern9(7);
        pattern10(7);
        pattern11(7);
        pattern12(7);
        pattern13(7);
        pattern14(7);
        pattern15(7);
    }

    static void pattern1(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern2(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern3(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern4(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(col + 1);
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern5(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = 0; row < n - 1; row++) {
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern6(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern7(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < n - row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern8(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2 * row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern9(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2 * n - (2 * row + 1); col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern10(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern11(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern12(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //check this one tomorrow
    static void pattern13(int n) {
        for (int col = 0; col < n - 1; col++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
        for (int row = 0; row < n - 2; row++) {
            for (int col = 0; col < n - row - 2; col++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int col = 0; col < 2 * row + 1; col++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int col = 0; col < 2 * n - 1; col++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println();
    }

    static void pattern14(int n) {
        for (int col = 0; col < 2 * n - 1; col++) {
            System.out.print("*");
        }
        System.out.println();
        for (int row = 0; row < n - 2; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int col = 0; col < 2 * n - 5 - 2 * row; col++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int col = 0; col < n - 1; col++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
        System.out.println();
    }

    static void pattern15(int n) {
        for (int col = 0; col < n - 1; col++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
        for (int row = 0; row < n - 1; row++) {
            for (int col = 0; col < n - row - 2; col++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int col = 0; col < 2 * row + 1; col++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int row = 0; row < n - 2; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int col=0;col<2 * n - 5 - 2 * row; col++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int col = 0; col < n - 1; col++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
        System.out.println();
    }
    static void pattern16(int n){

    }
}
