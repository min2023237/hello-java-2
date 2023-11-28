package d1prob;

public class JavaStringFormatting {
    public static void main(String[] args) {
        int dust = 10;
        String status = "좋음";

        System.out.println(String.format("미세먼지 농도: %d (%s)", dust, status));
    }
}
