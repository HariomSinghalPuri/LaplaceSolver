// File: src/ui/ConsoleUI.java
package ui;

import core.*;

import java.util.List;
import java.util.Scanner;

public class ConsoleUI {

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your ODE (e.g., y'' + 5y' + 6y): ");
        String equation = scanner.nextLine();

        System.out.print("Enter y(0): ");
        double y0 = scanner.nextDouble();
        System.out.print("Enter y'(0): ");
        double y1 = scanner.nextDouble();

        ODEParser parser = new ODEParser();
        List<ODEParser.Term> terms = parser.parseEquation(equation);

        LaplaceTransform laplace = new LaplaceTransform();
        String transformed = laplace.applyTransform(terms, y0, y1);

        EquationSolver solver = new EquationSolver();
        String ys = solver.solveForY(transformed);

        InverseLaplace inverse = new InverseLaplace();
        String yt = inverse.inverse(ys);

        System.out.println("\nStep-by-step Solution:");
        System.out.println("1. Original ODE: " + equation);
        System.out.println("2. Laplace Transformed: " + transformed);
        System.out.println("3. Solved Y(s): " + ys);
        System.out.println("4. Inverse Laplace: " + yt);
    }
}
