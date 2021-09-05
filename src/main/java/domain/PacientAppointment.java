package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class PacientAppointment {
    private LocalDateTime fecha;
    private String nombresPaciente;
    private String apellidosPaciente;
    private Doctor doctor;
}
