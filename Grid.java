package com.company;

public class Grid
{
    int rows;
    int cols;
    private char grid[][];

    public Grid()
    {
        rows = 25;
        cols = 25;
    }

    public Grid(int rows, int cols)
    {
        this.rows = rows;
        this.cols = cols;
    }

    public void setValueAt(int row, int col, char val)
    {
       grid[row][col] = val;
    }

    public char getValueAt(int x, int y)
    {
        return grid[x][y];
    }

    public void init()
    {
        grid = new char[cols][rows];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                grid[j][i] = '*';
            }
        }
    }

    public void print2D()
    {
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                //To visually see the grid
                System.out.print(grid[j][i]);
            }
            System.out.println();
        }
    }
}
