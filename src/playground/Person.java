package playground;

public class Person {
        String fname;
        String lname;
        Integer age;

        public Person(String fname, String lname, Integer age){
            this.fname=fname;
            this.lname=lname;
            this.age=age;
        }
        public String getFName(){
            return this.fname;
        }
        public void setFName(String fname){
            this.fname = fname;
        }
        public String getLName(){
            return this.lname;
        }
        public void setFLame(String lname){
             this.lname=lname;
        }
        public Integer getAge(){
            return this.age;
        }
        public void setAge(Integer age){
             this.age=age;
        }

    @Override
    public String toString() {
        return "Person{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                '}';
    }
}

