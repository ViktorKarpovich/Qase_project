package org.tms.api.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Suite {
    private String title;
    private String description;
    private String preconditions;
}
