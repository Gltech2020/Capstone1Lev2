
    // A program to create the building object using methods

// Initialize the methods using built in functions
// Use the toString to print out the results

    public class buildingObject {
        private String shapeOfBuilding;
        private int amountOfRooms;
        private int sizeInMetres;
        private int amountOfFloors;
        private int expectedBudget;

        public buildingObject (String shapeOfBuilding, String amountOfRooms, String sizeInMetres, String amountOfFloors, String expectedBudget) {
            this.shapeOfBuilding = shapeOfBuilding;
            this.amountOfRooms = Integer.parseInt(amountOfRooms);
            this.sizeInMetres = Integer.parseInt(sizeInMetres);
            this.amountOfFloors = Integer.parseInt(amountOfFloors);
            this.expectedBudget = Integer.parseInt(expectedBudget);
        }
        // Use the toString to initiatilize the information that will be printed out
        public String toString() {
            String output = "Shape is: " + shapeOfBuilding;
            output += "\nAmount of rooms is: " + amountOfRooms;
            output += "\nThe overall size of the building is: " + sizeInMetres;
            output += "\nAmount of floors: " + amountOfFloors;
            output += "\nThe budget for this is: "+ "R" + expectedBudget;

            return output;
        }
    }


