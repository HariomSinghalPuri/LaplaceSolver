// File: src/core/LaplaceTransform.java
package core;

import java.util.List;

public class LaplaceTransform {

    public String applyTransform(List<ODEParser.Term> terms, double y0, double y1) {
        StringBuilder sb = new StringBuilder();

        for (ODEParser.Term term : terms) {
            switch (term.order) {
                case 2 -> sb.append("+(").append(term.coefficient)
                        .append(")*((s^2)*Y - ").append(y0).append("*s - ").append(y1).append(")");
                case 1 -> sb.append("+(").append(term.coefficient)
                        .append(")*((s)*Y - ").append(y0).append(")");
                case 0 -> sb.append("+(").append(term.coefficient).append(")*Y");
            }
        }

        return sb.toString().replaceFirst("^\\+", "");
    }
}
