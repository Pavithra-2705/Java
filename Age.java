class age1{
    int age =19;
}
class person extends Age{
    String name ="Pavithra";
}
class Age{
     public static void main(String[] args) {
        person p1=new person ();
        System.out.println("Name :"+p1.name);
        age1 a1=new age1 ();
        System.out.println("Age :"+a1.age);
        
    }
}
        
