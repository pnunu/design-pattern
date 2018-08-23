package pnunu.lambda;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @Author pnunu@git
 * @Date 2018/4/2 18:28
 */
//@AllArgsConstructor
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Person {
    @Getter
    private String firstName;
    @Getter
    private String lastName;
    @Getter
    private int age;

//    public Person(String firstName, String lastName, int age) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//    }
}
