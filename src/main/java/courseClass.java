public class courseClass {

    public String name;
    public int ID;
    public String code;
//default constructor
    public courseClass() {
        this.name = "Omar Segura";
        this.ID = 	93824;
        this.code = "CSC311";
    }
//overloaded constructor
    public courseClass(String name, int ID, String code) {
        this.name = name;
        this.ID = ID;
        this.code = code;
    }
//setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    protected void classInfo() {
        System.out.println(getName());
        System.out.println(getID());
        System.out.println(getCode());
    }
}
