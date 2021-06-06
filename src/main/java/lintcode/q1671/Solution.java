package lintcode.q1671;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.*;

public class Solution {
    private ChartFrame mChartFrame;
    private DefaultCategoryDataset mDataset = new DefaultCategoryDataset();
    private JFreeChart mChart;

    public Solution() {
        mChart = ChartFactory.createLineChart(
                "剩余次数",//图名字
                "id",//横坐标
                "剩余次数",//纵坐标
                mDataset,//数据集
                PlotOrientation.VERTICAL,
                true, // 显示图例
                true, // 采用标准生成器
                false);// 是否生成超链接
        mChartFrame = new ChartFrame("折线图", mChart);
        mChartFrame.pack();

        CategoryPlot mPlot = (CategoryPlot) mChart.getPlot();
        mPlot.setBackgroundPaint(Color.LIGHT_GRAY);
        mPlot.setRangeGridlinePaint(Color.BLUE);//背景底部横虚线
        mPlot.setOutlinePaint(Color.RED);//边界线
    }

    private void draw(int[] A) {
        mDataset.clear();
        for (int i = 0; i < A.length; i++) {
            mDataset.addValue(A[i], "times", "" + i);
        }
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param A:
     * @return: nothing
     */
    public long playGames(int[] A) {
        // Write your code here

        mChartFrame.setVisible(true);
        //Arrays.sort(A);
        long counter = 0;
        while (!allMinus(A)) {
            draw(A);
            int judge = chooseMin(A);
            for (int i = 0; i < A.length; i++) {
                if (i != judge) {
                    A[i]--;
                }
            }
            counter++;
        }
        mChartFrame.setVisible(false);
        return counter;
    }

    boolean allMinus(int[] A) {
        for (int v : A) {
            if (v > 0) {
                return false;
            }
        }
        return true;
    }

    int chooseMin(int[] A) {
        int index = 0, min = A[index];
        for (int i = 1; i < A.length; i++) {
            if (A[i] < min) {
                min = A[i];
                index = i;
            }
        }
        return index;
    }
}
