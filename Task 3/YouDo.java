// User.java
class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}

// EmailValidator.java
class EmailValidator {

    public boolean isValid(String email) {
        return email != null && email.contains("@");
    }
}

// UserRepository.java
interface UserRepository {
    void save(User user);
}

// DatabaseUserRepository.java
class DatabaseUserRepository implements UserRepository {

    @Override
    public void save(User user) {
        System.out.println("Connecting to database...");
        System.out.println(
            "Saving user " + user.getUsername() + " to users table."
        );
    }
}

// UserService.java
class UserService {

    private UserRepository userRepository;
    private EmailValidator emailValidator;

    public UserService(
            UserRepository userRepository,
            EmailValidator emailValidator) {

        this.userRepository = userRepository;
        this.emailValidator = emailValidator;
    }

    public void registerUser(User user) {

        if (!emailValidator.isValid(user.getEmail())) {
            System.out.println("Invalid email format.");
            return;
        }

        userRepository.save(user);
    }
}

// Main.java
public class Main {

    public static void main(String[] args) {

        User user = new User(
                "John",
                "john@gmail.com"
        );

        UserRepository repository =
                new DatabaseUserRepository();

        EmailValidator validator =
                new EmailValidator();

        UserService userService =
                new UserService(repository, validator);

        userService.registerUser(user);
    }
}
