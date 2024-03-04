package dio.spring.security.model;

public record RegisterDTO(String login, String password, UserRole role) {
}
