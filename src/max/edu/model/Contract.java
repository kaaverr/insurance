package max.edu.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Contract {

    private String id;
    private String name;
    private String description;
    private LocalDate date;
    private int insuranceSum;
    private int tarif;
    private Fillya fillya;
    private InsuranceType type;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}
