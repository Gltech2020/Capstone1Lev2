public class contractor {
    public contractor(String name, String surname, String profession, String cellPhoneNumber, String hourlyRate) {
    }

    public contractor(String name, String surname, String profession, int cellPhoneNumber, int hourlyRate) {

    }
    // A program to create the contractor object using methods
// Initialize the methods using built in functions
// Use the toString to print out the results

    public class Contractor {

        // Attributes
        private String name;
        private String surname;
        private String profession;
        private int cellPhoneNumber;
        private int hourlyWorkRate;

        // Enter some arguments for required information
        public Contractor  (String name, String surname, String profession, int cellPhoneNumber, int hourlyWorkRate) {
            this.name = name;
            this.surname = surname;
            this.profession = profession;
            this.cellPhoneNumber = cellPhoneNumber;
            this.hourlyWorkRate = hourlyWorkRate;

        }

        // Use the toString to initiatilize the information that will be printed out
        public String toString() {
            String output = "Name: " + name;
            output += "\nSurname: " + surname;
            output += "\nProfession: " + profession;
            output += "\nCellPhone Number: " + cellPhoneNumber;
            output += "\nHourly Rate: "+ "R" + hourlyWorkRate;

            return output;
        }

    }


}
