public class Bai3_BMI {
    public static void main(String[] args) {

        double weight = 40.0; // Cân nặng (kg)
        double height = 1.50; // Chiều cao (m)

        // Tính BMI
        double bmi = weight * 0.730 / (height * height);

        // In kết quả
        System.out.println("Cân nặng: " + weight + " kg");
        System.out.println("Chiều cao: " + height + " m");
        System.out.println("Chỉ số BMI: " + bmi);

        // Đánh giá tình trạng cơ thể dựa trên BMI
        if (bmi < 18.5) {
            System.out.println("Tình trạng cơ thể: Gầy");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Tình trạng cơ thể: Bình thường");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Tình trạng cơ thể: Thừa cân");
        } else {
            System.out.println("Tình trạng cơ thể: Béo phì");
        }
    }
}
