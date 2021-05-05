
    // A program to create the due date object using methods
// Initialize the methods using built in functions
// Use the toString to print out the results
    public class dueDate {
        private int day;
        private int month;
        private int year;


        // Enter some arguments for required information
        public dueDate(String day, String month, String year) {
            this.day = Integer.parseInt(day);
            this.month = Integer.parseInt(month);
            this.year = Integer.parseInt(year);

        }
        public String toString() {
            String output = "Day: " + day;
            output += "\nMonth: " + month;
            output += "\nYear: " + year;

            return output;
        }
    }


