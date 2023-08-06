package lessons14;

public class Student extends User {

    private int groupNumber;
    private int yearOfStudy;


    public Student ( String name, String surname, int groupNumber, int yearOfStudy ) {
        super ( name, surname );
        this.groupNumber = groupNumber;
        this.yearOfStudy = yearOfStudy;
    }


    @Override
    public String getSurname () {
        return super.getSurname ( ).charAt ( 0 ) + ".";
    }

    public int getGroupNumber () {
        return groupNumber;
    }

    public void setGroupNumber ( int groupNumber ) {
        this.groupNumber = groupNumber;
    }

    public int getYearOfStudy () {
        return yearOfStudy;
    }

    public void setYearOfStudy ( int yearOfStudy ) {
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public String mail ( String message ) {
        return "Student: " + super.getName ( ) + ": " + message;
    }

}
