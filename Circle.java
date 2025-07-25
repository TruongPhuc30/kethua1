/**
 * Lớp Circle đại diện cho một hình tròn,
 * chứa thông tin về bán kính và màu sắc.
 */
public class Circle {
    /**
     * Hằng số PI dùng để tính diện tích hình tròn.
     */
    protected static final double PI = 3.14159;

    private double radius;  // Bán kính hình tròn
    private String color;   // Màu sắc của hình tròn

    /**
     * Constructor mặc định tạo hình tròn với bán kính 1.0 và màu "red".
     */
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    /**
     * Constructor khởi tạo hình tròn với bán kính cho trước và màu "red".
     *
     * @param radius bán kính hình tròn
     */
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    /**
     * Constructor khởi tạo hình tròn với bán kính và màu sắc cho trước.
     *
     * @param radius bán kính hình tròn
     * @param color  màu sắc hình tròn
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * Lấy bán kính của hình tròn.
     *
     * @return bán kính
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Thiết lập bán kính mới cho hình tròn.
     *
     * @param radius bán kính cần thiết lập
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Lấy màu sắc của hình tròn.
     *
     * @return màu sắc
     */
    public String getColor() {
        return color;
    }

    /**
     * Thiết lập màu sắc mới cho hình tròn.
     *
     * @param color màu cần thiết lập
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Tính diện tích của hình tròn dựa trên bán kính và hằng số PI.
     *
     * @return diện tích hình tròn
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * Trả về chuỗi mô tả hình tròn theo định dạng: Circle[radius=...,color=...]
     *
     * @return chuỗi mô tả hình tròn
     */
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}
