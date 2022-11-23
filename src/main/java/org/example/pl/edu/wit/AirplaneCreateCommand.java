package org.example.pl.edu.wit;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Map;

@Getter
@Builder
public class AirplaneCreateCommand {
    @NonNull
    private final AirplaneType type;

    private final String code;

    @NonNull
    private final Map<SeatType, SeatDefinition> seatDefinitions;

    public Map<SeatType, Integer> getSeatCounts() {
        Map.Entry[] entries = seatDefinitions.entrySet().stream()
                .map(entry -> Map.entry(entry.getKey(), entry.getValue().count))
                .toArray(Map.Entry[]::new);

        return Map.ofEntries(entries);
    }

    public Map<SeatType, Float> getSeatModifier() {
        Map.Entry[] entries = seatDefinitions.entrySet().stream()
                .map(entry -> Map.entry(entry.getKey(), entry.getValue().modifier))
                .toArray(Map.Entry[]::new);

        return Map.ofEntries(entries);
    }

    @RequiredArgsConstructor(staticName = "of")
    public static class SeatDefinition {
        private final int count;
        private final float modifier;
    }
}