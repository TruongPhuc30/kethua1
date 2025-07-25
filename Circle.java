/**
 * Lớp Circle đại diện cho hình tròn với bán kính và màu sắc.
 */
public class Circle {
    protected static final double PI = 3.14159;

    private double radius; // bán kính
    private String color;  // màu sắc

    /**
     * Constructor mặc định. Bán kính = 1.0 và màu = "red".
     */
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    /**
     * Constructor khởi tạo Circle với bán kính tùy chọn, màu mặc định là "red".
     *
     * @param radius bán kính hình tròn
     */
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    /**
     * Constructor khởi tạo Circle với bán kính và màu tùy chọn.
     *
     * @param radius bán kính
     * @param color  màu sắc
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * Constructor đầy đủ với 3 tham số (trong đó double thứ hai không dùng trực tiếp).
     * Có thể mở rộng trong tương lai.
     *
     * @param radius     bán kính hình tròn
     * @param unused     tham số không sử dụng, có thể là thickness hoặc giá trị phụ
     * @param color      màu sắc hình tròn
     */
    public Circle(double radius, double unused, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Tính diện tích hình tròn.
     *
     * @return diện tích = PI * r^2
     */
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}
