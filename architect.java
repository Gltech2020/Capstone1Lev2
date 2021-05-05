
    // A program to create an object; Architect using methods

    // Initialize the methods using JAVA built in functions
// Use the toString to print out the results
    public class architect {

        // Attributes
        private String name;
        private String surname;
        private String profession;
        private int cellPhoneNumber;
        private int hourlyWorkRate;

        // Enter some arguments for required information
        public architect(String name, String surname, String profession, int cellPhoneNumber, int hourlyWorkRate) {
            this.name = name;
            this.surname = surname;
            this.profession = profession;
            this.cellPhoneNumber = cellPhoneNumber;
            this.hourlyWorkRate = hourlyWorkRate;

        }

        // Use the toString to initiatilize the information to be printed out
        public String toString() {
            String output = "Name: " + name;
            output += "\nSurname: " + surname;
            output += "\nProfession: " + profession;
            output += "\nCellPhone Number: " + cellPhoneNumber;
            output += "\nHourly Rate: " + hourlyWorkRate;

            return output;
        }

    }


