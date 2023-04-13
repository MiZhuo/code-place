package base;

/**
 * @author mizhuo
 */
public class User{
    public String name;
    public Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        User user = (User) o;
        return user.getName().equals(this.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
