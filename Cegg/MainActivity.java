//package Cegg;
//import android.graphics.DashPathEffect;
//import android.os.Bundle;
//import android.widget.TextView;
//import androidx.appcompat.app.AppCompatActivity;
//import com.androidplot.util.PixelUtils;
//import com.androidplot.xy.*;
//import java.text.FieldPosition;
//import java.text.Format;
//import java.text.ParsePosition;
//import java.util.Arrays;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        // Initialize our XYPlot reference: plot
//        XYPlot plot = findViewById(R.id.plot);
//
//        // Create a couple arrays of y-values to plot
//        Number[] domainLabels = {1, 2, 3, 6, 7, 8, 9, 10, 13, 14};
//        Number[] series1Numbers = {1, 4, 2, 8, 4, 16, 8, 32, 16, 64};
//        Number[] series2Numbers = {5, 2, 10, 5, 20, 10, 40, 20, 80, 40};
//
//        // Turn the above arrays into XYSeries
//        XYSeries series1 = new SimpleXYSeries(Arrays.asList(series1Numbers),
//                SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, "Series1");
//        XYSeries series2 = new SimpleXYSeries(Arrays.asList(series2Numbers),
//                SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, "Series2");
//
//        // Create formatters to use for drawing a series using LineAndPointRenderer and configure them from XML
//        LineAndPointFormatter series1Format = new LineAndPointFormatter(this,
//                R.xml.line_point_formatter_with_labels);
//        LineAndPointFormatter series2Format = new LineAndPointFormatter(this,
//                R.xml.line_point_formatter_with_labels_2);
//
//        // Add a "dash" effect to the series2 line
//        series2Format.getLinePaint().setPathEffect(new DashPathEffect(
//                new float[]{PixelUtils.dpToPix(20), PixelUtils.dpToPix(15)}, 0));
//
//        // Add some smoothing to the lines using Catmull-Rom interpolation
//        series1Format.setInterpolationParams(new CatmullRomInterpolator.Params(10,
//                CatmullRomInterpolator.Type.Centripetal));
//        series2Format.setInterpolationParams(new CatmullRomInterpolator.Params(10,
//                CatmullRomInterpolator.Type.Centripetal));
//
//        // Add series to the xyplot
//        plot.addSeries(series1, series1Format);
//        plot.addSeries(series2, series2Format);
//
//        // Customize line labels on the bottom edge of the graph
//        plot.getGraph().getLineLabelStyle(XYGraphWidget.Edge.BOTTOM).setFormat(new Format() {
//            @Override
//            public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
//                int i = Math.round(((Number) obj).floatValue());
//                return toAppendTo.append(domainLabels[i]);
//            }
//
//            @Override
//            public Object parseObject(String source, ParsePosition pos) {
//                // Not needed for this example
//                return null;
//            }
//        });
//    }
//}
