package polynomial;

public class IntegrationCaculator {
    private Integrator integrator;
    private Polynomial polynomial;

    public IntegrationCaculator(Integrator integrator, Polynomial polynomial) {
        this.integrator = integrator;
        this.polynomial = polynomial;
    }

    public IntegrationCaculator(Polynomial polynomial) {
        this.polynomial = polynomial;
    }

    public void setIntegrator(Integrator integrator) {
        this.integrator = integrator;
    }

    public double integrate(double lower, double upper) {
        return this.integrator.integrate(polynomial, lower, upper);
    }
}
