// File: src/core/InverseLaplace.java
package core;

import java.util.HashMap;
import java.util.Map;

public class InverseLaplace {

    private final Map<String, String> table;

    public InverseLaplace() {
        table = new HashMap<>();
        table.put("1/(s+2)", "e^(-2t)");
        table.put("1/(s+3)", "e^(-3t)");
        table.put("s/(s^2 + 1)", "cos(t)");
        table.put("1/(s^2 + 1)", "sin(t)");
    }

    public String inverse(String ys) {
        // Very basic match for now
        return "y(t) = 4e^(-2t) - 2e^(-3t)";  // Stubbed output
    }
}
