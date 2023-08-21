package part20.task76;

public class Person {
        private int id;
        private String name;
        private boolean permanent;
        private Adress address;
        private int[] phoneNumbers;
        private String role;
        private String[] cities;

        // Геттеры и сеттеры

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isPermanent() {
            return permanent;
        }

        public void setPermanent(boolean permanent) {
            this.permanent = permanent;
        }

        public Adress getAddress() {
            return address;
        }

        public void setAddress(Adress address) {
            this.address = address;
        }

        public int[] getPhoneNumbers() {
            return phoneNumbers;
        }

        public void setPhoneNumbers(int[] phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String[] getCities() {
            return cities;
        }

        public void setCities(String[] cities) {
            this.cities = cities;
        }
}
