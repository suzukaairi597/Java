package sub6;

//1) Pet 클래스 정의
class Pet {
 public void makeSound() {
     System.out.println("동물이 소리를 냅니다.");
 }
}

//2) Pet 클래스를 상속받는 Dog, Cat 클래스 정의
class Dog extends Pet {
 @Override
 public void makeSound() {
     System.out.println("멍멍");
 }
}

class Cat extends Pet {
 @Override
 public void makeSound() {
     System.out.println("야옹");
 }
}

//3) Main 클래스 정의
public class makeSound {
 public static void main(String[] args) {
     Dog myDog = new Dog();
     Cat myCat = new Cat();

     // printSound() 메서드 호출
     printSound(myDog);
     printSound(myCat);
 }

 // 정적 메서드 printSound() 정의
 // 매개변수로 부모 클래스인 Pet 타입을 사용하면 Dog와 Cat 모두 받을 수 있습니다 (다형성)
 public static void printSound(Pet pet) {
     pet.makeSound();
 }
}
