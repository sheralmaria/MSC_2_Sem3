install.packages("lpSolve")
##SOLVE FOLLOWING LINEAR PROGRAMMING PROBLEM USING DUAL SIMPLEX METHOD USING R PROGRAMMING
# Max z=40x1+50x2
#subject to
#2x1 + 3x2 <= 3
#8x1 + 4x2 <= 5
# x1, x2>=0


# Import lpSolve package
library(lpSolve)

# Set coefficients of the objective function
f.obj <- c(40, 50)


# Set matrix corresponding to coefficients of constraints by rows
# Do not consider the non-negative constraint; it is automatically assumed
f.con <- matrix(c(2, 3,
                  8, 4), nrow = 2, byrow = TRUE)


# Set unequality signs
f.dir <- c("<=",
           "<=")

# Set right hand side coefficients
f.rhs <- c(3,
           5)


# Final value (z)
lp("max", f.obj, f.con, f.dir, f.rhs)

# Variables final values
lp("max", f.obj, f.con, f.dir, f.rhs)$solution

# Sensitivities
lp("max", f.obj, f.con, f.dir, f.rhs, compute.sens=TRUE)$sens.coef.from
lp("max", f.obj, f.con, f.dir, f.rhs, compute.sens=TRUE)$sens.coef.to

# Dual Values (first dual of the constraints and then dual of the variables)
# Duals of the constraints and variables are mixed
lp("max", f.obj, f.con, f.dir, f.rhs, compute.sens=TRUE)$duals

# Duals lower and upper limits
lp("max", f.obj, f.con, f.dir, f.rhs, compute.sens=TRUE)$duals.from
lp("max", f.obj, f.con, f.dir, f.rhs, compute.sens=TRUE)$duals.to
