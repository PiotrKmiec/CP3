public class DrivingLicense{
    // attributes
    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private String licenseId;
    private int yearOfIssue;
    private String category;

    // methods
    public String toString(){
        return ("Personal information: \n  Name: "+this.name+
        "\n  Surname: "+this.surname+"\n  Address: "+this.address+" "+
        this.city+" "+this.postalCode+"\nLicense information: \n  ID: "+
        this.licenseId+"\n  Year of issue: "+this.yearOfIssue+"\n  Category: "+
        this.category+"\n");
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        String firstLetter = (name.substring(0,1)).toUpperCase();
        String everythingElse = (name.substring(1, name.length())).toLowerCase();
        this.name = firstLetter + everythingElse;
        return;
    }

    public String getSurname(){
        return this.surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
        return;
    }

    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
        return;
    }

    public String getPostalCode(){
        return this.postalCode;
    }
    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
        return;
    }

    public String getCity(){
        return this.city;
    }
    public void setCity(String city){
        this.city = city;
        return;
    }

    public String getID(){
        return this.licenseId;
    }
    public void setID(String licenseId){
        this.licenseId = licenseId;
        return;
    }

    public int getYearOfIssue(){
        return this.yearOfIssue;
    }
    public void setYearOfIssue(int yearOfIssue){
        if(yearOfIssue>=1980 && yearOfIssue<=2022){
            this.yearOfIssue = yearOfIssue;
        }
    }

    public String getCategory(){
        return this.category;
    }
    public void setCategory(String category){
        this.category = category;
        return;
    }
}
