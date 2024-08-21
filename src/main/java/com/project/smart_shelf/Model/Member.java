package com.project.smart_shelf.Model;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String email;

    private String phoneNumber;

    @Temporal(TemporalType.DATE)
    private Date membershipDate;

    @OneToMany(mappedBy = "member")
    private List<Loan> loans;
}
