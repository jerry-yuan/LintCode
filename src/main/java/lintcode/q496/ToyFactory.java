package lintcode.q496;

interface Toy {
    void talk();
}

class Dog implements Toy {
    @Override
    public void talk() {
        System.out.println("Wow");
    }
    // Write your code here
}

class Cat implements Toy {
    @Override
    public void talk() {
        System.out.println("Meow");
    }
    // Write your code here

}

public class ToyFactory {
    /**
     * @param type a string
     * @return Get object of the type
     */
    public Toy getToy(String type) {
        // Write your code here
        if("Dog".equals(type)){
            return new Dog();
        }else if("Cat".equals(type)){
            return new Cat();
        }
        return null;
    }
}
