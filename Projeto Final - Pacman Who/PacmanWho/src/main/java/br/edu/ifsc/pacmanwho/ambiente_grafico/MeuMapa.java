/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.pacmanwho.ambiente_grafico;

/**
 *
 * @author Vitor
 */
public class MeuMapa {

    public static int[][] meuMapa = {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
    {1, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 2, 1},
    {1, 5, 1, 1, 5, 1, 1, 5, 1, 1, 1, 1, 1, 1, 5, 1, 1, 1, 5, 1, 1, 1, 5, 1, 1, 1, 1, 1, 1, 5, 1, 1, 5, 1, 5, 1},
    {1, 5, 1, 1, 5, 1, 1, 5, 1, 1, 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 1, 1, 5, 5, 5, 1},
    {1, 5, 1, 1, 5, 5, 5, 5, 1, 1, 1, 5, 1, 1, 1, 5, 1, 1, 1, 1, 1, 1, 5, 1, 1, 5, 1, 1, 1, 5, 1, 1, 1, 1, 5, 1},
    {1, 5, 5, 5, 5, 1, 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 2, 1, 2, 5, 5, 5, 5, 1, 5, 1, 1, 1, 5, 1, 1, 1, 1, 5, 1},
    {1, 5, 1, 1, 5, 1, 1, 5, 1, 1, 1, 5, 1, 5, 1, 1, 1, 5, 1, 5, 1, 1, 1, 5, 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 1},
    {1, 5, 1, 1, 5, 1, 1, 2, 1, 1, 1, 5, 1, 5, 1, 6, 1, 5, 2, 5, 1, 6, 1, 5, 1, 5, 1, 1, 1, 2, 1, 1, 1, 1, 5, 1},
    {1, 5, 1, 1, 5, 1, 1, 5, 1, 1, 1, 5, 1, 5, 1, 1, 1, 5, 1, 5, 1, 1, 1, 5, 5, 5, 5, 5, 5, 5, 1, 1, 1, 1, 5, 1},
    {0, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 1, 5, 5, 5, 5, 5, 1, 5, 1, 1, 1, 5, 5, 5, 5, 5, 5, 0},
    {1, 5, 1, 5, 1, 5, 1, 1, 1, 1, 1, 5, 1, 5, 1, 5, 1, 1, 1, 1, 1, 1, 5, 1, 1, 5, 1, 1, 1, 5, 1, 1, 1, 1, 5, 1},
    {1, 5, 1, 5, 1, 5, 1, 1, 1, 1, 1, 5, 1, 5, 1, 5, 5, 0, 3, 0, 3, 1, 5, 1, 1, 5, 1, 1, 1, 5, 1, 1, 1, 1, 5, 1},
    {1, 5, 1, 5, 1, 5, 5, 5, 2, 5, 5, 5, 1, 5, 1, 1, 1, 3, 0, 3, 0, 5, 5, 5, 5, 5, 1, 1, 1, 5, 5, 5, 5, 5, 5, 1},
    {1, 5, 5, 5, 1, 5, 1, 1, 1, 1, 1, 5, 1, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 1, 1, 1, 5, 1, 1, 1, 1, 5, 1},
    {1, 5, 1, 1, 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 2, 1, 1, 5, 5, 5, 1},
    {1, 5, 1, 1, 1, 1, 1, 5, 1, 1, 5, 1, 1, 1, 1, 1, 1, 1, 5, 1, 1, 1, 1, 1, 1, 1, 5, 1, 1, 1, 1, 1, 5, 1, 5, 1},
    {1, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 2, 1},
    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};
}