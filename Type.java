public enum Type {
    ACOUSTIC("acuostic"),
    ELECTRIC("electric"),
    UNSPECIFIED("unspecified");

    String value;

    private Type(String value) { this.value = value; }
    public String toString() { return value; }
}
