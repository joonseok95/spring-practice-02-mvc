package hello.servlet.domain.member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Member {

    private Long id;
    private String username;
    private int age;

    public Member( String username, int age) {
        this.username = username;
        this.age = age;
    }

    public Member() {
    }
}
