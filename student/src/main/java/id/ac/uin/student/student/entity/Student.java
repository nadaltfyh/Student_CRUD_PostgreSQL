package id.ac.uin.student.student.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty(message = "first name is required")
    @Column(nullable = false, name = "first_name")
    private String firstname;

    @NotEmpty(message = "last name is required")
    @Column(nullable = false, name = "last_name")
    private String lastname;

    @NotEmpty(message = "birth date is required")
    @Column(nullable = false, name = "birthDate")
    private String birthDate;

    @NotEmpty(message = "email is required")
    @Column(nullable = false, name = "email", unique = true)
    private String email;

    @NotEmpty(message = "phone number is required")
    @Column(nullable = false, name = "phone_number", unique = true)
    private String phoneNumber;

    @NotEmpty(message = "jurusan is required")
    @Column(nullable = false, name = "jurusan", unique = true)
    private String jurusan;
}
