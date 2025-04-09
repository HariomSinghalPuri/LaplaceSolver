// File: src/core/ODEParser.java
package core;

import java.util.ArrayList;
import java.util.List;

public class ODEParser {

    public static class Term {
        public int order;
        public int coefficient;

        public Term(int order, int coefficient) {
            this.order = order;
            this.coefficient = coefficient;
        }

        @Override
        public String toString() {
            return coefficient + "*y^(" + order + ")";
        }
    }

    public List<Term> parseEquation(String equation) {
        List<Term> terms = new ArrayList<>();
        equation = equation.replaceAll("-", "+-");
        String[] parts = equation.split("\\+");

        for (String part : parts) {
            part = part.trim();
            if (part.isEmpty()) continue;

            int coefficient = 1;
            int order = 0;

            if (part.contains("y''")) {
                order = 2;
                part = part.replace("y''", "").trim();
            } else if (part.contains("y'")) {
                order = 1;
                part = part.replace("y'", "").trim();
            } else if (part.contains("y")) {
                order = 0;
                part = part.replace("y", "").trim();
            }

            if (!part.isEmpty()) {
                coefficient = Integer.parseInt(part);
            }

            terms.add(new Term(order, coefficient));
        }

        return terms;
    }
}
