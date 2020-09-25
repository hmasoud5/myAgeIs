class Main {
  public static void main(String[] args) {
   
    int myAge = 15;
    int myBirthday = 416;
    int todaysDate = 923;

    if (myBirthday == todaysDate){
      myAge = myAge + 1;

       System.out.println("I am "+ myAge + " yearsOld");
    }else {
       System.out.println(" I am still " + myAge );
     }
  }
}