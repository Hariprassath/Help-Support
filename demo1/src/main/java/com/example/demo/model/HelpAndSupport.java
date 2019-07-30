package com.example.demo.model;


         import lombok.Data;
        import lombok.RequiredArgsConstructor;

        import javax.validation.constraints.Digits;
        import javax.validation.constraints.NotBlank;
        import javax.validation.constraints.NotNull;
        import javax.validation.constraints.Size;

@Data
@RequiredArgsConstructor
public class HelpAndSupport {

    @NotBlank
    @Size(min = 2,message = "Atleast 2 characters")
    private  String username;
    @NotBlank
    @Digits(integer=10,message="Invalid no", fraction = 0)
    private String mobile_no;
    @NotBlank
    @Size(min = 3,message = "Invalid email")
    private String email;
    @NotBlank
    @Size(min = 5,message = "Must be minimum 5 characters")
    private String message;




}

