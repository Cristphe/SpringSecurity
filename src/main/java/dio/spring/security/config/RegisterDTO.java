package dio.spring.security.config;


import dio.spring.security.model.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
