package hus.Week12.integration;

public class IntegrationCalculator {
    private Integrator integrator;
    private Polynomial poly;

    /**
     * Hàm dựng, khởi tạo đa thức cần tính tích phân.
     * @param poly
     */
    public IntegrationCalculator(Polynomial poly) {
        this.poly = poly;
        integrator = null;
    }

    /**
     * Hàm dựng, khởi tạo phương pháp tính tích phân và đa thức cần tính tích phân.
     * @param integrator
     * @param poly
     */
    public IntegrationCalculator(Integrator integrator, Polynomial poly) {
        this.integrator = integrator;
        this.poly = poly;
    }

    public void setIntegrator(Integrator integrator) {
        this.integrator = integrator;
    }

    public void setPoly(Polynomial poly) {
        this.poly = poly;
    }

    public double integrate(double lower, double upper) {
        return this.integrator.integrate(poly, lower, upper);
    }
}
