package lessons13This;

public class User {
    private String name;
    private String surname;

    public User (String surname) {
        this.surname = surname;
        System.out.println ("Створено " + surname);
    }

    public User ( String name, String surname ) {
        this(surname);
        this.name = name;
        System.out.printf("Створено користувача з іменем %s%n", name );
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    void print(){
        System.out.println (this );
    }

    @Override
    public String toString () {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
