public class Main{
    public static void main(String[] args){
        DrivingLicense licence = new DrivingLicense();
        licence.setName("pIOtR");
        licence.setSurname("Smiec");
        licence.setAddress("Rakowicka 17");
        licence.setCategory("B");
        licence.setID("CCT 172039");
        licence.setPostalCode("13-293");
        licence.setCity("Krakow");
        licence.setYearOfIssue(2023);
        System.out.print(licence);
    }
}