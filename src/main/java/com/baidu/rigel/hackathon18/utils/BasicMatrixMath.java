package com.baidu.rigel.hackathon18.utils;

/**
 * Created by chenhao15 on 2017/5/19.
 */
public class BasicMatrixMath {

    public Double[][] calculateSimilarCosMatrix(int[][] matrixa, int[][] matrixb) {
        // 计算余玄相似度矩阵
        Double[][] result = new Double[matrixa.length][matrixb[0].length];
        for (int i = 0; i < matrixa.length; i++) {
            for (int j = 0; j < matrixb[0].length; j++) {
                result[i][j] = calculateSingleResult(matrixa, matrixb, i, j);
            }
        }
        return result;
    }

    private Double calculateSingleResult(int[][] matrixa, int[][] matrixb, Integer row, int col) {
        // 计算一人的相似度
        Double result = 0.0;
        int length = matrixa[0].length;
        Double[] a = new Double[length];
        Double[] b = new Double[length];
        for (int i = 0; i < length; i++) {
            a[i] = Double.valueOf(matrixa[row][i]);
            b[i] = Double.valueOf(matrixb[i][col]);
        }
        return similarCos(a, b);
    }

    private Double pointMulti(Double[] a, Double[] b) {
        // 向量内积
        Double result = 0.0;
        for (int i = 0; i < a.length; i++) {
            result += a[i] * b[i];
        }
        return result;
    }

    private Double vectorLength(Double[] a) {
        // 向量长度
        Double result = 0.0;
        for (int i = 0; i < a.length; i++) {
            result += a[i] * a[i];
        }
        return Math.sqrt(result);
    }

    private Double similarCos(Double[] a, Double[] b) {
        // 向量余弦相似度
        Double pm = pointMulti(a, b);
        Double lm = vectorLength(a) * vectorLength(b);
        return pm / lm;
    }

    public static void main(String[] args) {
        int[][] a = new int[][] {{1, 2, 3, 4}, {2, 3, 3, 2}};
        int[][] b = new int[][] {{4, 1}, {3, 2}, {2, 3}, {1, 4}};
        BasicMatrixMath bmm = new BasicMatrixMath();
        Double[][] result = bmm.calculateSimilarCosMatrix(a, b);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print("\t" + result[i][j]);
            }
            System.out.println();
        }

    }

}
