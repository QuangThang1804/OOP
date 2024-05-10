package decorator.pseudocode;

public class Data {
    private String context;
    private boolean compressed;
    private boolean encryped;

    public Data(String context, boolean compressed, boolean encryped) {
        this.context = context;
        this.compressed = compressed;
        this.encryped = encryped;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public boolean isCompressed() {
        return compressed;
    }

    public void setCompressed(boolean compressed) {
        this.compressed = compressed;
    }

    public boolean isEncryped() {
        return encryped;
    }

    public void setEncryped(boolean encryped) {
        this.encryped = encryped;
    }

    @Override
    public String toString() {
        return "Data{" +
                "context='" + context + '\'' +
                ", compressed=" + compressed +
                ", encryped=" + encryped +
                '}';
    }
}
