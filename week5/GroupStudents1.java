public class GroupStudents1
{
   public static void main(String [] args)
   {
      // Student1 [] group1 = {
      //          new Student1("John", 50),
      //          new Student1("Abby", 40),
      //          new Student1("Dylan", 20),
      //          new Student1("Carl", 70),
      //          new Student1("Maeve", 70),
      //          new Student1("Chris", 46),
      //          new Student1("James", 55),
      //          new Student1("Anne", 63),
      //       };

      // Test1.print(group1);
      // Test2.print(group1);
      // Test3.print(group1);

      // Student2 [] group2 = {
      //    new Student2("John", 50),
      //    new Student2("Abby", 40),
      //    new Student2("Dylan", 20),
      //    new Student2("Carl", 70),
      //    new Student2("Maeve", 70),
      //    new Student2("Chris", 46),
      //    new Student2("James", 55),
      //    new Student2("Anne", 63),
      // };

      Student2 [] group3 = {
         new Student2("John", 50),
         new Student2("Abby", 40),
         new Student2("Dylan", 20),
      };

      // Test4.print(group2);
      // Test5.printHonours(group2);
      // Test6.printForties(group2);
      // int numPassed = Test7.numberPasses(group2);
      // System.out.println(numPassed + " students passed out of " + group2.length);
      // System.out.println("That is an " + 100.0 * numPassed / group2.length + "% pass rate.");
      // Student2 best = Test8.getBestStudent(group2);
      // System.out.println("The best student was " + best.getName() + " with a mark of " + best.getMark());
      double passingAverage = Test9.getPassingAverage(group3);
      System.out.println("The average mark of all students who passed is " + passingAverage);   }
}
