install.packages("lpSolve")
#SOLVE FOLLOWING ASSIGNMENT PROBLEM REPRESENTED IN FOLLOWING MATRIX USING R PROGRAMMING
# Assignment Problem
#       JOB1    JOB2    JOB3
#W1     15      10      9
#W2     9       15      10
#W3     10      12      8

# Import lpSolve package
library(lpSolve)

# Set assignment costs matrix
costs <- matrix(c(15, 10, 9,
                  9, 15, 10,
                  10, 12 ,8), nrow = 3, byrow = TRUE)

# Print assignment costs matrix
costs

# Final value (z)
lp.assign(costs)

# Variables final values
lp.assign(costs)$solution
