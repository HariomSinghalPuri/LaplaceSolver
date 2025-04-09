# 🧠 Laplace-based ODE Solver in Java

This is a console-based Java application that solves **second-order ordinary differential equations (ODEs)** using the **Laplace Transform** method. It allows the user to enter a differential equation and initial conditions, applies Laplace Transform, solves algebraically, and returns the time-domain solution via Inverse Laplace Transform — all with a step-by-step breakdown.

---

## 📚 Table of Contents
- [Features](#features)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [Usage](#usage)
- [Sample Input/Output](#sample-inputoutput)
- [Future Improvements](#future-improvements)
- [License](#license)

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

### Run Locally

```bash
git clone https://github.com/yourusername/LaplaceSolver.git
cd LaplaceSolver
javac src/**/*.java
java src.Main



