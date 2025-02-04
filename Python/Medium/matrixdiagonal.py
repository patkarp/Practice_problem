'''
/**
 * Find Diagonal in Matrix in matrix..
 * return Diagonal from Right to Left and Left to Right
 * 
 * Matrix
 * [ 2, 4,6]
 * [7, 9, 10]
 * [15, 6, 12]
 * [10, 9, 6]
 * 
 * 
 * Left to Right = > 2, 
 */
 '''

class matrixdiagonal:



    matrix=[[ 2, 4,6],[7, 9, 10],[15, 6, 12]]
    # print(matrix)
    rowlen=len(matrix[0])
    columnlen=len(matrix)
    print("Rowlens:",rowlen)
    print("Columnlens:",columnlen)

    # print("Rows", matrix[0][0])

    for row in matrix:
        for elements in row:
            print(elements,end=" ")
        print("\n")

    #print Diagonal:
    print("Diagonal Matrix")
    for i in range(len(matrix)):
        print(matrix[i][i], end = " ")

    #print anti Diagonal
    print("\nAnti Diagonal")
    n = len(matrix)
    print(n)
    for i in range(len(matrix)):
        print(matrix[i][n-1-i], end= " ")

    


