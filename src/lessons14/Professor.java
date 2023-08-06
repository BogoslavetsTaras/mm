package lessons14;

public class Professor extends User {
    private int experience;
    private int msgSent;


    public Professor ( String name, String surname, int experience ) {
        super ( name, surname );
        this.experience = experience;
        msgSent = 0;
    }

    @Override
    public String mail ( String message ) {
        msgSent++;
        return super.mail ( message );
    }

    public  String mail (String message, String studentSurname){
        msgSent++;
        return "Professor " + getName () + "Sent to " + studentSurname + ": " + message;
    }

    public  String mail (double mark, String studentSurname){
        msgSent++;
        return "Professor " + getName () + " put the mark to " + studentSurname + ": " + mark;
    }



    public int getExperience () {
        return experience;
    }
    public void setExperience ( int experience ) {
        this.experience = experience;
    }
    public int getMsgSent () {
        return msgSent;
    }


}



