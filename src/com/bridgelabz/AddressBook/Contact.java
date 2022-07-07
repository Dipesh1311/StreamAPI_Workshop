package com.bridgelabz.AddressBook;

public class Contact {
        private String firstName,city,state;

        public String getFirstName() {
            return firstName;
        }

        public String getCity() {
            return city;
        }
        public String getState() {
        return state;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setCity(String city) {
            this.city = city;
        }
        public void setState(String state) {
        this.state = state;
    }
    public String toString() {
            return  "Contacts{" +
                    "firstName='" + firstName+ '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'';

    }

}
