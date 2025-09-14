//Requirements
//        Student s1 = new Student(101, "Amit", "CS", 8.5);
//        Student s2 = new Student(102, "Priya", "Math", 9.2);
//        Student s3 = new Student(103, "Rohan", "CS", 7.8);
//        Student s4 = new Student(104, "Sneha", "Physics", 4.5);





package com.cdacoopj;


import java.util.*;

public class Main {

    public static void main(String[] args) {
//        1. Registration List - ArrayList<Student>
//        ● Store students in registration order
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(101, "Amit", "CS", 8.5));
        students.add(new Student(102, "Priya", "Math", 9.2));
        students.add(new Student(103, "Rohan", "CS", 7.8));
        students.add(new Student(104, "Sneha", "Physics", 4.5));

        for(Student s: students){
            System.out.println(s);
        }



        System.out.println("============================================");
//      2. Merit List - Comparable<Student>
//      ● Sort by CGPA (descending order)
        List<Student> meritList = new ArrayList<Student>(students);
        Collections.sort(meritList);

        for(Student s: meritList){
            System.out.println(s);
        }



        System.out.println("============================================");
//        3. Alphabetical List - Comparator<Student>
//        ● Sort by name (A to Z)

        List<Student> nameSort= new ArrayList<Student>(students);
        Collections.sort(nameSort,new NameComparator());

        for(Student s: nameSort){
            System.out.println(s);
        }




        System.out.println("============================================");
//        4. Department Grouping - HashMap<String, List<Student>>
//        ● Group students by department
//          Cre

//        students.add(new Student(101, "Amit", "CS", 8.5));
//        students.add(new Student(102, "Priya", "Math", 9.2));
//        students.add(new Student(103, "Rohan", "CS", 7.8));
//        students.add(new Student(104, "Sneha", "Physics", 4.5));
           Map<String, ArrayList<String>>  deptGrp = new HashMap<String, ArrayList<String>>();

           for(Student s: students){
               if (!deptGrp.containsKey(s.getDepartment())){
                   deptGrp.put(s.getDepartment(), new ArrayList<String>());
               }
               deptGrp.get(s.getDepartment()).add(s.getName());
           }
            System.out.println(deptGrp);



        System.out.println("============================================");
//        5. Unique Names - HashSet<String>
//        ● Track unique student names
            Set<String> uniqNames = new HashSet<String>();
            for(Student s: students){
                uniqNames.add(s.getName());
            }

            uniqNames.forEach(n-> System.out.println(n));


        System.out.println("============================================");
//        6. Roll Number Sorting - TreeSet<Student>
//        ● Auto-sort by roll number
        Set<Student> rollSort = new TreeSet<Student>(new RollComparator());
        rollSort.addAll(students);
        for(Student s: rollSort){
            System.out.println(s);
        }


        System.out.println("============================================");
//        7. Performance Filter - Iterator
//        ● Remove students with CGPA < 5.0

        List<Student> filterGpa= new ArrayList<Student>(students);
//        for(Student s: students){
//            if(s.getCgpa()>=5.0){
//                filterGpa.add(s);
//            }
//        }
//        for(Student s: filterGpa){
//            System.out.println(s);
//        }
        Iterator<Student> i = filterGpa.iterator();
        while(i.hasNext()){
            if(i.next().getCgpa()<5){
                i.remove();
            }
        }
        for(Student s: filterGpa){
            System.out.println(s);
        }



        System.out.println("============================================");
//         8. Recent Registrations - Stack<Student>
//        ● Track last added students (LIFO)
        Stack<Student> studentStack = new Stack<Student>();
        studentStack.addAll(students);
        System.out.println("The Last student registered details is "+ studentStack.peek() );





        System.out.println("============================================");

//         9. Scholarship Queue - Queue<Student>
//        ● Process students for scholarships (FIFO)
            Queue<Student> scholarshipQueue = new ArrayDeque<Student>(students);




        System.out.println("============================================");

//         10. Hostel Applications - LinkedList<Integer>
//        ● Add priority applicants at front
//        ● Add regular applicants at end
//        ● Remove from both ends for allocation

        Deque<Integer> hostelqueue = new LinkedList<Integer>();

        HostelApplication.addRegular(hostelqueue, 101);
        HostelApplication.addPriority(hostelqueue, 105);
        HostelApplication.addPriority(hostelqueue, 102);
        HostelApplication.removeFirst(hostelqueue);
        HostelApplication.removeLast(hostelqueue);


    }
}
