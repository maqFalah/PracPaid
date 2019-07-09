package pracPaid;

public class MainBody {
	

    public static void main(String[] args)
    {
        Address school = new Address("IIT BHU near VT", "Varansi", "Uttar pradesh", 221005);

        Address Homes1 = new Address("New karimganj", "Gaya", "Bihar", 823001);

        Student s1 = new Student("Maqsood", "Alam", Homes1, school);

        Address Homes2 = new Address("Pandeypur Bhakti Nagar colony", "Varansi", "Uttar pradesh", 221005);

        Student s2 = new Student("Pankhuri", "Singh", Homes2, school);

        s1.setTestScore(1, 76);
        s1.setTestScore(2, 80);
       s1.setTestScore(3, 47);
        s1.average();

        s2.setTestScore(1, 76);
        s2.setTestScore(2, 43);
        s2.setTestScore(3, 86);
        s2.average();

        System.out.println(s1+"\n");
        System.out.println(s2);
    }

}
