// exp 7b

class Staff {
    int code;
    String name;
}

class Teacher extends Staff {
    int exp;
    String subject;

    void read() {

    }

    void display() {

    }

}

class Typist extends Staff {
    int exp, speed;
}

class Officer extends Staff {
    String dep;
    char grade;

    void read() {

    }

    void display() {

    }
}

class Regular extends Typist {
    int sal;
}

class Casual extends Typist {
    int daily_wage;
}

public class Hierarchy_inheritance {
    public static void main(String[] args) {

    }
}
