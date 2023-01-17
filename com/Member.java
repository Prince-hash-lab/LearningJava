package com;

 

public class Member {

protected String Name;

protected int Id;

Member(String Name,int Id){

System.out.println("This is Member Class");

this.Name=Name;

this.Id=Id;

}

String get_name(){

System.out.println("Get name from Member class");

return Name;

}

int get_Id(){

return Id;

}

}