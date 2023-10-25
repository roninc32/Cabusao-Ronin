public class Student {
   String first_name, middle_name, last_name, suffix;
   
   public Student() {
   }
   
   public String getFirstName() {
      return first_name;
   }
   
   public String getMiddleName() {
      return middle_name;
   }
   
   public String getLastName() {
      return last_name;
   }
   
   public String getSuffix() {
      return suffix;
   }
   
   public void setFirstName(String first_name) {
      this.first_name = first_name;
   }
   
   public void setMiddleName(String middle_name) {
      this.middle_name = middle_name;
   }
   
   public void setLastName(String last_name) {
      this.last_name = last_name;
   }
   
   public void setSuffix(String suffix) {
      if(!suffix.isEmpty()) {
      this.suffix = suffix;
      } else
         this.suffix = "Not Available";
   }
   
   public String getFullName() {
      String fullname = "\nFirst Name: " + first_name +
                        "\nMiddle Name: " + middle_name +
                        "\nLast Name: " + last_name +
                        "\nSuffix: " + suffix +
                        "\nFull Name: " + first_name +
                        " " + middle_name +
                        " " + last_name +
                        " " + suffix;
      return fullname;
   }
   
}