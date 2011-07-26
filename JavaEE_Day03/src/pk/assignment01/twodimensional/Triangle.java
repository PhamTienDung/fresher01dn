/**
 * @author Admin
 */
package pk.assignment01.twodimensional;

/**
 * @author Admin
 * 
 */
public class Triangle implements TwoDimensionalShape {
    private double firstEdge = 0.0;
    private double secondEdge = 0.0;
    private double thirdEdge = 0.0;

    /**
     * Trong trường hợp tam giác đều
     * 
     * @param a
     */
    public Triangle(double a) {
        this.setFirstEdge(a);
        this.setSecondEdge(a);
        this.setThirdEdge(a);
    }

    /**
     * @param a
     * @param b
     * @param c
     */
    public Triangle(double a, double b, double c) {
        this.setFirstEdge(a);
        this.setSecondEdge(b);
        this.setThirdEdge(c);
    }

    /**
     * @return the thirdEdge
     */
    public double getThirdEdge() {
        return thirdEdge;
    }

    /**
     * @param thirdEdge
     *            the thirdEdge to set
     */
    public void setThirdEdge(double thirdEdge) {
        this.thirdEdge = thirdEdge;
    }

    /**
     * @return the secondEdge
     */
    public double getSecondEdge() {
        return secondEdge;
    }

    /**
     * @param secondEdge
     *            the secondEdge to set
     */
    public void setSecondEdge(double secondEdge) {
        this.secondEdge = secondEdge;
    }

    /**
     * @return the firstEdge
     */
    public double getFirstEdge() {
        return firstEdge;
    }

    /**
     * @param firstEdge
     *            the firstEdge to set
     */
    public void setFirstEdge(double firstEdge) {
        this.firstEdge = firstEdge;
    }

    /*
     * (non-Javadoc)
     * 
     * @see pk.assignment01.Shape#getArea()
     */
    @Override
    public double getArea() {
        double p = (firstEdge + secondEdge + thirdEdge) / 2;
        double area = Math.sqrt(p * (p - firstEdge) * (p - secondEdge) * (p - thirdEdge));
        return area;
    }

}