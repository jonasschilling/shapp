package com.schilling.shapp.model.general;

import com.schilling.shapp.model.manage.Appointment;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Shapp {
    private UUID shappId;
    private String shappName;
    private List<User> mates;
    private List<Appointment> appointments;

    public UUID getShappId() {
        return shappId;
    }

    public void setShappId(UUID shappId) {
        this.shappId = shappId;
    }

    public String getShappName() {
        return shappName;
    }

    public void setShappName(String shappName) {
        this.shappName = shappName;
    }

    public List<User> getMates() {
        return mates;
    }

    public void setMates(List<User> mates) {
        this.mates = mates;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shapp shapp = (Shapp) o;
        return shappId.equals(shapp.shappId) && shappName.equals(shapp.shappName) && mates.equals(shapp.mates) && appointments.equals(shapp.appointments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shappId, shappName, mates, appointments);
    }
}
