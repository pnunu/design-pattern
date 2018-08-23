package pnunu.shp;

/**
 * @Author pnunu@git
 * @Date 2018/3/13 16:12
 */
public class Point {
    private Double x;
    private Double y;
    public Point (Double x , Double y) {
        this.x = x;
        this.y = y;
    }
    public Double getX() {
        return x;
    }
    public void setX(Double x) {
        this.x = x;
    }
    public Double getY() {
        return y;
    }
    public void setY(Double y) {
        this.y = y;
    }
}
