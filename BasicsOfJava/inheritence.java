package BasicsOfJava;

class Animal{
    void eat(){
   System.out.println("burger");
    }
    }

    class Dog extends Animal{
        void bark(){
            System.out.println("barking...");
        }
    }

    class puppy extends Dog{
        void play(){
            System.out.println("playing..");
        }
    }

    class cat extends Animal {
      void milk(){
        System.out.println("drinking");
      }
        
    }


public class inheritence {
    public static void main(String[] args) {
        Dog d1=new Dog();
        puppy p1=new puppy();
        cat c1=new cat();
        c1.eat();
        d1.bark();
        d1.eat();
        // p1.play();
        // p1.bark();
        // p1.eat();

        
    }
}
