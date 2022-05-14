package com.complementojava;

import java.awt.Color;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import com.orsoncharts.plot.CategoryPlot3D;

public class GraficoBarra extends JFrame{

	public GraficoBarra() {
		editarJanela();
	}
	
	public void editarJanela() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Grafico de Barra");
		setSize(950,700);
		setLocationRelativeTo(null);
		criarGrafico();
		setVisible(true);
	}
	
	public void criarGrafico() {
		DefaultCategoryDataset barra = new DefaultCategoryDataset();
		barra.setValue(1400, "China", "");
		barra.setValue(1200, "India", "");
		barra.setValue(320, "EUA", "");
		barra.setValue(210, "Brasil", "");
		barra.setValue(115, "Jap�o", "");
		barra.setValue(30, "Austr�lia", "");
		barra.setValue(18, "Portugal", "");
		
		JFreeChart grafico = ChartFactory.createBarChart3D(
				"Popula��o Mundial","Paises","Milhoes",barra,PlotOrientation.VERTICAL,true,true,false);
		
		CategoryPlot barraItem = grafico.getCategoryPlot();
		barraItem.getRenderer().setSeriesPaint(0, Color.BLACK);
		barraItem.getRenderer().setSeriesPaint(4, Color.WHITE);
		
		ChartPanel painel = new ChartPanel(grafico);
		add(painel);
	}
	
	public static void main(String[] args) {
		
		new GraficoBarra();
		
	}

}
