install.packages("lpSolve")
##SOLVE FOLLOWING TRANSPORTATION PROBLEM IN WHICH CELL ENTRIES REPRESENT UNIT COSTS USING R PROGRAMMING.

#   "Customer 1", "Customer 2", "Customer 3", "Customer 4"  SUPPLY
#sUPPLIER 1     10          2               20            11          15
#sUPPLIER 1     12          7               9             20          25
#sUPPLIER 1     4           14              16            18          10
#DEMAND         5           15              15            15

# Import lpSolve package
library(lpSolve)

# Set transportation costs matrix
costs <- matrix(c(10, 2, 20, 11,
                  12, 7, 9, 20,
                  4, 14 , 16, 18), nrow = 3, byrow = TRUE)

# Set customers and suppliers' names
colnames(costs) <- c("Customer 1", "Customer 2", "Customer 3", "Customer 4")
rownames(costs) <- c("Supplier 1", "Supplier 2", "Supplier 3")

# Set unequality/equality signs for suppliers
row.signs <- rep("<=", 3)

# Set right hand side coefficients for suppliers
row.rhs <- c(15, 25, 10)

# Set unequality/equality signs for customers
col.signs <- rep(">=", 4)

# Set right hand side coefficients for customers
col.rhs <- c(5, 15, 15, 15)

# Final value (z)
TotalCost <- lp.transport(costs, "min", row.signs, row.rhs, col.signs, col.rhs)

# Variables final values
lp.transport(costs, "min", row.signs, row.rhs, col.signs, col.rhs)$solution
print(TotalCost)
