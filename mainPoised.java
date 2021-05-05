
import java.util.*;
public class mainPoised {
//Main Method
        public static <feesPaidToDateClass> void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            //Ask user input for the Architect details
            System.out.println("======Architect=====");

            System.out.println("What is the name of the architect? : ");
            String name = sc.next();

            System.out.println("What is the surname of the architect? : ");
            String surname = sc.next();

            System.out.println("Enter the profession : ");
            String profession = sc.next();

            System.out.println("What is the architect's cell phone number? : ");
            int cellPhoneNumber = Integer.parseInt(sc.next());

            System.out.println("Enter the hourly rate : ");
            int hourlyRate = Integer.parseInt(sc.next());

            architect myArchitect = new architect( name, surname, profession, cellPhoneNumber, hourlyRate);
            System.out.println(myArchitect.toString());

//Ask user input for the Contractor details
            System.out.println("======Contractor=====");

            System.out.println("What is the name of the contractor? : ");
            String name1 = sc.next();

            System.out.println("What is the surname of the contractor? : ");
            String surname1 = sc.next();

            System.out.println("Enter the profession : ");
            String profession1 = sc.next();

            System.out.println("What is the contractor's cell phone number? : ");
            String cellPhoneNumber1 = sc.next();

            System.out.println("What is the hourly rate : ");
            String hourlyRate1 = sc.next();

            contractor myContractor = new contractor( name, surname, profession, cellPhoneNumber, hourlyRate);
            System.out.println(myContractor.toString());
//Ask user input for the details of the building under construction

            System.out.println("======Building=====");

            System.out.println("What is the shape of the building? : ");
            String shapeOfBuilding = sc.next();

            System.out.println("What is the amount of rooms? : ");
            String amountOfRooms = sc.next();

            System.out.println("Enter the size in metres : ");
            String sizeInMetres = sc.next();

            System.out.println("Enter the number of floors : ");
            String amountOfFloors = sc.next();

            System.out.println("What is the expected budget? : ");
            String expectedBudget = sc.next();

            buildingObject myBuilding = new buildingObject( shapeOfBuilding, amountOfRooms, sizeInMetres, amountOfFloors, expectedBudget);
            System.out.println(myBuilding.toString());

            System.out.println("======dueDate=====");
            //Print out the details of the due date
            System.out.println("Enter the due day : ");
            String day = sc.next();

            System.out.println("Enter the month : ");
            String month = sc.next();


            System.out.println("Enter the year : ");
            String year = sc.next();

            dueDate myDueDate = new dueDate( day, month, year);
            System.out.println(myDueDate.toString());

            //Print out the details of the fees paid amount details

            System.out.println("======feesPaidToDate=====");

            System.out.println("Enter the fees paid to date : ");
            String amountPaid = sc.next();

            feesPaidToDateClass myFees = (feesPaidToDateClass) new feesPaidToDate(amountPaid);
            System.out.println(myBuilding.toString());


        }

    }


