package org.example.Config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;


@Data
public class MyCustomData implements Serializable {
    @NonNull
    private String value;
}