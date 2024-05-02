// Main.java
import ratio.Rationnel;


        public class Main {
            public static void main(String[] args) {
                Rationnel r1 = new Rationnel(1, 2);
                Rationnel r2 = new Rationnel(1, 3);

                Rationnel additionResult = r1.addition(r2);
                Rationnel soustractionResult = r1.soustraction(r2);

                System.out.println("Rationnel 1: " + r1);
                System.out.println("Rationnel 2: " + r2);
                System.out.println("Addition result: " + additionResult);
                System.out.println("Soustraction result: " + soustractionResult);
            }
        }

