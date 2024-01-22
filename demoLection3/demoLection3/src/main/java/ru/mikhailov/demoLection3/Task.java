package ru.mikhailov.demoLection3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Task {
    private UUID uuid;
    private String name;
    private String description;
    private Status status;
    private LocalDateTime complitionTime;

    public enum Status {
        TO_DO,
        IN_PROGRESS,
        DONE
    }

    public Task(String name, String description) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.status = Status.TO_DO;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getComplitionTime() {
        return complitionTime;
    }

    public void setComplitionTime(LocalDateTime complitionTime) {
        this.complitionTime = complitionTime;
    }
}
