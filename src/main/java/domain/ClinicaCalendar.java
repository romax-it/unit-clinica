package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Getter
@Setter
public class ClinicaCalendar {

private List<PacientAppointment> appointments;

    public ClinicaCalendar() {
        appointments = new ArrayList<>();
    }

    public void addAppointment(String fecha, String nombresPaciente, String apellidosPaciente, String nombreDoctor) {
        Doctor doctor = new Doctor(nombreDoctor);
        LocalDateTime localDateTime;
        try {
            localDateTime = LocalDateTime.parse(fecha.toUpperCase(), DateTimeFormatter.ofPattern("d/M/yyyy h:mm a"));
        } catch (Exception ex) {
            throw new RuntimeException("Error convirtiendo fecha de la cita");
        }
        PacientAppointment pacientAppointment = new PacientAppointment(localDateTime, nombresPaciente, apellidosPaciente, doctor);
        appointments.add(pacientAppointment);
    }
}
