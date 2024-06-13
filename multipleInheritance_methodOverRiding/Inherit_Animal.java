// exp 8c

class Animal {
    Animal() {
        System.out.println("In the constructor of class Animal");
    }

    public void show() {
        System.out.println("Method in Animal");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("In constructor Dog");
    }

    public void show() {
        super.show();
        System.out.println("Method in Dog");
    }
}

class Cat extends Dog {
    Cat() {
        System.out.println("In constructor Cat");

    }

    public void show() {
        System.out.println("Method in Cat");
    }
}

class Inherit_Animal {
    public static void main(String args[]) {
        Cat c = new Cat();
    
        Dog b = new Dog();
        b.show();
        Animal a = new Animal();
    
    }
}