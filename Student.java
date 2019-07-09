package pracPaid;

public class Student {

 private String firstName, lastName;
private Address homeAddress, schoolAddress;
private double test1, test2, test3;
private double averageScore;


// sets the details of students.

public Student(String first, String last, Address home, Address school)
{
    firstName = first;
    lastName = last;
    homeAddress = home;
    schoolAddress = school;
    test1 = 0;
    test2 = 0;
    test3 = 0;
}


// Sets the test scores

public void setTestScore(int testNo, int testScore)
{
   
         if(testNo==1)   test1 = testScore;
         if(testNo==2)  test2 = testScore;
         if(testNo==3) test3 = testScore;
            return;

    }



public double getTestScore(double testNo)
{  if(testNo==1)  return test1;
   
	if(testNo==2) return test2;
	if(testNo==3) return test3;
    return 0;
}


// Averages the test scores

public void average()
{
    averageScore = (test1 + test2 + test3)/3;
    return;
}


// Return details of student

public String toString()
{
    String result;

    result = firstName + " " + lastName + "\n";
    result += "Home Address:\n" + homeAddress + "\n";
    result += "School Address:\n" + schoolAddress +"\n";
    result += "Test Scores:\n";
    result += "Test score1: " + test1 + "\n";
    result += "Test score2: " + test2 + "\n";
    result += "Test score3: " + test3 + "\n";
    result += "Average Score: " + averageScore ;

    return result;
}

}
