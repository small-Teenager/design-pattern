import java.io.Serializable;
import java.util.Objects;

/**
 * @description:
 * @author: yaodong zhang
 * @date: 2021/11/1 10:25
 */
public class Person implements Serializable {
    private static final long serialVersionUID = -8985449674151437331L;
    private String userId;
    private String userName;
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(userId, person.userId) && Objects.equals(userName, person.userName) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


}
