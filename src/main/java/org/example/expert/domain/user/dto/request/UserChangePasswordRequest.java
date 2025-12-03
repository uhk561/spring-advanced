package org.example.expert.domain.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserChangePasswordRequest {

    @NotBlank
    private String oldPassword;

    @Size(min = 8, message = "8글자 이상이여야합니다")
    @Pattern(regexp = ".*[A-Z].*", message = "숫자와 대문자를 각각 1개이상 포함하여야합니다.")
    @NotBlank
    private String newPassword;
}
