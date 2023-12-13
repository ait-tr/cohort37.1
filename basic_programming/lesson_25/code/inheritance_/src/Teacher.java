public class Teacher {

    private String profession ="Teacher";
    private String school = "AIT TR";

    protected String getProfession(){
        return profession;
    }
    protected String getSchool(){
        return school;
    }
    void work(){
        System.out.println("Teaching");
    }
}
