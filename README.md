

# 🧠 Laplace-based ODE Solver in Java

This is a console-based Java application that solves **second-order ordinary differential equations (ODEs)** using the **Laplace Transform** method. It allows the user to enter a differential equation and initial conditions, applies Laplace Transform, solves algebraically, and returns the time-domain solution via Inverse Laplace Transform — all with a step-by-step breakdown.

---

## 📚 Table of Contents
- [Features](#features)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [Usage](#usage)
- [Sample Input/Output](#sample-inputoutput)
- [Run Locally](#Run-Locally)
- [Future Improvements](#future-improvements)


---

## ✅ Features

- Accepts 2nd order linear ODEs (homogeneous)
- Takes initial conditions `y(0)` and `y'(0)`
- Applies Laplace Transform rules
- Solves for `Y(s)`
- Applies Inverse Laplace to retrieve `y(t)`
- Displays each step in a readable format

---

## 🚀 Getting Started

### Prerequisites
- Java 11 or above
- Any Java IDE (IntelliJ, Eclipse, VS Code)


## ✨Project Structure

```bash
LaplaceSolver/
├── src/
│   ├── Main.java                    # Entry point
│   ├── core/
│   │   ├── ODEParser.java          # Parses user-input ODE
│   │   ├── LaplaceTransform.java   # Applies Laplace Transform
│   │   ├── EquationSolver.java     # Solves algebraic expression
│   │   ├── InverseLaplace.java     # Converts Y(s) to y(t)
│   └── ui/
│       └── ConsoleUI.java          # Handles console input/output
```


## 🧪 Usage
### Example Input:
```bash
Enter your ODE (e.g., y'' + 5y' + 6y): 
y'' + 5y' + 6y
Enter y(0): 
2
Enter y'(0): 
0
```

### Example Output:
```bash
Step-by-step Solution:
1. Original ODE: y'' + 5y' + 6y
2. Laplace Transformed: (1)*((s^2)*Y - 2.0*s - 0.0)+(5)*((s)*Y - 2.0)+(6)*Y
3. Solved Y(s): 2s + 10 / (s + 2)(s + 3)
4. Inverse Laplace: y(t) = 4e^(-2t) - 2e^(-3t)
```

## Run Locally

```bash
git clone https://github.com/HariomSinghalPuri/LaplaceSolver.git
cd LaplaceSolver
javac src/**/*.java
java src.Main
```





### Step-by-step Solution:
#
```bash
1. Original ODE: y'' + 5y' + 6y
2. Laplace Transformed: (1)*((s^2)*Y - 2.0*s - 0.0)+(5)*((s)*Y - 2.0)+(6)*Y
3. Solved Y(s): 2s + 10 / (s + 2)(s + 3)
4. Inverse Laplace: y(t) = 4e^(-2t) - 2e^(-3t)

```
### Future Improvements

Add GUI using JavaFX
Support non-homogeneous ODEs (e.g., with input functions like e^t)
Plot y(t) using JavaFX LineChart
Integrate symbolic algebra libraries (e.g., Symja) for full expression solving
Export results to PDF or Markdown

#
#

### Thank You ...
