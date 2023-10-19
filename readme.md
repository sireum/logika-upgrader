# Logika v3 to Kekinian Upgrader

This repository holds [Logika v3](https://logika.v3.sireum.org) truth table and propositional/predicate/programming 
logic proof to the new [Logika version](https://sireum.org).

The upgrader uses a syntax-based translation, thus, further tweaking may be required on some examples
(e.g., truth tables involving the implication operator due to column sensitivity and operator number of characters, 
programming logic involving sequence updates due to differences in generated claims, conditional proof function
definitions, or range quantification due to the new use of short-circuit implication/conjunction).

Note that Sireum IVE/IntelliJ's "Edit -> Column Selection Mode" is handy when adjusting a multiline character column in
truth tables.

## Requirement

* [Sireum](https://sireum.org/getting-started/)

## How To Use

1. Clone this repo locally and build the upgrader jar/batch file:
 
   ```
   git clone https://github.com/sireum/logika-upgrader
   sireum proyek assemble --jar logika-upgrader --uber --main Upgrader logika-upgrader
   ```

2. Run the batch file:

   * On **macOS/Linux**:

     ```sh
     out/logika-upgrader/assemble/logika-upgrader.jar.bat
     ```

   * On **Windows**:

     ```cmd
     out\logika-upgrader\assemble\logika-upgrader.jar.bat
     ```
     
   which will display its usage information:

   ```
   Usage: <input> [ <output> ] [ auto ] 
   ```
   
   The verifier assumes verified Logika v3 file as its `<input>`.
   If the `<output>` file is specified, then the '.logika'/'.sc' file extension for truth table/other.
   The last `auto` option should used for programming logic Auto or SymExe Logika v3 mode (by default
   the upgrader detects auto mode by determining whether `auto` or `symexe` is in the (lower-cased) `<input>` path. 

## Test

Execute [bin/test.cmd](bin/test.cmd) to run the upgrader on https://github.com/sireum/v3-logika-examples to see
example results (and tweaking needed compared to the corresponding hand-translated examples at 
https://github.com/sireum/logika-examples).