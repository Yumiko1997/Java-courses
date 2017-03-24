
public class MathStandart {
        public static void main(String[] arg) {
            int first = Integer.valueOf(arg[0]);
            int second = Integer.valueOf(arg[1]);
            double three = Double.valueOf(arg[2]);
            double four = Double.valueOf(arg[3]);
            int sum = first + second;
            int minus = first - second;
            double multiply = three * four;
            double Divide = three / four;
            System.out.println("Sum " +sum);
            System.out.println("Minus " +minus);
            System.out.println("Multiply " +multiply);
            System.out.println("Del " +Divide);
            System.out.println("Degree'" + Math.pow(first, second));
        }
}
