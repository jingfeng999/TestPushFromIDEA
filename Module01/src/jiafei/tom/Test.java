package jiafei.tom;
/**
 * @author jingfeng999
 * @create 2020-03-17 16:43
 */
public class Test {
    public static void main(String[] args) {
        Student[] ss=new Student[3];
        ss[0]=new Student("1","json","girl",20);
        ss[1]=new Student("2","ajax","man",20);
        ss[2]=new Student("3","tomcat","both",20);
        for(int i=0 ; i < ss.length ; i++){
            Student.display(ss[i]);
        }
    }
}

class Student{
    private String id;
    private String name;
    private String sex;
    private Integer age;

    Student(String id,String name,String sex,Integer age){
        this.id=id;
        this.name=name;
        this.sex=sex;
        this.age=age;
    }

    public static void display(Student student){
        System.out.println(student.id+","+ student.name+","+student.sex+","+student.age);
    }
}