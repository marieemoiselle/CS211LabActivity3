public class Artist {
    
    //member variables
    private String name;
    private String nationality;
    private int age;
    private String specialty;
    
    public Artist(String name, String nationality, int age, String specialty) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.specialty = specialty;
    }

   // accessors
    public String getName() {
        return name;
    }
    
    public String getNationality() {
        return nationality;
    }

    public int getAge() {
        return age;
    }

    public String getSpecialty() {
        return specialty;
    }

 //mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

// display method
    public void displayInfo() {
        System.out.println("Artist Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialty: " + specialty);
    }
}