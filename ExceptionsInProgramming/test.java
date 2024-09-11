import java.text.DecimalFormat;

public class test {
    public static void main(String[] args) {
       String OUTPUT_FORMAT = "#";
        double EXAMPLE_VALUE = 3.140;
        DecimalFormat formatter = new DecimalFormat(OUTPUT_FORMAT);
        String output = formatter.format(EXAMPLE_VALUE);

        System.out.println("Output = " + output);

    }
}
