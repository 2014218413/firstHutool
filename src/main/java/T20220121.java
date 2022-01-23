import java.util.*;

public class T20220121 {
    /**
     * Student
     * name score
     *
     * 5
     *
     * List
     *
     *
     * */
    public static void main(String[] args) {
        Student student1 = new Student("s1",1.6);
        Student student2 = new Student("s2",1.6);
        Student student3 = new Student("s3",4.6);
        Student student4 = new Student("s4",4.6);
        Student student5 = new Student("s5",5.6);
        Student student6 = new Student("s6",5.6);

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);

//        Vector vector = new Vector();
//        vector.add("ads");
//        System.out.println(vector.get(0));
//
//        list.stream().sorted(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int) (o2.getScore()-o1.getScore());
//            }
//        }).forEach(i -> {
//            vector.add(i.getScore());
//        });
//
//
//        double scoreFlag = (double) vector.get(2);
//
//        list.stream().forEach(i -> {
//            if (i.getScore()==scoreFlag) {
//                System.out.println(i.getName());
//            }
//        });

//
        list.stream().sorted(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o2.getScore()-o1.getScore());
            }
        }).forEach(i -> {
            System.out.println(i.getName());
        });

        System.out.println(list.get(0).getName());
//        System.out.println(list.get(0).getName());
//        double d1 = list.get(0).getScore();
//        double d2 = 0;
//        int index = 0;
//
//        for (int i = 0;i<list.size();i++) {
//            if (d1 != list.get(i).getScore()) {
//                d2 = list.get(i).getScore();
//                index = i;
//                System.out.println(list.get(i).getName());
//                break;
//            }
//        }
//
//        for (int i = index;i<list.size();i++) {
//            if (d2 == list.get(i).getScore()) {
//                System.out.println(list.get(i).getName());
//            }
//            else {
//                break;
//            }
//        }


//        Collections.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int) (o2.getScore()-o1.getScore());
//            }
//        });


    }
}
