package student;

import java.time.LocalDate;

public class Student {
    private int id;
    private String name;
    private boolean gender;
    private LocalDate birthday;
    private LocalDate startday;
    private boolean isPartyMember;
    private String address;
    private int phone;

    public Student(int id, String name, boolean gender, LocalDate birthday, LocalDate startday, boolean isPartyMember, String address, int phone) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.startday = startday;
        this.isPartyMember = isPartyMember;
        this.address = address;
        this.phone = phone;


    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", startday=" + startday +
                ", isPartyMember=" + isPartyMember +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }


    public void print(){

        System.out.println(toString());
    }



}
