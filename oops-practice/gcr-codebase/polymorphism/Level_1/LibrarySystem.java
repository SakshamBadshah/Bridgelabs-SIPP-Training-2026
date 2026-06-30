class LibraryMember {

    String memberName, memberId;

    LibraryMember(String n,String id){

        memberName=n;
        memberId=id;
    }

    double calculateFine(int days){
        return 0;
    }

    void display(){

        System.out.println(memberName+
                "  "+memberId);
    }
}

class StudentMember extends LibraryMember{

    StudentMember(String n,String id){
        super(n,id);
    }

    @Override
    double calculateFine(int d){
        return d*2;
    }
}

class FacultyMember extends LibraryMember{

    FacultyMember(String n,String id){
        super(n,id);
    }

    @Override
    double calculateFine(int d){
        return d*1;
    }
}

class GuestMember extends LibraryMember{

    GuestMember(String n,String id){
        super(n,id);
    }

    @Override
    double calculateFine(int d){
        return d*5;
    }
}

public class LibrarySystem{

    public static void main(String args[]){

        LibraryMember m[]={

                new StudentMember("Rahul","S101"),
                new FacultyMember("Amit","F102"),
                new GuestMember("Riya","G103")
        };

        String search="F102";

        for(LibraryMember x:m){

            x.display();

            System.out.println(
            "Fine = "+x.calculateFine(5));

            if(x.memberId.equals(search))
                System.out.println(
                "Found : "+x.memberName);
        }
    }
}