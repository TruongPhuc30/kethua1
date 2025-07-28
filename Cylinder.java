/**
 * Lớp Cylinder mở rộng từ lớp Circle,
 * đại diện cho hình trụ có chiều cao và bán kính.
 */
public class Cylinder extends Circle {
    private double height;  // Chiều cao của hình trụ

    /**
     * Constructor mặc định tạo hình trụ với bán kính 1.0, màu "red" và chiều cao 1.0.
     */
    public Cylinder() {
        super(); // Gọi constructor lớp cha (Circle)
        this.height = 1.0;
    }

    /**
     * Constructor khởi tạo hình trụ với bán kính cho trước, màu "red" và chiều cao 1.0.
     *
     * @param radius bán kính hình trụ
     */
    public Cylinder(double radius) {
        super(radius); // Goi constructor lop cha
        this.height = 1.0;
    }
    
    /**
     * Constructor khởi tạo hình trụ với bán kính và chiều cao cho trước, màu "red".
     *
     * @param radius bán kính hình trụ
     * @param height chiều cao hình trụ
     */
    public Cylinder(double radius, double height) {
        super(radius); // Gọi constructor lớp cha
        this.height = height;
    }
    
    /**
     * Constructor khởi tạo hình trụ với bán kính, màu sắc và chiều cao cho trước.
     *
     * @param radius bán kính hình trụ
     * @param color  màu sắc hình trụ
     * @param height chiều cao hình trụ
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color); // Gọi constructor lớp cha
        this.height = height;
    }

    /**
     * Lấy chiều cao của hình trụ.
     *
     * @return chiều cao
     */
    public double getHeight() {
        return height;
    }

    /**
     * Thiết lập chiều cao mới cho hình trụ.
     *
     * @param height chiều cao cần thiết lập
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Tính thể tích của hình trụ.
     * Công thức: diện tích đáy * chiều cao
     *
     * @return thể tích hình trụ
     */
    public double getVolume() {
        return getArea() * height;
    }

    /**
     * Trả về chuỗi mô tả hình trụ theo định dạng: Cylinder[Circle[radius=...,color=...],height=...]
     *
     * @return chuỗi mô tả hình trụ
     */
    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + height + "]";
    }
}
