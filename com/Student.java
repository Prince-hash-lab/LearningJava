package com;

public class Student extends Member{

private int Fees;

private int Dues;

private String Name;

Student(String Name, int Id,int Fees,int Dues) {

super(Name, Id);

this.Name=Name;

this.Fees=Fees;

this.Dues=Dues;

}

int get_fees(){

return Fees;

}

int get_dues(){

return Dues;

}

@Override

String get_name() {

super.get_Id();

System.out.println("From Student");

return Name;

}

 

}