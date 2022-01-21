package ss6_inheritance.codegym_managerment.controller;

import ss6_inheritance.codegym_managerment.model.Student;

import java.util.*;

public class DemoMap {
    public static void main(String[] args) {
//        Map<Integer,String> map = new HashMap<>();
//        map.put(1,"Chanh1");
//        map.put(2,"Chanh2");
//        map.put(null,null);
//        map.put(3,null);
//        map.put(5,"Chanh2");
//        map.put(null,"Chanh2");
//        // duyệt Map cách 1
//        for (Map.Entry<Integer,String> entry: map.entrySet() ) {
//            System.out.println(entry.getKey() + "có giá trị là" + entry.getValue());
//        }
//        // duyetj map cách 2
//        Set<Integer> keySet = map.keySet();
//        for (Integer key: keySet){
//            System.out.println(key + "Có gí trị là: "+ map.get(key));
//        }
        // lưu số buổi vắng nghỉ của học vien
//        Map<Student,Integer> maps = new HashMap<>();
//        maps.put(new Student(1,"Chánh","Qn","12/12/2021"),1);
//        maps.put(new Student(1,"Chánh","Qn","12/12/2021"),2);
//        maps.put(new Student(2,"Chánh2","Qn","12/12/2021"),3);
//        Set<Student> studentSet = maps.keySet();
//        for (Student student: studentSet){
//            System.out.println("Id: " + student.getId() + " name: " +student.getName() +
//                                    "Số buổi vắng nghỉ: "+ maps.get(student));
//        }

        Map<Student,Integer> maps = new TreeMap<>();
        maps.put(new Student(1,"Chánh","DN","12/12/2021","fsfsdf",7),1);
        maps.put(new Student(1,"Chánh","Qn","12/12/2021","fsfsf",4),2);
        maps.put(new Student(2,"Chánh2","Qn","12/12/2021","fsfsf",5),3);
        Set<Student> studentSet = maps.keySet();
        for (Student student: studentSet){
            if (student.getAddress().equals("DN")){
                System.out.println("Id: " + student.getId() + " name: " +student.getName() +
                        "Số buổi vắng nghỉ: "+ maps.get(student));
            }

        }

        // Đến số lượng các từ xuất hiện trong chuỗi
//        "helo world hello hello world"
    }

}
