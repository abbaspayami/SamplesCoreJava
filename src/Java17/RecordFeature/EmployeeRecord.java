package Java17.RecordFeature;


public record EmployeeRecord(String name, String family, int age) {

    public static class Builder {
        private String name;
        private String family;
        private int age;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;

        }

        public Builder setFamily(String family) {
            this.family = family;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public EmployeeRecord build() {
            return new EmployeeRecord(name, family, age);
        }
    }
}
