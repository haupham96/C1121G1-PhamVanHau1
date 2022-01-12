package ss10_list.exercise.deploy_array_list_methods;

public class MyArrayListTest {
    public static void main(String[] args) {
        Student a = new Student(1, "Hau");
        Student b = new Student(2, "Hau1");
        Student c = new Student(3, "Hau2");
        Student d = new Student(4, "Hau3");
        Student e = new Student(5, "Hau4");
        Student f = new Student(6, "Hau5");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> studentMyArrayList2 = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
//        studentMyArrayList.add(2,f);
//        System.out.println(studentMyArrayList.size());
//        System.out.println(studentMyArrayList.get(2));
//        System.out.println(studentMyArrayList.indexOf(a));
//        System.out.println(studentMyArrayList.contains(f));
        studentMyArrayList2 = studentMyArrayList.clone();
        studentMyArrayList2.remove(0);
        for (int i = 0; i < studentMyArrayList2.size(); i++) {
            System.out.println(studentMyArrayList2.get(i));
        }
    }
}
