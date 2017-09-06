import org.knowm.xchart.CategoryChart;
        import org.knowm.xchart.CategoryChartBuilder;
        import org.knowm.xchart.SwingWrapper;
        import org.knowm.xchart.demo.charts.ExampleChart;
        import org.knowm.xchart.style.Styler;


class MyBarChart implements ExampleChart<CategoryChart> {
    Main main = new Main();

    public void showChart() {

        ExampleChart<CategoryChart> exampleChart = new MyBarChart();
        CategoryChart chart = exampleChart.getChart();
        new SwingWrapper<>(chart).displayChart();
    }

    @Override
    public CategoryChart getChart() {

        CategoryChart chart = new CategoryChartBuilder().width(1200).height(1000).title("Score Histogram").xAxisTitle("Score").yAxisTitle("Number").build();

        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
        chart.getStyler().setHasAnnotations(true);

        chart.addSeries("test 1",main.getMyArr(),main.getMyArr2());

        return chart;
    }
}
