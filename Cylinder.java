/**
 * Lớp Cylinder kế thừa từ Circle, thêm chiều cao để biểu diễn hình trụ.
 */
public class Cylinder extends Circle {
    private double height; // chiều cao của hình trụ

    /**
     * Constructor mặc định: bán kính = 1.0, màu = "red", chiều cao = 1.0.
     */
    public Cylinder() {
        super();           // gọi Circle()
        this.height = 1.0;
    }

    /**
     * Constructor khởi tạo hình trụ với chiều cao tùy chọn,
     * các thuộc tính còn lại dùng mặc định từ Circle.
     *
     * @param height chiều cao hình trụ
     */
    public Cylinder(double height) {
        super();           // Circle mặc định
        this.height = height;
    }

    /**
     * Constructor khởi tạo hình trụ với bán kính và chiều cao tùy chọn,
     * màu mặc định là "red".
     *
     * @param radius bán kính đáy
     * @param height chiều cao hình trụ
     */
    public Cylinder(double radius, double height) {
        super(radius);     // Circle(radius)
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Tính diện tích toàn phần hình trụ:
     * 2 đáy + diện tích xung quanh = 2πr² + 2πrh.
     *
     * @return tổng diện tích mặt ngoài
     */
    @Override
    public double getArea() {
        double base = super.getArea();
        double lateral = 2 * PI * getRadius() * height;
        return 2 * base + lateral;
    }

    /**
     * Tính thể tích hình trụ: V = πr²h.
     *
     * @return thể tích
     */
    public double getVolume() {
        return super.getArea() * height;
    }

    /**
     * Trả về chuỗi mô tả chi tiết hình trụ.
     *
     * @return Cylinder[Circle[radius=...,color=...],height=...]
     */
    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + height + "]";
    }
}
