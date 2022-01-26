//package ss6_inheritance.codegym_managerment.controller;
//
//import ss6_inheritance.codegym_managerment.model.CompaByAddress;
//import ss6_inheritance.codegym_managerment.model.Student;
//
//import java.util.*;
//
//public class DemoArraylist {
//    public static void main(String[] args) {
//        ArrayList<Student> studentArrayList = new ArrayList<>();
//        studentArrayList.add(new Student(2,"chanh3","qn","12/12/1985","fsfs",7));
//        studentArrayList.add(new Student(2,"chanh2","dn","12/12/1985","fsfs",7));
//        studentArrayList.add(new Student(2,"chanh2","qn","12/12/1985","fsfs",7));
//        studentArrayList.add(new Student(4,"chanh4","hue","12/12/1985","fsfs",7));
//        studentArrayList.add(new Student(3,"chanh3","dn","12/12/1985","fsfs",7));
////        LinkedList<String> stringLinkedList = new LinkedList<>();
////        stringLinkedList.add("chanh1");
////        stringLinkedList.add("chanh2");
////        stringLinkedList.add("chanh3");
//        // duyệt list
//        System.out.println("trước khi sắp xêp");
//        for (int i = 0; i <studentArrayList.size() ; i++) {
//            System.out.println(studentArrayList.get(i).toString());
//        }
////        Collections.sort(studentArrayList);
//        System.out.println("sau khi sắp xếp id và tên");
//        for (int i = 0; i <studentArrayList.size() ; i++) {
//            System.out.println(studentArrayList.get(i).toString());
//        }
//        System.out.println("Sau khi sắp xếp theo địa chỉ");
//        CompaByAddress compaByAddress = new CompaByAddress();
//        Collections.sort(studentArrayList,compaByAddress);
//        for (int i = 0; i <studentArrayList.size() ; i++) {
//            System.out.println(studentArrayList.get(i).toString());
//        }
////        ArrayList arrayList = new ArrayList();
////        arrayList.add(1);
////        arrayList.add(new Student());
////        arrayList.add("cdhanh");
//
////         Set => lưu không trung lặp
////        HashSet<Student> studentHashSet = new HashSet<>();
////        Student student1 = new Student(1,"chanh","dn","12/12/1985");
////        studentHashSet.add(student1);
////        studentHashSet.add(new Student(2,"chanh2","dn","12/12/1985"));
////        studentHashSet.add(new Student(3,"chanh3","dn","12/12/1985"));
////        studentHashSet.add(student1);
////
////        for (Student student: studentHashSet) {
////            System.out.println(student.toString() +"hascod " +student.hashCode());
////        }
//
////        Student student1 =new Student(1,"chanh","dn","12/12/1985");
////        Student student2 =new Student(1,"chanh","dn","12/12/1985");
////        System.out.println(student1==student2); // so sanh địa chỉ vùng nhớ
////        System.out.println(student1.equals(student2)); // số sanh trên giá trị
//
////        Set<Student> studentTreeSet = new TreeSet<>();
////        studentTreeSet.add(new Student(3,"chanh3","dn","12/12/1985"));
////        studentTreeSet.add(new Student(2,"chanh3","dn","12/12/1985"));
////        studentTreeSet.add(new Student(2,"chanh2","dn","12/12/1985"));
////        studentTreeSet.add(new Student(2,"chanh2","dn","12/12/1985"));
////        studentTreeSet.add(new Student(3,"chanh3","dn","12/12/1985"));
////
////        for (Student student: studentTreeSet) {
////            System.out.println(student.toString() +"hascod " +student.hashCode());
////        }
//    }
//}
