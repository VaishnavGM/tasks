class Cpy {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                if (i == 1 && j == 1) {
                    System.out.print("A");
                } else if (i == 2&& j == 1) {
                    System.out.print("A");
                } else if (i == 2 && j == 2) {
                    System.out.print("B");
                }
				else if (i == 3 && j == 1) {
                    System.out.print("A");
                }
				else if (i == 3 && j == 2) {
                    System.out.print("B");
                } 
				else if (i==3&& j == 3) {
                    System.out.print("C");
                } 
				else if (i == 4 && j == 1) {
                    System.out.print("A");
                }
				else if (i == 4 && j == 2) {
                    System.out.print("B");
                } 
				else if (i == 4 && j == 3) {
                    System.out.print("C");
                }
				else if (i == 4 && j == 4) {
                    System.out.print("D");
                }
                if (j < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
